package com.example.demo.Controller.User;

import com.example.demo.domain.Favorite;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyFavoriteController {
    @RequestMapping(value = "/MyFavorite",method = RequestMethod.GET)
    public String MyFavorite(HttpServletRequest request, Model model){
        String UserID = request.getParameter("UserID");

        if(UserID.equals("")){
            String ProductID = request.getParameter("ProductID");
            String ShopID = request.getParameter("ShopID");
            model.addAttribute("UserID", UserID);
            model.addAttribute("ProductID", ProductID);
            model.addAttribute("ShopID", ShopID);
            return "/byffff/Product";
        }

        List<Favorite> FavoritelistP = new ArrayList<Favorite>();
        List<Favorite> FavoritelistS = new ArrayList<Favorite>();
        for(int i = 0; i < GlobalShoppingCart.GlobalFavorites.size(); i++){
            if(GlobalShoppingCart.GlobalFavorites.get(i).getUserID() == Integer.parseInt(UserID)){
                if(GlobalShoppingCart.GlobalFavorites.get(i).getProductID().equals("")){
                    FavoritelistS.add(GlobalShoppingCart.GlobalFavorites.get(i));
                }
                else {
                    FavoritelistP.add(GlobalShoppingCart.GlobalFavorites.get(i));
                }
            }
        }

        if(FavoritelistP.size() == 0 && FavoritelistS.size() == 0){
            model.addAttribute("UserID", UserID);
            return "/byffff/Favorite";
        }
        if(FavoritelistS.size() != 0){
            List<String> FavoriteShopID = new ArrayList<String>();
            for(int i = 0; i < FavoritelistS.size(); i++){
                FavoriteShopID.add(FavoritelistS.get(i).getShopID());
            }
            model.addAttribute("ShopList", FavoriteShopID);
        }
        if(FavoritelistP.size() != 0){
            List<String> FavoriteProductID = new ArrayList<String>();
            List<String> FavoritePShopID = new ArrayList<String>();
            for(int i = 0; i < FavoritelistP.size(); i++){
                FavoriteProductID.add(FavoritelistP.get(i).getProductID());
                FavoritePShopID.add(FavoritelistP.get(i).getShopID());
            }
            model.addAttribute("ProductList", FavoriteProductID);
            model.addAttribute("PShopList", FavoritePShopID);
        }
        model.addAttribute("UserID", UserID);
        return "/byffff/Favorite";

    }
}
