package org.example;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLinkedList(1,0);
        singleLinkedList.insertLinkedList(1,1);
        singleLinkedList.insertLinkedList(2,2);
        singleLinkedList.insertLinkedList(3,3);
        singleLinkedList.insertLinkedList(5,4);
        singleLinkedList.insertLinkedList(8,5);
        singleLinkedList.insertLinkedList(13,6);
        singleLinkedList.insertLinkedList(21,7);
        singleLinkedList.insertLinkedList(34,8);

        singleLinkedList.traverseLinkedList();

        // Searches for a nodeValue
        boolean isFound = singleLinkedList.searchNodeValue(9);
        System.out.println(isFound);

        String isDeleted = singleLinkedList.deleteNode(8);
        System.out.println(isDeleted);

        singleLinkedList.traverseLinkedList();
    }
}
