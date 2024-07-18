package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLab {
    public void sortNum(int[] num){
        Arrays.sort(num);
    }
    public void sortNum1(int[] num){
       // Arrays.sort(num, Collections.reverseOrder());
    }

    //remove duplicate elements in an array
    public int[] remove(int [] num ){
        //if array is empty or has one element i.e. no duplicates
        if(num.length <= 1){
           return num;
        }
        //sort array to bring duplicates together
        sortNum(num);
        // Initialize variables to track unique elements
        int j =0; //Index to store unique elements
        // Iterate through the array to find unique elements
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[j]) {
                j++;
                num[j] = num[i];
            }
        }
        return Arrays.copyOf(num,j+1);
    }
    public int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int numElements = sc.nextInt();
        int[] arrNum = new int[numElements];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = sc.nextInt();
        }
        return arrNum;
    }

    public static void main(String[] args) {
        ArrayLab lab = new ArrayLab();
        int[] arr = lab.input();
        System.out.println("Original array: " + Arrays.toString(arr));

        lab.sortNum(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] modifiedArray = lab.remove(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(modifiedArray));
    }
}