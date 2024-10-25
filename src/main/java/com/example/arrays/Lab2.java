package com.example.arrays;

public class Lab2 {
        public boolean containsDuplicate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) { // if any two elements are the same, return true
                        return true;
                    }
                }
            }
            return false; // if no duplicates are found, return false
        }

        public static void main(String[] args) {
            Lab2 lab = new Lab2();

            int[] nums1 = {1, 2, 3, 4};
            System.out.println(lab.containsDuplicate(nums1)); // Expected output: false

            int[] nums2 = {1, 2, 3, 1};
            System.out.println(lab.containsDuplicate(nums2)); // Expected output: true

            int[] nums3 = {};
            System.out.println(lab.containsDuplicate(nums3)); // Expected output: false

            int[] nums4 = {1, 1, 1, 1};
            System.out.println(lab.containsDuplicate(nums4)); // Expected output: true
        }

}
