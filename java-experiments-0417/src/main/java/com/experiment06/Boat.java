package com.experiment06;

public class Boat {
   private int id;
   private String name;
   private int maxw;
   private int maxn;

    public Boat(int id, String name, int maxw, int maxn) {
        this.id = id;
        this.name = name;
        this.maxw = maxw;
        this.maxn = maxn;
    }

    public Boat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxw() {
        return maxw;
    }

    public void setMaxw(int maxw) {
        this.maxw = maxw;
    }

    public int getMaxn() {
        return maxn;
    }

    public void setMaxn(int maxn) {
        this.maxn = maxn;
    }
}
