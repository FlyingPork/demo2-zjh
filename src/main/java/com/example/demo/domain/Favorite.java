package com.example.demo.domain;

public class Favorite {
    private int FavoriteID;
    private int UserID;
    private String ShopID;
    private String ProductID;

  public void setFavoriteID(int FavoriteID){
      this.FavoriteID = FavoriteID;
  }
  public int getFavoriteID(){
      return FavoriteID;
  }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setShopID(String shopID) {
        ShopID = shopID;
    }

    public String getShopID() {
        return ShopID;
    }
    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }
}
