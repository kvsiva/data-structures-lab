package com.sv.bigodemo;
/*
O(log n) - logarithmic - Pretty great.  These kinds of algorithms halve the amount of the data with each iteration.
If you have 100 items, it takes about 7 steps to find the answer. With 1000 items,
it takes 10 steps.  And 1,000,000 items only take 20 steps.
This is super-fast  even for large amounts of data.  E.g.: binary search.
 */
public class BigOLab2 {
    public static void main(String[] args){
        int n=100;
        for(int i=1;i<n;i=i*2)
        {
            System.out.println("Hi - The value of i:"+i);
        }
    }
}
