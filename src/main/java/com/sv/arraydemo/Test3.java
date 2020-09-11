package com.sv.arraydemo;

public class Test3 implements Runnable{
    private int x;
    private int y;
    @Override
    public synchronized void run() {
        for(;;){
            x++;
            y++;
            System.out.println("x= "+x+"y= "+y);
        }

    }
    public static void main(String args[]){
        Test3 test= new Test3();
        (new Thread(test)).start();
        (new Thread(test)).start();

    }
}
