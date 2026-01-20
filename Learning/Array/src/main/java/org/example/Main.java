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
    }
}