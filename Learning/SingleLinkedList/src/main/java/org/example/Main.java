package org.example;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLinkedList(1,0);
        singleLinkedList.insertLinkedList(2,1);
        singleLinkedList.insertLinkedList(3,2);
        singleLinkedList.insertLinkedList(4,3);

        singleLinkedList.traverseLinkedList();

        // Searches for a nodeValue
        boolean isFound = singleLinkedList.searchNodeValue(9);
        System.out.println(isFound);
    }
}
