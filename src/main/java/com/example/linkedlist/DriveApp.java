package com.example.linkedlist;

import java.util.Arrays;

public class DriveApp {
    public static void main(String[]args){
        var list = new LinkedList();
        list.addLast(2);
        list.addLast(10);
        list.addLast(6);
        //list.removeFirst();
        list.removeLast();
        //System.out.println(list.indexOf(20));
        System.out.println(list.contains(10));
//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(4);
//        list.addFirst(2);
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(20));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(list);

    }
}
