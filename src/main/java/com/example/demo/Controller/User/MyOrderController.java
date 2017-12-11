package com.example.demo.Controller.User;

import com.example.demo.domain.Trade;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyOrderController {
    @RequestMapping(value = "/MyOrder",method = RequestMethod.GET)
    public String MyOrder(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");

        if(UserID.equals("")){
            String ProductID = request.getParameter("ProductID");
            String ShopID = request.getParameter("ShopID");

            model.addAttribute("ShopID", ShopID);
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            return "/byffff/Product";
        }

        List<Trade> MyOrder = new ArrayList<Trade>();
        for(int i = 0; i < GlobalShoppingCart.GlobalTrades.size(); i++){
            if(GlobalShoppingCart.GlobalTrades.get(i).getUserId() == Integer.parseInt(UserID)){
                MyOrder.add(GlobalShoppingCart.GlobalTrades.get(i));
            }
        }
        if(MyOrder.size() == 0){
            model.addAttribute("UserID", UserID);
            return "/byffff/MyOrder";
        }

        List<String> ProductList = new ArrayList<String>();
        List<String> Price = new ArrayList<String>();
        List<String> PayWay = new ArrayList<String>();
        List<String> CreateTime = new ArrayList<String>();
        List<String> Status = new ArrayList<String>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        for(int i = 0; i < MyOrder.size(); i++){
            ProductList.add(String.valueOf(MyOrder.get(i).getSellerId()));
            Price.add(String.valueOf(MyOrder.get(i).getTradeTotalMoney()));
            PayWay.add(MyOrder.get(i).getTradePayWay());
            CreateTime.add(sdf.format(MyOrder.get(i).getTradeCreateTime()));
            if(MyOrder.get(i).getTradeStatus() == 0)
                Status.add("Unfinished");
        }

        model.addAttribute("UserID", UserID);
        model.addAttribute("ProductList", ProductList);
        model.addAttribute("price", Price);
        model.addAttribute("payway",PayWay);
        model.addAttribute("createtime", CreateTime);
        model.addAttribute("status", Status);

        return "/byffff/MyOrder";
    }
}
