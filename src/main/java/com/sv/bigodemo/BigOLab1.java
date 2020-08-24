package com.sv.bigodemo;

/* O(1) - constant - This is the best.  The algorithm always takes the same amount of time,
       regardless of how much data there is.  E.g.: Looking up an element of an array by its index.
*/
public class BigOLab1 {
    public static void main(String[] args) {
	    int[] data={1,2,3,4,5,6,7,8,9,10};
        System.out.println("element at 0th position:"+ data[0]);
        System.out.println("element at 5th position:"+ data[5]);
        System.out.println("element at 9th position:"+ data[9]);
    }
}
