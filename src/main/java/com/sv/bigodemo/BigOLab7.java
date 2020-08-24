package com.sv.bigodemo;
/*
O(2^n) - exponential - Very poor performance.
You want to avoid these kinds of algorithms, but sometimes you have no choice.
Adding just one bit to the input doubles the running time. E.g.: traveling salesperson problem.

 */
public class BigOLab7 {
    public static void main(String[] args) {
        BigOLab7 obj=new BigOLab7();
        obj.solveHanoi(3,"1","2","3");
    }

    void solveHanoi(int n, String fromPeg, String toPeg, String sparePeg) {
        if (n < 1) {
            return;
        }
        if (n > 1) {
            solveHanoi(n - 1, fromPeg, sparePeg, toPeg);
        }
        System.out.println("move from " + fromPeg + " to " + toPeg);
        if (n > 1) {
            solveHanoi(n - 1, sparePeg, toPeg, fromPeg);
        }
    }
}

