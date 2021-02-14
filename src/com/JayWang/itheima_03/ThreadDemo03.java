package com.JayWang.itheima_03;

public class ThreadDemo03 {
    public static void main(String[] args) throws InterruptedException {
        MyThread03 mt1 = new MyThread03();
        MyThread03 mt2 = new MyThread03();
        MyThread03 mt3 = new MyThread03();
        mt1.setName("线程1");
        mt2.setName("线程2");
        mt3.setName("线程3");
        mt2.setDaemon(true);
        mt3.setDaemon(true);
        System.out.println("线程三和线程二已设置为保护线程");
        //设置守护线程setDaemon(true);,主线程如果执行完毕，jvm退出
        mt1.start();
        mt1.join();
        mt2.start();
        mt3.start();
    }
}
