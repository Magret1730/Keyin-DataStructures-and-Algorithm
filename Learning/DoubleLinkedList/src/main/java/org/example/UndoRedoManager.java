package org.example;


/**
 * Implement an application that support undo/redo functionalioty. Use a linked list to maintain a sequence
 * of states. Each state change is sstored as a node in the list, allowing for the easy navigation.
 */
public class UndoRedoManager<T> {
    private class Node {
        private T state;
        private Node next;
        private Node previous;

        public Node(T state) {
            this.state = state;
        }
    }

    private Node currentState;

    // Add State
    public void addState (T newState) {
        // create a new node for the new task
        Node newNode = new Node(newState);

        // Set the link for the new Node
        newNode.previous = currentState;
        newNode.next = null;

        // update the next link for the current state
        if (currentState != null) {
            currentState.next = newNode;
        }
        // update the current to the enw sate
        currentState = newNode;
    }
//
    // Undo  Operation
    public T undo () {
        if (currentState == null) {
            System.out.println("No state to undo");
            return null;
        }
        Node previousState = currentState.previous;
        if (previousState == null) {
            System.out.println("Reached the initial state");
        } else {
            currentState = previousState;
        }
        return currentState.state;
    }

    // Redo Operation
    public T redo () {
        if (currentState == null) {
            System.out.println("No state to redo");
            return null;
        }
        Node nextState = currentState.next;
        if (nextState == null) {
            System.out.println("Reached the last state");
        } else {
            currentState = nextState;
        }
        return currentState.state;
    }


    // Main
    public static void main(String[] args) {
        UndoRedoManager undoRedoManager = new UndoRedoManager();

        undoRedoManager.addState("State 1");
        undoRedoManager.addState("State 2");
        undoRedoManager.addState("State 3");
        undoRedoManager.addState("State 4");
        undoRedoManager.addState("State 5");
        undoRedoManager.addState("State 6");
        undoRedoManager.addState("State 7");
        undoRedoManager.addState("State 8");
        undoRedoManager.addState("State 9");
        undoRedoManager.addState("State 10");

        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current: " + undoRedoManager.currentState.state);

        System.out.println();
        System.out.println("Redo.....");

        undoRedoManager.redo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current: " + undoRedoManager.currentState.state);
    }
}
