package com.JayWang.itheima_06;

public class Customer implements Runnable{
    private Box b = new Box();

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run(){
        while (true){
            b.get();
        }
    }
}
