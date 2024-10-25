package com.example.arrays;

public class Lab {
    public static void main(String[] args){
        Array n = new Array(3);
        n.insert(10);
        n.insert(15);
        n.insert(20);
        n.insert(25);
        //n.removeAt(0);
        System.out.println("Index of the item is:"+n.indexOf(35));
        n.print();
    }
}