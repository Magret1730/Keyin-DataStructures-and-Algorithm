package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList singleLinkedList = new DoubleLinkedList();
        DoubleLinkedList.insertLinkedList(1,0);
        DoubleLinkedList.insertLinkedList(1,1);
        DoubleLinkedList.insertLinkedList(2,2);
        DoubleLinkedList.insertLinkedList(3,3);

        DoubleLinkedList.traverseLinkedList();
        }
    }
}