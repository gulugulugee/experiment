package com;

import java.util.List;



public class CreatCEP {
    public static void creatCEPimg(List<Order> orderList) {
        double[] CEP = new double[30];
        CEP = creatCEP(orderList);
//        showCEP(CEP);
        char[][] c = new char[30][30];

    }

    private static double[] creatCEP(List<Order> orderList) {
        double[] CEP = new double[30];
        for (int i = 0; i < 30; i++) {
            double tmp = 0;
            for (int j = i; j > i - 15 && j >= 0; j--) {
                tmp = tmp + orderList.get(j).getPrice();
            }
            if (i <= 14)
                CEP[i] = tmp / (i + 1);
            if (i >= 15)
                CEP[i] = tmp / 15;
        }
        return CEP;
    }

    public static void showCEP(double[] CEP) {
        for (int i = 0; i < 30; i++) {
            System.out.println(CEP[i]);
        }
    }




    }

