package com.experiment06;

import static com.experiment06.Method.all;

public class Test {
    public static void main(String[] args) {
        //给boat赋值
        Boat b =new Boat(1,"boat1",100,5);

        //给集装箱赋值
        Container[] c = new Container[5];
        for (int i = 0; i < c.length; i++) {
           c[i] = new Container(i+1,(i+1)*10);
        }

        //调用装载方法
        try {
            Method.loading(b,c);
            }
        catch (DangerException e) {
            e.show(b.getId(),b.getName(),all-b.getMaxw());
        }
        finally {
            System.out.println("货船启航 "+"货船名:"+b.getName());
        }
    }
}
