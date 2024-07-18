package org.example.basics;

import java.util.Scanner;

public class Loop {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        for (int y=1; y<=10; y++){
            int multiple = number*y;
            System.out.println(number + " x " + y + " = " + multiple);

        }

    }
}
