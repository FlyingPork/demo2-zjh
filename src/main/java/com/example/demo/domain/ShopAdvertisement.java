package com.example.demo.domain;

import javax.sound.sampled.Line;

public class ShopAdvertisement {

    public int AdvertisementID;
    public int ShopID;
    public String Information;

    public ShopAdvertisement(int ad_id, int shop_id, String info){
        AdvertisementID = ad_id;
        ShopID = shop_id;
        Information = info;
    }

    public int getAdvertisementID() {
        return AdvertisementID;
    }

    public void setAdvertisementID(int advertisementID) {
        AdvertisementID = advertisementID;
    }

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }
}
