package com.shiven.udemy.thread.basics;

public class ThreadExp implements Runnable{
    
    public int getSum(int a, int b) {
        System.out.println("this is a"+a);
        System.out.println("this is b"+b);
        return a+b;
    }

    @Override
    public void run() {
        System.out.println(getSum(3, 4));
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExp());
        Thread t2 = new Thread(new ThreadExp());
        int counter = 100;
        t1.start();
        t2.start();
        while(counter>20) {
            t2.run();
            t1.run();
            counter--;
        }
    }
    
    

}
