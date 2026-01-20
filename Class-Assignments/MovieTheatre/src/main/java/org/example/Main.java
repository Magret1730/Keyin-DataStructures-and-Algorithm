package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Welcome to Magret's Movie Theatre Booking System!");

        // Scanner object for user inputs
        Scanner scanner = new Scanner(System.in);

        // Allocate fixed 2D Array size for seating arrangement
        int[][] seatingArrangements = new int[10][10];

        while (true) {
            int availableSeats = 0;

            System.out.println();
            System.out.println("This chart represents the seating arrangement of the theater: ");

            // Display Seating Chart
            for (int[] rows : seatingArrangements) {
                for (int seat : rows) {
                    if (seat == 0) {
                        availableSeats++;
                    }
                    System.out.print(seat + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Kindly select a seat by providing the row and column number or enter -1 to exit");

            // Get user input for row and column
            System.out.println("Enter row number (0-9): ");
            int row = scanner.nextInt();

            System.out.println("Enter column number (0-9): ");
            int column = scanner.nextInt();

            // Exit condition
            if (row == -1 || column == -1) {
                System.out.println("Thank you for using Magret's Movie Theatre booking system. Goodbye!");
                break;
            }

            // Validation for row and column input
            if (row < 0 || row >= seatingArrangements.length || column < 0 || column >= seatingArrangements[0].length) {
                System.out.println("Invalid row or column number. Please enter values between 0 and 9.");
                continue;
            }

            // Check for if all seats are reserved
            if (availableSeats == 0) {
                System.out.println("All seats are reserved. Please try again later.");
                break;
            }

            if (seatingArrangements[row][column] == 1) {
                System.out.println("Sorry, this seat is already reserved. Please choose another seat with 0 value.");
            } else {
                // Reserve the seat
                seatingArrangements[row][column] = 1;
                System.out.println("Seat " + row + "," + column + " has been successfully reserved for you.");
            }
        }
        scanner.close();
    }
}