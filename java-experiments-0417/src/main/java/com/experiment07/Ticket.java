package com.experiment07;

public class Ticket {
    private int id;
    private String from;
    private String to;

    public Ticket() {
    }

    public Ticket(int price, String from, String to) {
        this.id = price;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
