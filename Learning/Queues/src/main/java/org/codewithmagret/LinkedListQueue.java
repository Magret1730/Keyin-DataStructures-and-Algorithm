package org.codewithmagret;

public class LinkedListQueue {
    SingleLinkedList list;

    public void QueueLlinkedList(){
        list = new SingleLinkedList();
        System.out.println("The Queue is successfully created");
    }

    //isEmpty
    public boolean isEmpty(){
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }
    //enqueue
    public void enQueue(int value){
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted "+value+" in the queue");
    }

    //dequeue
    public int deQueue(){
        int value = -1;
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            value = list.head.value;
            list.deleteNode(0);
        }
        return value;
    }
    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    //delete
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue is successfully deleted");
    }
}
