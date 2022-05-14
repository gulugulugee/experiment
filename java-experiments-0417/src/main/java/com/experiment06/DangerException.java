package com.experiment06;

public class DangerException extends Exception{

    public DangerException() {
    }

    public DangerException(String message) {
        super(message);
    }

    public static void show(int id,String name,int over) {
        System.out.println("超载 "+"船只id："+id+"船只名："+name+"超重量:"+over);
    }
}
