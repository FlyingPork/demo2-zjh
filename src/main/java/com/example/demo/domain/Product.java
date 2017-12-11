package com.example.demo.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;


//@Entity
//@Table(name = "t_product")
public class Product {


	public int productId;
	//private String brandName;
	//private int firstPageModule;
	//private Boolean isOnSale;
	//private String productBriefInfo;
	//private double productMarketPrice;
	public String productName;
	public String productPhoto;
	//private int productStock;
	public double productTradePrice;
	//private String size;
	public String type;

	public Product(int id, String name, String photo, double price, String ty){
		productId = id;
		productName = name;
		productPhoto = photo;
		productTradePrice = price;
		type = ty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPhoto() {
		return productPhoto;
	}

	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}

	public double getProductTradePrice() {
		return productTradePrice;
	}

	public void setProductTradePrice(double productTradePrice) {
		this.productTradePrice = productTradePrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
//private List<ShoppingCart> shoppingcarts;
	



	/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getFirstPageModule() {
		return firstPageModule;
	}
	public void setFirstPageModule(int firstPageModule) {
		this.firstPageModule = firstPageModule;
	}
	public Boolean getIsOnSale() {
		return isOnSale;
	}
	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}
	public String getProductBriefInfo() {
		return productBriefInfo;
	}
	public void setProductBriefInfo(String productBriefInfo) {
		this.productBriefInfo = productBriefInfo;
	}
	public double getProductMarketPrice() {
		return productMarketPrice;
	}
	public void setProductMarketPrice(double productMarketPrice) {
		this.productMarketPrice = productMarketPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPhoto() {
		return productPhoto;
	}
	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	public double getProductTradePrice() {
		return productTradePrice;
	}
	public void setProductTradePrice(double productTradePrice) {
		this.productTradePrice = productTradePrice;
	}
	public String getSize() { return size; }
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	*/
	/*
	@OneToMany(mappedBy="product")
	@JsonIgnore
	public List<ShoppingCart> getShoppingcarts() {
		return this.shoppingcarts;
	}

	public void setShoppingcarts(List<ShoppingCart> shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

	public ShoppingCart addShoppingcart(ShoppingCart shoppingcart) {
		getShoppingcarts().add(shoppingcart);
		shoppingcart.setProduct(this);

		return shoppingcart;
	}

	public ShoppingCart removeShoppingcart(ShoppingCart shoppingcart) {
		getShoppingcarts().remove(shoppingcart);
		shoppingcart.setProduct(null);

		return shoppingcart;
	}
	*/
	
}
