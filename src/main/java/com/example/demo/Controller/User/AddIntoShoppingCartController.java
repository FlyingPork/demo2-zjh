package com.example.demo.Controller.User;

import com.example.demo.domain.ShoppingCart;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@Controller
public class AddIntoShoppingCartController {
    @RequestMapping(value = "/AddIntoShoppingCart", method = RequestMethod.GET)
    public String AddIntoShoppingCart(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");
        String ProductID = request.getParameter("ProductID");
        String ShopID = request.getParameter("ShopID");

        if(UserID.equals("")){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);
            System.out.println("no");
            return "/byffff/Product";
        }

        //按照逻辑需要调用数据库接口检查是否用户之前添加过购物车，等接口完成再修改，暂时先用假数据类
        for(int i = 0; i < GlobalShoppingCart.GlobalShoppingCarts.size(); i++){
            if(GlobalShoppingCart.GlobalShoppingCarts.get(i).getUserId() == Integer.parseInt(UserID) && GlobalShoppingCart.GlobalShoppingCarts.get(i).getProductId() == Integer.parseInt(ProductID)){
                model.addAttribute("UserID", UserID);
                model.addAttribute("ProductID", ProductID);
                model.addAttribute("ShopID", ShopID);
                System.out.println("no");
                return "/byffff/Product";
            }
        }

        String ProductAmount = request.getParameter("ProductAmount");
        int ProductNumber = Integer.parseInt(ProductAmount);
        if(ProductNumber <= 0){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);
            System.out.println("no");
            return "/byffff/Product";
        }

        //按照逻辑需要调用数据库接口添加一条ShoppingCart数据，等接口完成以后再修改，暂时先用假数据类
        Date now = new Date();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setShoppingcartId(1);
        shoppingCart.setCreatetime(now);
        shoppingCart.setProductAmount(ProductNumber);
        shoppingCart.setProductId(Integer.parseInt(ProductID));
        shoppingCart.setUserId(Integer.parseInt(UserID));

       GlobalShoppingCart.GlobalShoppingCarts.add(shoppingCart);

       System.out.println("ok");
        model.addAttribute("UserID", UserID);
        model.addAttribute("ProductID", ProductID);
        model.addAttribute("ShopID", ShopID);
        return "/byffff/Product";

    }
}
