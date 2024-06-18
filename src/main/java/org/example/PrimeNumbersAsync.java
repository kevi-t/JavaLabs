package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class PrimeNumbersAsync {

    public static void main(String[] args) {
        try {
            List<Integer> primes = generatePrimesAsync(1, 20).get();
            System.out.println("Prime numbers between 1 and 20: " + primes);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static CompletableFuture<List<Integer>> generatePrimesAsync(int start, int end) {
        return CompletableFuture.supplyAsync(() -> {
            List<Integer> primes = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    primes.add(i);
                }
            }
            return primes;
        });
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
