package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
            doubleLinkedList.insertLinkedList(1,0);
            doubleLinkedList.insertLinkedList(4,1);
            doubleLinkedList.insertLinkedList(20,2);
            doubleLinkedList.insertLinkedList(13,3);

            doubleLinkedList.traverseLinkedList();
            doubleLinkedList.reverseTraverseLinkedList();
            doubleLinkedList.searchNodeValue(4);
            doubleLinkedList.searchNodeValue(6);

            doubleLinkedList.deleteNode(2);
            doubleLinkedList.traverseLinkedList();
    }
}