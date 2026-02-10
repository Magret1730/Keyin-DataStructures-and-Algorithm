package org.codewithmagret;

public class Node {
    public Animal value;
    public Node next;

    public Node(Animal value) {
        this.value = value;
        this.next = null;
    }
}
