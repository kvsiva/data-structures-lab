package com.sv.threaddemo;

public class Test {

    public static void main(String args[]) {

        Thread otherThread = new Thread() {
            public void run() {
                System.out.println("Sleeping ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted.");
                }
                System.out.println("Throwing exception ...");
                throw new RuntimeException();
            }
        };
        try {
            otherThread.start();
        }catch (RuntimeException re){
            System.out.println("Exception:"+re);
        }

    }

}
