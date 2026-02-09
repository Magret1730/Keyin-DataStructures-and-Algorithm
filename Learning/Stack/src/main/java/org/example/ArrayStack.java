package org.example;

public class ArrayStack {
    int [] arr;
    int topOfStack;

    public ArrayStack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size: " + size);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            return false;
        }
    }

    // check if stack is full
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Adding an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("successfully inserted element: " + value);
        }
    }

    // Removing an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println("successfully removed element: " + topStack);
            return topStack;
        }
    }

    // Peeking through a stack - Observing an element from the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            System.out.println("The element at the top of the stack is: " + topStack);
            return topStack;
        }
    }

    // Size of stack
    public int size() {
        return topOfStack + 1;
    }


}
