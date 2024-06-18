package org.example;

import java.util.ArrayList;

import static org.example.GenericMethod.printArray;
import static org.example.GenericMethod.printList;

public class CellDrive {

    public static void main(String[] args) 
    {
        Cell<Integer> integerCell = new Cell<Integer>();
        Cell<String> stringCell = new Cell<String>();
        integerCell.set(1);
        stringCell.set("Test");
        int num = integerCell.get();
        String str = stringCell.get();
        System.out.println(num);

        Integer[] integerArray = { 1, 2, 3 };
        String[] stringArray = { "This","is","fun" };
        printArray( integerArray );
        printArray( stringArray );

        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("one");
        ls.add("two");
        printList(li);
        printList(ls);
    }
    
}