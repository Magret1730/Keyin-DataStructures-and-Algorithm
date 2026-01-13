package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Gets the temperature length
        System.out.println("Provide the length of the temperatures");
        Scanner scanner = new Scanner(System.in);
        int temperatureLength = scanner.nextInt();

        // Provides memory for the array
        int[] temperatures = new int[temperatureLength];

        // Gets the values of the array
        System.out.println("Provide the temperatures based on the length given i.e " + temperatureLength);
        for (int i = 0; i < temperatureLength; i++) {
            temperatures[i] = scanner.nextInt();
        }

        // Calculates the average of the temperature
        OptionalDouble averageTemp = Arrays.stream(temperatures).average();
        double averageTempToDouble = averageTemp.getAsDouble();

        // Casts the temp to int
        int averageTempToInt = (int) averageTempToDouble;

        // Calculate length of temperatures above the average temperature
        int tempLengthGreaterThanAverageTemp = 0;
        for (int temperature : temperatures) {
            if (averageTempToInt < temperature) {
                tempLengthGreaterThanAverageTemp++;
            }
        }

        // Outputs the required values
        System.out.println("The average temperature is: " + averageTempToDouble);
        System.out.println("The numbers of temperatures greater than the average temperature is: " + tempLengthGreaterThanAverageTemp);
    }
}