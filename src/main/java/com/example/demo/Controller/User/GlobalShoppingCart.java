package com.example.demo.Controller.User;

import com.example.demo.domain.Favorite;
import com.example.demo.domain.ShoppingCart;
import com.example.demo.domain.Trade;


import java.util.ArrayList;
import java.util.List;

public class GlobalShoppingCart {
    static List<ShoppingCart> GlobalShoppingCarts = new ArrayList<ShoppingCart>();
    static List<Favorite> GlobalFavorites = new ArrayList<Favorite>();
    static List<Trade> GlobalTrades = new ArrayList<Trade>();
}
