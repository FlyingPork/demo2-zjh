package com.example.demo.Controller.User;

import com.example.demo.domain.ShoppingCart;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyShoppingCartController {
    @RequestMapping(value = "/MyShoppingCart", method = RequestMethod.GET)
    public String MyShoppingCart(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");


        if(UserID.equals("")){
            String ProductID = request.getParameter("ProductID");
            String ShopID = request.getParameter("ShopID");

            model.addAttribute("ShopID", ShopID);
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            return "/byffff/Product";
        }





        /*用了假数据类，到时候要修改*/
        List<ShoppingCart> ShoppingCartList = new ArrayList<ShoppingCart>();
        for(int i = 0; i < GlobalShoppingCart.GlobalShoppingCarts.size(); i++){
            if(GlobalShoppingCart.GlobalShoppingCarts.get(i).getUserId() == Integer.parseInt(UserID)){
                ShoppingCartList.add(GlobalShoppingCart.GlobalShoppingCarts.get(i));
            }
        }

        if(ShoppingCartList.size() == 0){
            model.addAttribute("UserID", UserID);
            return "/byffff/ShoppingCart";
        }

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        List<String> DateList = new ArrayList<String>();
        for(int i = 0; i < ShoppingCartList.size(); i++){
            DateList.add(sdf.format(ShoppingCartList.get(i).getCreatetime()));
        }

        List<String> AmountList = new ArrayList<String>();
        for(int i = 0; i < ShoppingCartList.size(); i++){
            AmountList.add(String.valueOf(ShoppingCartList.get(i).getProductAmount()));
        }
        List<String> ProductIDList = new ArrayList<String>();
        for(int i = 0; i < ShoppingCartList.size(); i++){
            ProductIDList.add(String.valueOf(ShoppingCartList.get(i).getProductId()));
        }



        model.addAttribute("UserID", UserID);
        model.addAttribute("DateList", DateList);
        model.addAttribute("AmountList", AmountList);
        model.addAttribute("ProductList", ProductIDList);

        return "/byffff/ShoppingCart";


    }
}
