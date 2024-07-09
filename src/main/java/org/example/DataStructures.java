package org.example;

import java.util.Scanner;

public class DataStructures {
    String[] cars;
    public DataStructures() {
        // Initializing the array in the constructor
        cars = new String[]{"Volvo", "BMW", "Ford", "Mazda"};
    }

    int[] ages = {18, 33, 24, 64, 45};
//    int sum = 0;
//    for (int x=0; int x < ages; int x++) {
//        sum += x;
//    }

    public static void  main(String[]args){
        Scanner scanner = new Scanner(System.in);
        DataStructures dataStructures = new DataStructures();
        System.out.println(dataStructures.cars.length);
        //System.out.println(dataStructures.sum);
    }
}