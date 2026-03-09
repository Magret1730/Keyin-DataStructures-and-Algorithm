package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // constant Time == 0(1)
        // Accessing an element within an array is constant time i.e 0(1)
        int[] arr = {10, 20, 30, 40};
        int a = 30; // 0(1)
        System.out.println(arr[2]); // 0(1)

        // Quadratic Time == 0(n^2)
        for (int i = 0; i < arr.length; i++) { // 0(n)
            for (int j = 0; j < arr.length; j++) { // 0(n)
                System.out.println(arr[i] + " " + arr[j]); // 0(1)
            }
        }

        // 0(n) * 0(n) * 0(1) = 0(n*n*1) = 0(n^2)
    }

    // Linear Time = 0(n)
    // Give an array, look if it contains a certain element
    // This method measures Linear Time == 0(n)
    public static boolean contains(int[] arr, int target) {
        for (int num: arr) { // 0(n)
            if (num == target) { // 0(1)
                return true; // 0(1)
            }
        }
        return false; // 0(1)

        // 0(n) + 0(1) + 0(1) + 0(1) = 0(n) + 0(1)
        // Worst case scenerio is picked i.e 0(n)
    }



    // Quadratic Time == 0(n^2)
}
