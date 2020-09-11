package com.sv.arraydemo;

public class ArrayLab1 {
    public static void main(String[] args){
        try {
            Array numbers = new Array(3);
            numbers.insert(10);
            numbers.insert(20);
            numbers.insert(30);
            numbers.insert(40);
            numbers.print();
            numbers.removeAt(1);
            numbers.print();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
