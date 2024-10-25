package com.example.arrays;

public class BubbleSort {

    public static void bubbleSort(int[] numArray) {
        int n = numArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numArray[j] > numArray[j + 1]) {
                    // Swap numArray[j] and numArray[j + 1]
                    int temp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numArray = {90, 34, 4, 78, 21, 16, 50, 31, 2};
        bubbleSort(numArray);
        System.out.println("Bubble sorted array: ");
        for (int num : numArray) {
            System.out.print(num + " ");
        }
    }
}
