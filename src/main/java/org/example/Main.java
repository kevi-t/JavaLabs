package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("APPLICATION STARTING");
        System.out.println("Enter a");
        int x = sc.nextInt();
        System.out.println("Enter b");
        int y = sc.nextInt();
        Example eg =new Example();
        System.out.println("The Sum of a and b is:"+eg.sum(x,y));
    }
}