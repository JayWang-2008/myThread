package com.JayWang.itheima_03;

public class MyThread03 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 1000;i ++){
            System.out.println(this.getName()+","+i);
        }
    }
}
