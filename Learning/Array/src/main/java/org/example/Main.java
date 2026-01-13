package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] scores1;
        scores1 = new int[4];
        scores1[0] = 85;
        scores1[1] = 90;
        scores1[2] = 40;
        scores1[3] = 56;
//        System.out.println(Arrays.toString(scores1));

        int[] scores2 = {85, 90, 60, 56};
        for (int i = 0; i < scores2.length; i++) {
//            System.out.println(scores2[i]);
        }

        for (int score : scores2) {
//            System.out.println(score);
        }

        int sumScore = Arrays.stream(scores2).sum();
//        System.out.println(sumScore);

        int sum = 0;
        for (int score : scores2) {
            sum += score;
        }
        System.out.println(sum);

        int num = scores2[0];
        for (int score : scores2) {
            if (num < score) {
                num = score;
            }
        }
        System.out.println(num);
    }
}