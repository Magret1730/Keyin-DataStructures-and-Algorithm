package org.codewithmagret;

public class AnimalQueue {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Animal animal) {
        Node newNode = new Node(animal);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Animal dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        }

        Animal value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return value;
    }

    public  Animal peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        }

        return head.value;
    }
}
