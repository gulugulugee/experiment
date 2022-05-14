package com.experiment07;

import java.util.concurrent.CountDownLatch;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        test();
    }

    private static void test() throws InterruptedException {
        TrainOutLet t1 = new TrainOutLet("南岗区售票点");
        TrainOutLet t2 = new TrainOutLet("香坊区售票点");
        TrainOutLet t3 = new TrainOutLet("开发区售票点");
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(() -> {
            while (t1.sell() != null) {
            }
            latch.countDown();
        }).start();
        new Thread(() -> {
            while (t2.sell() != null) {
            }
            latch.countDown();
        }).start();
        new Thread(() -> {
            while (t3.sell() != null) {
            }
            latch.countDown();
        }).start();

        latch.await();

        System.out.println(t1.getName() + ":" + t1.getCount());
        System.out.println(t2.getName() + ":" + t2.getCount());
        System.out.println(t3.getName() + ":" + t3.getCount());
    }
}

