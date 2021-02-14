package com.JayWang.itheima_06;

public class Box {
    private int milk;
    private boolean state = false;
    public synchronized void put(int milk){
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.milk = milk;
        state = true;
        System.out.println("送奶员往奶箱中放入了"+milk+"瓶牛奶");
        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我取了"+milk+"瓶牛奶");
        state = false;

        notifyAll();
    }
}
