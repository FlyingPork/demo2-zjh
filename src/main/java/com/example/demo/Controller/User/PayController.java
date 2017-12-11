package com.example.demo.Controller.User;

import com.example.demo.domain.Trade;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class PayController {
    @RequestMapping(value = "/Pay",method = RequestMethod.GET)
    public String Pay(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");
        String ShopID = request.getParameter("ShopID");
        String ProductID = request.getParameter("ProductID");
        String UnitPrice = request.getParameter("UnitPrice");
        String ProductAmount = request.getParameter("ProductAmount");
        String Total = request.getParameter("Total");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String PayWay = request.getParameter("PayWay");

        if(account.equals("") || password.equals("") || address.equals("")){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);
            model.addAttribute("UnitPrice", UnitPrice);
            model.addAttribute("ProductAmount", ProductAmount);
            model.addAttribute("Total", Total);
            model.addAttribute("account", account);
            model.addAttribute("password", password);
            return "/byffff/Pay";
        }


        Trade newTrade = new Trade();
        newTrade.setTradeId(1);
        newTrade.setAddressId(address);
        newTrade.setFeedbackRemarks("");
        Date now = new Date();
        newTrade.setTradeCreateTime(now);
        newTrade.setTradeStatus(0);
        newTrade.setTradeTotalMoney(Double.parseDouble(Total));
        newTrade.setUserId(Integer.parseInt(UserID));
        newTrade.setSellerId(Integer.parseInt(ProductID));
        newTrade.setTradePayWay(PayWay);
        GlobalShoppingCart.GlobalTrades.add(newTrade);


        model.addAttribute("UserID", UserID);
        return "/byffff/Success";
    }
}
