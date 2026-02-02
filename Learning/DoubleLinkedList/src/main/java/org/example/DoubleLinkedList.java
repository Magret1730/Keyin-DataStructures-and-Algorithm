package org.example;

public class DoubleLinkedList {
        public DoubleNode head;
        public DoubleNode tail;
        public int size;
//        public Node previous;

        public DoubleNode createLinkedList (int nodeValue) {
            DoubleNode node = new DoubleNode();
            node.next = null;
            node.value = nodeValue;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        //insert Method
        public void insertLinkedList(int nodeValue, int location) {
            DoubleNode node = new DoubleNode();
            node.value = nodeValue;

            if (head == null){
                createLinkedList(nodeValue);
                return;
            } else if (location == 0) {
                node.next = head;
                node.previous = null;
                head = node;
            } else if (location >= size) {
                node.next = null;
                node.previous = tail;
                tail.next = node;
                tail = node;
            } else {
                DoubleNode tempNode = head;
                int index = 0;
                while (index < location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
                DoubleNode nextNode = tempNode.next;
                node.previous = tempNode;
                node.next = tempNode.next;
                tempNode.next = node;
                node.next = nextNode;
            }
            size++;
        }

        // Traversing through a double linked list
        public void traverseLinkedList (){
            if (head == null) {
                System.out.println("Linked list does not exist");
            } else {
                DoubleNode tempNode = head;
                for (int i = 0; i < size; i++){
                    System.out.print(tempNode.value);
                    if (i != size - 1){
                        System.out.print(" <-> ");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println("\n");

            }
        }

    public void reverseTraverseLinkedList (){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.previous;
            }
            System.out.println("\n");

        }
    }

        //EXERCISE 1: given a value, search for that element and return a boolean if the element exist or not.
//        public boolean searchNodeValue(int nodeValue) {
//            if (head == null) {
//                return false;
//            } else {
//                Node tempNode = head;
//                for (int i = 0; i < size; i++) {
//                    if (tempNode.value == nodeValue) {
//                        return true;
//                    }
//                    tempNode = tempNode.next;
//                }
//                return false;
//            }
//        }

        //EXERCISE 2: Given a location Implement a Delete method.
//        public String deleteNode(int nodeLocation) {
//            // If head is null
//            if (head == null) {
//                return "Linked List is empty.";
//            }
//
//            // If the location given is less than size
//            if (nodeLocation < 0 || nodeLocation >= size) {
//                return "Location is invalid.";
//            }
//
//            // If location is the head
//            if (nodeLocation == 0) {
//                int deletedValue = head.value;
//                head = head.next;
//                size--;
//
//                return "Deleted Value " + deletedValue + " has been deleted in location " + nodeLocation;
//            }
//
//            // If location is in the middle or tail
//            Node temp = head;
//
//            for (int i = 0; i < nodeLocation - 1; i++) {
//                temp = temp.next;
//            }
//
//            int deletedValue = temp.next.value;
//            temp.next = temp.next.next;
//
//            size--;
//            return "Deleted Value " + deletedValue + " has been deleted in location " + nodeLocation;
//        }
    }
