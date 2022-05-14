package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataIn {
    public static List<User> userInput() {
        List<User> userList = new ArrayList<>();
        User u1 = new User(20220101, "用户1", 120220101, 120220101);
        User u2 = new User(20220102, "用户2", 120220102, 120220102);
        User u3 = new User(20220103, "用户3", 120220103, 120220103);
        User u4 = new User(20220104, "用户4", 120220104, 120220104);
        User u5 = new User(20220105, "用户5", 120220105, 120220105);
        User u6 = new User(20220106, "用户6", 120220106, 120220106);
        User u7 = new User(20220107, "用户7", 120220107, 120220107);
        User u8 = new User(20220108, "用户8", 120220108, 120220108);
        User u9 = new User(20220109, "用户9", 120220109, 120220109);
        User u10 = new User(20220110, "用户10", 120220110, 120220110);
        User u11 = new User(20220111, "用户11", 120220111, 120220111);
        User u12 = new User(20220112, "用户12", 120220112, 120220112);
        User u13 = new User(20220113, "用户13", 120220113, 120220113);
        User u14 = new User(20220114, "用户14", 120220114, 120220114);
        User u15 = new User(20220115, "用户15", 120220115, 120220115);

        User u16 = new User(20220116, "用户16", 220220116, 220220116);
        User u17 = new User(20220117, "用户17", 220220117, 220220117);
        User u18 = new User(20220118, "用户18", 220220118, 220220118);
        User u19 = new User(20220119, "用户19", 220220119, 220220119);
        User u20 = new User(20220120, "用户20", 220220120, 220220120);

        userList.addAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20));

        return userList;
    }

    public static List<Commodity> commodityInput() {
        List<Commodity> commodityList = new ArrayList<>();
        Commodity[] c = new Commodity[40];
//        1-20
        c[0] = new Commodity(11111101, "商品1", 20220101, Commodity.type.NR, 500);
        c[1] = new Commodity(11111102, "商品2", 20220101, Commodity.type.SrUr, 400);
        c[2] = new Commodity(11111103, "商品3", 20220101, Commodity.type.pser,500);
        c[3] = new Commodity(11111104, "商品4", 20220101, Commodity.type.Hrutr,100);
        c[4] = new Commodity(11111105, "商品5", 20220102, Commodity.type.SrUr,50);
        c[5] = new Commodity(11111106, "商品6", 20220102, Commodity.type.NR,99);
        c[6] = new Commodity(11111107, "商品7", 20220102, Commodity.type.Ser,11);
        c[7] = new Commodity(11111108, "商品8", 20220103, Commodity.type.Hrutr,123);
        c[8] = new Commodity(11111109, "商品9", 20220104, Commodity.type.pser,88);
        c[9] = new Commodity(11111110, "商品10", 20220105, Commodity.type.pser,187);
        c[10] = new Commodity(11111111, "商品11", 20220104, Commodity.type.SrUr,85);
        c[11] = new Commodity(11111112, "商品12", 20220105, Commodity.type.Ser,33);
        c[12] = new Commodity(11111113, "商品13", 20220106, Commodity.type.Ser,73);
        c[13] = new Commodity(11111114, "商品14", 20220108, Commodity.type.NR,27);
        c[14] = new Commodity(11111115, "商品15", 20220110, Commodity.type.pser,84);
        c[15] = new Commodity(11111116, "商品16", 20220111, Commodity.type.Hrutr,233);
        c[16] = new Commodity(11111117, "商品17", 20220109, Commodity.type.NR,78);
        c[17] = new Commodity(11111118, "商品18", 20220111, Commodity.type.SrUr,96);
        c[18] = new Commodity(11111119, "商品19", 20220113, Commodity.type.NR,23);
        c[19] = new Commodity(11111120, "商品20", 20220114, Commodity.type.pser,17);
        c[20] = new Commodity(11111121, "商品1", 20220113, Commodity.type.Ser,29);
        c[21] = new Commodity(11111122, "商品2", 20220114, Commodity.type.SrUr,36);
        c[22] = new Commodity(11111123, "商品3", 20220104, Commodity.type.NR,89);
        c[23] = new Commodity(11111124, "商品4", 20220103, Commodity.type.SrUr,78);
        c[24] = new Commodity(11111125, "商品5", 20220102, Commodity.type.Hrutr,26);
        c[25] = new Commodity(11111126, "商品6", 20220112, Commodity.type.SrUr,75);
        c[26] = new Commodity(11111127, "商品7", 20220103, Commodity.type.Hrutr,236);
        c[27] = new Commodity(11111128, "商品8", 20220102, Commodity.type.SrUr,78);
        c[28] = new Commodity(11111129, "商品9", 20220104, Commodity.type.NR,146);
        c[29] = new Commodity(11111130, "商品10", 20220114, Commodity.type.SrUr,782);
        c[30] = new Commodity(11111131, "商品11", 20220106, Commodity.type.NR,23);
        c[31] = new Commodity(11111132, "商品12", 20220106, Commodity.type.SrUr,14);
        c[32] = new Commodity(11111133, "商品13", 20220107, Commodity.type.NR,63);
        c[33] = new Commodity(11111134, "商品14", 20220109, Commodity.type.Ser,15);
        c[34] = new Commodity(11111135, "商品15", 20220108, Commodity.type.Ser,78);
        c[35] = new Commodity(11111136, "商品16", 20220108, Commodity.type.SrUr,27);
        c[36] = new Commodity(11111137, "商品17", 20220113, Commodity.type.Hrutr,37);
        c[37] = new Commodity(11111138, "商品18", 20220107, Commodity.type.SrUr,49);
        c[38] = new Commodity(11111139, "商品19", 20220109, Commodity.type.Ser,15);
        c[39] = new Commodity(11111140, "商品20", 20220107, Commodity.type.SrUr,78);

        for (int i = 0; i < 40; i++) {
            commodityList.add(c[i]);
        }

        return commodityList;
    }

    public static List<Order> orderInput() {
        List<Order> orderList = new ArrayList<>();
        Order[] o = new Order[60];
        o[0] = new Order(11111101, 20220104, 20220101, 11111101, 200, 1);
        o[1] = new Order(11111102, 20220104, 20220101, 11111101, 333, 2);
        o[2] = new Order(11111103, 20220104, 20220101, 11111101, 285, 3);
        o[3] = new Order(11111104, 20220104, 20220101, 11111101, 212, 4);
        o[4] = new Order(11111105, 20220104, 20220101, 11111101, 288, 5);
        o[5] = new Order(11111106, 20220104, 20220101, 11111101, 266, 6);
        o[6] = new Order(11111107, 20220104, 20220101, 11111101, 281, 7);
        o[7] = new Order(11111108, 20220104, 20220101, 11111101, 212, 8);
        o[8] = new Order(11111109, 20220104, 20220101, 11111101, 245, 9);
        o[9] = new Order(11111110, 20220104, 20220101, 11111101, 256, 10);

        o[10] = new Order(11111111, 20220104, 20220101, 11111101, 156, 11);
        o[11] = new Order(11111112, 20220104, 20220101, 11111101, 178, 12);
        o[12] = new Order(11111113, 20220104, 20220101, 11111101, 109, 13);
        o[13] = new Order(11111114, 20220104, 20220101, 11111101, 157, 14);
        o[14] = new Order(11111115, 20220104, 20220101, 11111101, 123, 15);
        o[15] = new Order(11111116, 20220104, 20220101, 11111101, 178, 16);
        o[16] = new Order(11111117, 20220104, 20220101, 11111101, 123, 17);
        o[17] = new Order(11111118, 20220104, 20220101, 11111101, 145, 18);
        o[18] = new Order(11111119, 20220104, 20220101, 11111101, 109, 19);
        o[19] = new Order(11111120, 20220104, 20220101, 11111101, 148, 20);

        o[20] = new Order(11111121, 20220104, 20220101, 11111101, 456, 21);
        o[21] = new Order(11111122, 20220104, 20220101, 11111101, 578, 22);
        o[22] = new Order(11111123, 20220104, 20220101, 11111101, 479, 23);
        o[23] = new Order(11111124, 20220104, 20220101, 11111101, 892, 24);
        o[24] = new Order(11111125, 20220104, 20220101, 11111101, 348, 25);
        o[25] = new Order(11111126, 20220104, 20220101, 11111101, 472, 26);
        o[26] = new Order(11111127, 20220104, 20220101, 11111101, 395, 27);
        o[27] = new Order(11111128, 20220104, 20220101, 11111101, 412, 28);
        o[28] = new Order(11111129, 20220104, 20220101, 11111101, 378, 29);
        o[29] = new Order(11111130, 20220104, 20220101, 11111101, 781, 30);

        //------------------------------------------------------------------------------------------------------

        o[30] = new Order(11111131, 20220104, 20220102, 11111107, 20, 1);
        o[31] = new Order(11111132, 20220104, 20220102, 11111107, 33, 2);
        o[32] = new Order(11111133, 20220104, 20220102, 11111107, 25, 3);
        o[33] = new Order(11111134, 20220104, 20220102, 11111107, 22, 4);
        o[34] = new Order(11111135, 20220104, 20220102, 11111107, 28, 5);
        o[35] = new Order(11111136, 20220104, 20220102, 11111107, 26, 6);
        o[36] = new Order(11111137, 20220104, 20220102, 11111107, 21, 7);
        o[37] = new Order(11111138, 20220104, 20220102, 11111107, 22, 8);
        o[38] = new Order(11111139, 20220104, 20220102, 11111107, 25, 9);
        o[39] = new Order(11111140, 20220104, 20220102, 11111107, 26, 10);

        o[40] = new Order(11111141, 20220104, 20220102, 11111107, 16, 11);
        o[41] = new Order(11111142, 20220104, 20220102, 11111107, 18, 12);
        o[42] = new Order(11111143, 20220104, 20220102, 11111107, 19, 13);
        o[43] = new Order(11111144, 20220104, 20220102, 11111107, 17, 14);
        o[44] = new Order(11111145, 20220104, 20220102, 11111107, 13, 15);
        o[45] = new Order(11111146, 20220104, 20220102, 11111107, 18, 16);
        o[46] = new Order(11111147, 20220104, 20220102, 11111107, 13, 17);
        o[47] = new Order(11111148, 20220104, 20220102, 11111107, 15, 18);
        o[48] = new Order(11111149, 20220104, 20220102, 11111107, 19, 19);
        o[49] = new Order(11111150, 20220104, 20220102, 11111107, 18, 20);

        o[50] = new Order(11111151, 20220104, 20220102, 11111107, 46, 21);
        o[51] = new Order(11111152, 20220104, 20220102, 11111107, 58, 22);
        o[52] = new Order(11111153, 20220104, 20220102, 11111107, 49, 23);
        o[53] = new Order(11111154, 20220104, 20220102, 11111107, 82, 24);
        o[54] = new Order(11111155, 20220104, 20220102, 11111107, 38, 25);
        o[55] = new Order(11111156, 20220104, 20220102, 11111107, 42, 26);
        o[56] = new Order(11111157, 20220104, 20220102, 11111107, 35, 27);
        o[57] = new Order(11111158, 20220104, 20220102, 11111107, 42, 28);
        o[58] = new Order(11111159, 20220104, 20220102, 11111107, 78, 29);
        o[59] = new Order(11111160, 20220104, 20220102, 11111107, 71, 30);

        for (int i = 0; i < o.length; i++) {
            orderList.add(o[i]);
        }
        return orderList;
    }
}
