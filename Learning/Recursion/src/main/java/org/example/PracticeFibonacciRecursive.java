package org.example;

public class PracticeFibonacciRecursive {
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static void main(String[] args) {
        System.out.println(fibonacciRecursive(4));
    }

    /* Factorial Recursion */
//    n! = n * (n - 1)!
//    n! = n * (n - 1) * (n - 2) * .... * 2 * 1
}
