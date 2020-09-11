package com.sv.arraydemo;

public class Array {
    private int[] items;
    private int length;
    private int count;

    public Array(int length) {
       items=new int[length];
    }
    public void print(){
        for(int i=0;i<items.length;i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        if(items.length==count){
            int[] newItems=new int[count*2];
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            items=newItems;
        }
        items[count++]=item;
    }
    public void removeAt(int index){
        if(index<0||index>=count)
            throw new IllegalArgumentException();
        for(int i =index;i<=count;i++){
            items[i]=items[i+1];
        }
    }
}
