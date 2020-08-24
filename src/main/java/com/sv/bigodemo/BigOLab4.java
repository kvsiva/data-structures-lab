package com.sv.bigodemo;

/*
O(n log (n)) - linearithmic - Decent performance.
This is slightly worse than linear but not bad. E.g.: the fastest general-purpose sorting algorithms.
 */
public class BigOLab4 {
    public static void main(String[] args){
        int n=2;
        for(int i=1;i<n;i++)
        for(int j=1;j<8;j=j*2)
        {
            System.out.println("Hi - The value of i: "+i+ " and j: "+j );
        }
    }
}
