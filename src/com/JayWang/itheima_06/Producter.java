package com.JayWang.itheima_06;

public class Producter implements Runnable{
    private Box b = new Box();

    public Producter(Box b) {
        this.b = b;
    }

    @Override
    public void run(){
        for(int i = 0;i <5;i ++){
            b.put(i + 1);
        }
    }
}
