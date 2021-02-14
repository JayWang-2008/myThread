package com.JayWang.itheima_02;

import java.util.Scanner;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("plane");
        mt.start();
    }
}
