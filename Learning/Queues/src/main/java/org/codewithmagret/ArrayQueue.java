package org.codewithmagret;

public class ArrayQueue {
    private int [] arr;
    private int backOfQueue;
    private int nItems;
    private int begininigOfQueue;

    public ArrayQueue(int size) {
        this.arr = new int[size];
        this.begininigOfQueue = -1;
        this.nItems = 0;
        this.backOfQueue = -1;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    //check if queue is empty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //check if queue is full
    public boolean  isFull(){
        if (backOfQueue == arr.length -1){
            return true;
        } else {
            return false;
        }
    }

    // adding an element to the queue - enqueue
    public void enQueue(int value) {
        if (isFull()){
            System.out.println("The Queue is full");
        } else if (isEmpty()){
            begininigOfQueue = 0;
            backOfQueue++;
            arr[backOfQueue] = value;
            nItems++;
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
        }
    }

    //Peek - to see the first element in the queue without removing it
    public int peek(){
        if (!isEmpty()){
            return arr[begininigOfQueue];
        } else {
            return -1;
        }
    }

    //Dequeue - removing an element from the queue
    public int deQueue(){
        int result = 0;
        if (isEmpty()){
            System.out.println("The Queue is Empty");
        } else {
            result = arr[begininigOfQueue];
            begininigOfQueue++;
            if (begininigOfQueue > backOfQueue) {
                begininigOfQueue = backOfQueue = -1;
            }
            nItems--;
        }
        return result;
    }

    //Delete
    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue is successfully deleted");
    }
}
