package com.example.basics;

import java.util.Scanner;

public class Loop {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);


        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");

        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }

        System.out.println("Enter number:");
        int number = sc.nextInt();

        for (int y=1; y<=10; y++){
            int multiple = number*y;
            System.out.println(number + " x " + y + " = " + multiple);

        }

    }
}
