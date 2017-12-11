package com.example.demo.Controller.User;


import com.example.demo.domain.Favorite;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddIntoFavoritePController {
    @RequestMapping(value = "/AddIntoFavoriteP",method = RequestMethod.GET)
    public String AddIntoFavoriteP(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");
        String ShopID = request.getParameter("ShopID");
        String ProductID = request.getParameter("ProductID");

        if(UserID.equals("")){
            model.addAttribute("UserID", UserID);
            model.addAttribute("ShopID", ShopID);
            model.addAttribute("ProductID", ProductID);
            System.out.println("no");
            return "/byffff/Product";
        }

        for(int i = 0; i < GlobalShoppingCart.GlobalFavorites.size(); i++){
            if(GlobalShoppingCart.GlobalFavorites.get(i).getUserID() == Integer.parseInt(UserID) && GlobalShoppingCart.GlobalFavorites.get(i).getShopID().equals(ShopID) && GlobalShoppingCart.GlobalFavorites.get(i).getProductID().equals(ProductID)){
                model.addAttribute("UserID", UserID);
                model.addAttribute("ShopID", ShopID);
                model.addAttribute("ProductID", ProductID);
                System.out.println("no");
                return "/byffff/Product";
            }
        }

        Favorite favorite = new Favorite();
        favorite.setUserID(Integer.parseInt(UserID));
        favorite.setFavoriteID(1);
        favorite.setProductID(ProductID);
        favorite.setShopID(ShopID);
        GlobalShoppingCart.GlobalFavorites.add(favorite);

        System.out.println("ok");
        model.addAttribute("UserID", UserID);
        model.addAttribute("ProductID", ProductID);
        model.addAttribute("ShopID", ShopID);
        return "/byffff/Product";
    }
}
