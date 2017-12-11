package com.example.demo.domain;

import java.util.Date;


public class Trade {

    private int tradeId;
    private String addressId;
    private String feedbackRemarks;
    private Date tradeCreateTime;
    private Date tradeFinishTime;
    private String tradePayWay;
    private int tradeStatus;
    private double tradeTotalMoney;
    private int userId;
    private int sellerId;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int type;

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getFeedbackRemarks() {
        return feedbackRemarks;
    }

    public void setFeedbackRemarks(String feedbackRemarks) {
        this.feedbackRemarks = feedbackRemarks;
    }

    public Date getTradeCreateTime() {
        return tradeCreateTime;
    }

    public void setTradeCreateTime(Date tradeCreateTime) {
        this.tradeCreateTime = tradeCreateTime;
    }

    public Date getTradeFinishTime() {
        return tradeFinishTime;
    }

    public void setTradeFinishTime(Date tradeFinishTime) {
        this.tradeFinishTime = tradeFinishTime;
    }

    public String getTradePayWay() {
        return tradePayWay;
    }

    public void setTradePayWay(String tradePayWay) {
        this.tradePayWay = tradePayWay;
    }

    public int getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(int tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public double getTradeTotalMoney() {
        return tradeTotalMoney;
    }

    public void setTradeTotalMoney(double tradeTotalMoney) {
        this.tradeTotalMoney = tradeTotalMoney;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

