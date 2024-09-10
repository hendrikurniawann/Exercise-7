package org.example;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number or 'q' to finish: ");
            String input = scanner.nextLine();

            // Check if the user entered 'q' to quit
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                // Try to parse the input as a double
                double number = Double.parseDouble(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                // If parsing fails, print an error message
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
        }

        // Check if any numbers were entered
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average of entered numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}

