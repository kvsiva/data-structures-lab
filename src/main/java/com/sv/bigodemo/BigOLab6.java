package com.sv.bigodemo;
/*
O(n^3) - cubic - Poor performance. If you have 100 items, this does 100^3=1,000,000 units of work.
Doubling the input size makes it eight times slower. E.g.: matrix multiplication.
 */
public class BigOLab6 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k< n; k++) {
                    System.out.println("Hi - The value of i: " + i + " and j: " + j + " and k:" + k);
                }

            }
        }
    }
}