package com.JayWang.itheima_06;

public class SellBuyDemo {
    public static void main(String[] args) {
        Box b = new Box();
        Thread s1 = new Thread(new Customer(b));
        Thread s2 = new Thread(new Producter(b));
        s1.start();
        s2.start();
    }
}
