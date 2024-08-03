package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Declare random selection
        Random random = new Random();
        // Array to store counts for numbers 0-9
        int[] counts = new int[10];

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            // Generate a random number between 0 and 9
            int number = random.nextInt(10);
            // Increment the count for this number by 1
            counts[number]++;
        }

        // Display the count for each number
        System.out.println("Counts for each number from 0 to 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}