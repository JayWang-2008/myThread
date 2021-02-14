package com.JayWang.itheima_01;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt1 = new MyThread();
        mt.start();
        mt1.start();
    }
}
