package com.example.basics;


import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {
        List<Integer> primes = generatePrimes(1, 20);
        System.out.println("Prime numbers between 1 and 20: " + primes);
    }

    public static List<Integer> generatePrimes(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
