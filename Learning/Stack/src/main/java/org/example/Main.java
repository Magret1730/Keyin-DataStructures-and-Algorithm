package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);

        System.out.println();
        System.out.println(arrayStack.peek());

        System.out.println();
        arrayStack.pop();

        System.out.println();
        arrayStack.peek();

        System.out.println();

        // Stack usage:
        // Reversing a word, you can use stack data structure e.g; stack -> kcats
        // Also palindrome

    }
}