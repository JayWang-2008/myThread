package com.JayWang.itheima_04;
public class ThreadDemo04 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        t.start();
    }

}
