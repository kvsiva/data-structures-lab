package com.sv.bigodemo;

/*
O(n^2) - quadratic - Kinda slow.
If you have 100 items, this does 100^2=10,000 units of work.
Doubling the number of items makes it four times slower (because 2 squared equals 4).
E.g.: algorithms using nested loops, such as insertion sort.

 */
public class BigOLab5 {
    public static void main(String[] args){
        int n=10;
        for(int i=1;i<n;i++)
            for(int j=1;j<n;j++)
            {
                System.out.println("Hi - The value of i: "+i+ " and j: "+j );
            }
    }
}
