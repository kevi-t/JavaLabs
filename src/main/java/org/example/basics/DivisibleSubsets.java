package org.example.basics;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSubsets {

    public static List<List<Integer>> findDivisibleSubsets(int[] arr, int divisor) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, divisor, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int divisor, int start, List<Integer> tempList, List<List<Integer>> result) {
        if (!tempList.isEmpty() && sum(tempList) % divisor == 0) {
            result.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < arr.length; i++) {
            tempList.add(arr[i]);
            backtrack(arr, divisor, i + 1, tempList, result);
            tempList.remove(tempList.size() - 1);
        }
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int divisor = 3;
        List<List<Integer>> result = findDivisibleSubsets(arr, divisor);
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
        // Example output: [3], [1, 2], [2, 4], [1, 2, 3], [1, 5, 4], [1, 2, 5, 4]
    }
}
