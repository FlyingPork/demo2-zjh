package com.example.demo.domain;

import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;

public class ProductAdvertisement {



    public int AdvertisementID;
    public int ProductID;
    public double Price;
    public int Place;
    public String Information;



    public ProductAdvertisement(int ad_id, int pro_id, double price, int place, String info){
        AdvertisementID = ad_id;
        ProductID = pro_id;
        Price = price;
        Place = place;
        Information = info;
    }

    public int getPlace() {
        return Place;
    }

    public void setPlace(int place) {
        Place = place;
    }
    public int getAdvertisementID() {
        return AdvertisementID;
    }

    public void setAdvertisementID(int advertisementID) {
        AdvertisementID = advertisementID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

}
