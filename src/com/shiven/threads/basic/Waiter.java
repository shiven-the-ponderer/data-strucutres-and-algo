package com.shiven.threads.basic;

public class Waiter implements Runnable{
    
    private Message msg;
    
    public Waiter(Message message) {
        this.msg = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name+" waiting to get notified at time: "+System.currentTimeMillis());
                msg.wait();
            }
            catch(InterruptedException exception) {
                exception.printStackTrace();
            }
            
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
        }
    }
    
    

}
