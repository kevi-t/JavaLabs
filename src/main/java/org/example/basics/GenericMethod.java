package org.example.basics;

import java.util.List;

public class GenericMethod {
    public static <T> void printArray(T[] array){
        for ( T arrayItem : array ){
            System.out.println( arrayItem );
        }
    }

    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.println(elem);
        System.out.println();
    }
}
