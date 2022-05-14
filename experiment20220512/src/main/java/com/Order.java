package com;

public class Order {
    private int oid;
    private int buyId;
    private int sellId;
    private int cid;
    private double price;
    private int date;

    public Order(int oid, int buyId, int sellId, int cid, double price, int date) {
        this.oid = oid;
        this.buyId = buyId;
        this.sellId = sellId;
        this.cid = cid;
        this.price = price;
        this.date = date;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getBuyId() {
        return buyId;
    }

    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    public int getSellId() {
        return sellId;
    }

    public void setSellId(int sellId) {
        this.sellId = sellId;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Order() {
    }
}
