package com;

import java.awt.*;

public class Commodity {
    public enum type {
        NR, SrUr, Hrutr, Ser, pser;
    }

    private int cid;
    private String name;
    private int sellId;
    private type type;
    private double price;

    public Commodity(int cid, String name, int sellId, Commodity.type type, double price) {
        this.cid = cid;
        this.name = name;
        this.sellId = sellId;
        this.type = type;
        this.price = price;
    }

    public Commodity() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellId() {
        return sellId;
    }

    public void setSellId(int sellId) {
        this.sellId = sellId;
    }

    public Commodity.type getType() {
        return type;
    }

    public void setType(Commodity.type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
