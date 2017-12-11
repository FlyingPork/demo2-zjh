package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;



public class ShoppingCart {

	private int shoppingcartId;
	private int productAmount;
	private int productId;
	private Date createtime;
	private int userId;

	public int getShoppingcartId() {
		return shoppingcartId;
	}

	public void setShoppingcartId(int shoppingcartId) {
		this.shoppingcartId = shoppingcartId;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
