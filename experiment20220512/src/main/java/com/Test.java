package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList = DataIn.userInput();
        Loading.load(userList);
        /*for (User u :
                userList) {
            System.out.println(u.getUid()+","+u.getUname());
        }

        List<Commodity> commodityList = new ArrayList<>();
        commodityList = DataIn.commodityInput();
        for (Commodity c :
                commodityList) {
            System.out.println(c.getCid()+","+c.getName());
        }

        List<Order> orderList = new ArrayList<>();
        orderList = DataIn.orderInput();
        for (Order o :
                orderList) {
            System.out.println(o.getOid()+","+o.getPrice()+","+o.getDate());
        }
        CreatCEP.creatCEPimg(orderList);*/

    }
}
