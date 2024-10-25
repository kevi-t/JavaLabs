package com.example.basics;
import java.util.Random;

public class DiceRoll {

    public static void main(String[] args) {
            Random random = new Random();
            int currentPosition = 0;

            for (int rollNumber = 1; rollNumber <= 5; rollNumber++) {
                int die = random.nextInt(6) + 1;
                currentPosition += die;

                System.out.println("Roll # " + rollNumber + ": You have rolled a " + die +
                        ". You are now on space " + currentPosition + " and have " +
                        (20 - currentPosition) + " more to go.");

                if (currentPosition >= 20) {
                    System.out.println("Congratulations, you win!");
                    break;
                }
            }

            if (currentPosition < 20) {
                System.out.println("Sorry, you did not reach 20 spaces in five rolls. Try again!");
            }
        }
}