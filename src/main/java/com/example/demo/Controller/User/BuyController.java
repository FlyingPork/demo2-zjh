package com.example.demo.Controller.User;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuyController {
    @RequestMapping(value = "/Buy",method = RequestMethod.GET)
    public String Buy(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");
        String ShopID = request.getParameter("ShopID");
        String ProductID = request.getParameter("ProductID");


        if(UserID.equals("")){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);
            return "/byffff/Product";
        }
        String UnitPrice = request.getParameter("UnitPrice");
        String ProductAmount = request.getParameter("ProductAmount");
        String Total = request.getParameter("Total");

        if(ProductAmount.equals("")||UnitPrice.equals("")){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);

            return "/byffff/Product";
        }
        if(Integer.parseInt(ProductAmount)<=0||Integer.parseInt(UnitPrice)<=0){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);

            return "/byffff/Product";
        }

        model.addAttribute("UserID", UserID);
        model.addAttribute("ProductID", ProductID);
        model.addAttribute("ShopID", ShopID);
        model.addAttribute("UnitPrice", UnitPrice);
        model.addAttribute("ProductAmount", ProductAmount);
        model.addAttribute("Total", Total);
        return "/byffff/Pay";
    }
}
