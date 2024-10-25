package com.example.leetcode;

public class Solution {

        public String fractionAddition(String expression) {
            int numerator = 0, denominator = 1; // Start with a fraction of 0/1

            int i = 0;
            while (i < expression.length()) {
                // Determine the sign of the fraction
                int sign = 1;
                if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                    sign = expression.charAt(i) == '-' ? -1 : 1;
                    i++;
                }

                // Parse the numerator
                int numStart = i;
                while (expression.charAt(i) != '/') {
                    i++;
                }
                int currentNumerator = Integer.parseInt(expression.substring(numStart, i)) * sign;
                i++;  // skip the '/'

                // Parse the denominator
                int denomStart = i;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    i++;
                }
                int currentDenominator = Integer.parseInt(expression.substring(denomStart, i));

                // Calculate the new numerator and denominator after adding the current fraction
                numerator = numerator * currentDenominator + currentNumerator * denominator;
                denominator = denominator * currentDenominator;

                // Simplify the fraction by dividing by the greatest common divisor (GCD)
                int gcd = gcd(Math.abs(numerator), denominator);
                numerator /= gcd;
                denominator /= gcd;
            }

            return numerator + "/" + denominator;
        }

        // Helper function to calculate the greatest common divisor (GCD) using the Euclidean algorithm
        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
}