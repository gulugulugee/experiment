package com.experiment07;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TrainOutLet {
    private String name;
    private List<Ticket> tickets = new LinkedList<>();
    private static final Random random = new Random();

    public TrainOutLet(String name){
        this.name = name;
    }

    public Ticket sell(){
        Ticket ticket = TrainDepartment.getTicket();
        if(ticket!=null){
            try {
                Thread.sleep(random.nextInt(50));
                tickets.add(ticket);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return ticket;
    }
    public int getCount(){
        return tickets.size();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
