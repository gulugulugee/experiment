package com;

import java.util.List;
import java.util.Scanner;

public class Loading {
   public static void load(List<User> userList){
       System.out.println("-----请输入账号，固定为9位整数-----");
       Scanner in = new Scanner(System.in);
       int account = in.nextInt();
       int flag = 0;
       int tmp = account;
       while (tmp != 0){
           tmp = tmp/10;
           flag++;
       }
       if (flag == 9){
           flag = 0;
           System.out.println("-----请输入密码，固定为9位整数------");
           int keyword = in.nextInt();
           tmp = keyword;
           while (tmp != 0){
               tmp = tmp/10;
               flag++;
           }
           if (flag == 9){

               tmp = account;
               for (int i = 0; i < 8; i++) {
                   tmp = tmp/10;
               }

               for (User user : userList) {
                   if (user.getAccount() == account && user.getKeyWord() == keyword) {
                       if (tmp == 1) {
                           System.out.println("用户登陆成功");
                           break;
                       }
                       if (tmp == 2) {
                           System.out.println("管理员登陆成功");
                           break;
                       }
                       System.out.println("账号或密码输入错误");
                   }
               }
           }else {
               System.out.println("输入位数错误");
           }
       }else {
           System.out.println("输入位数错误");
       }
   }
}
