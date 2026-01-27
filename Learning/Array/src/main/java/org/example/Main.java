package org.example;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] scores1;
//        scores1 = new int[4];
//        scores1[0] = 85;
//        scores1[1] = 90;
//        scores1[2] = 40;
//        scores1[3] = 56;
//        System.out.println(Arrays.toString(scores1));

//        int[] scores2 = {85, 90, 60, 56};
//        for (int i = 0; i < scores2.length; i++) {
//            System.out.println(scores2[i]);
//        }

//        for (int score : scores2) {
//            System.out.println(score);
//        }

//        int sumScore = Arrays.stream(scores2).sum();
//        System.out.println(sumScore);

//        int sum = 0;
//        for (int score : scores2) {
//            sum += score;
//        }
//        System.out.println(sum);

//        int num = scores2[0];
//        for (int score : scores2) {
//            if (num < score) {
//                num = score;
//            }
//        }
//        System.out.println(num);

        // ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);

        // Access index of an element
//        numbers.remove(int index) returns int
//        numbers.remove(4); // removes element at index 4
//        numbers.remove(Integer.valueOf(4));


        // Display initial chart
        // Allow users to reserve a particular seat
        // If seat is already reserved, mark the chart and dipaly info and suggest available seat
        // Allow users to cancel reservation

        numbers.add(0, 40); // add 40 at index 0
        numbers.stream().forEach(x -> System.out.println(2*x));

        // When ti use an array
        //1. When you know the size i.e it ha s a fixed size
        //2.

        // One Dimension Array
//        int[] scores1;
//        scores1 = new int[4];
//        scores1[0] = 85;
//        scores1[1] = 90;
//        scores1[2] = 40;
//        scores1[3] = 56;
////        System.out.println(Arrays.toString(scores1));
//
//        int[] scores2 = {85, 90, 60, 56};
//        for (int i = 0; i < scores2.length; i++) {
////            System.out.println(scores2[i]);
//        }
//
//        for (int score : scores2) {
////            System.out.println(score);
//        }
//
//        int sumScore = Arrays.stream(scores2).sum();
////        System.out.println(sumScore);
//
//        int sum = 0;
//        for (int score : scores2) {
//            sum += score;
//        }
//        System.out.println(sum);
//
//        int num = scores2[0];
//        for (int score : scores2) {
//            if (num < score) {
//                num = score;
//            }
//        }
//        System.out.println(num);

        // 2-D Array ; int[row]
        int[][] matrix;
        matrix = new int[3][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

//        System.out.println(Arrays.deepToString(matrix));

        // IF you know what the siz eof the array is
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        System.out.println(Arrays.deepToString(matrix1));

        // Traversing a 2-D Array
        for (int row = 0; row < matrix1.length; row++) {
            for (int cols = 0; cols < matrix1[row].length; cols++) {
                System.out.print(matrix1[row][cols] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Calculate the average of a 2-D array
        int sum = 0;
        int count = 0;
        for (int row = 0; row < matrix1.length; row++) {
            for (int cols = 0; cols < matrix1[row].length; cols++) {
//                System.out.print(matrix1[row][cols] + " ");
                sum += matrix1[row][cols];
                count++;
            }
//            System.out.println();
        }
        double average = (double) sum / count;
        System.out.println(average);

        System.out.println();

        // Enhanced for loop
        for (int[] row : matrix1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Jagged Arrays (unequla matrix)
        int[][] jagged = {{1, 2}, {5, 6, 7,}, {9}};
        System.out.println(Arrays.deepToString(jagged));
    }
}
