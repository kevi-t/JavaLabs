package org.example;

public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int lastNonZeroFoundAt = 0;
        for (int current = 0; current < arr.length; current++) {
            if (arr[current] != 0) {
                int temp = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = arr[current];
                arr[current] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 1 3 12 0 0
    }
}
