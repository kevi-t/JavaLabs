package com.example;

import com.example.arrays.ArrayLab;
import com.example.leetcode.Solution;

import java.util.Arrays;

public class AppApplication {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Input:");

        ArrayLab lab = new ArrayLab();
        int[] arr = lab.input();
        System.out.println("Original array: " + Arrays.toString(arr));
        lab.sortNum(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] modifiedArray = lab.remove(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(modifiedArray));
    }
}