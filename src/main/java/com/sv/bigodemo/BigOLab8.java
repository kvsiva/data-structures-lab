package com.sv.bigodemo;
/*
O(n!) - factorial -Intolerably slow.  It literally takes a million years to do anything.
 */
public class BigOLab8 {
    public static void main(String[] args){
        int n=3;
        for(int i=1;i<factorial(n);i++)
        {
            System.out.println("Hi - The value of i:"+i);
        }
    }

    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
