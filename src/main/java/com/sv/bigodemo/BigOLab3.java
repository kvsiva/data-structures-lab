package com.sv.bigodemo;

/*
O(n) - linear - Good performance. If you have 100 items, this does 100 units of work.
Doubling the number of items makes the algorithm takes exactly twice as long (200 units of work).
 E.g.: sequential search
 */
public class BigOLab3 {
    public static void main(String[] args){
        int n=100;
        for(int i=1;i<n;i++)
        {
            System.out.println("Hi - The value of i:"+i);
        }
    }
}
