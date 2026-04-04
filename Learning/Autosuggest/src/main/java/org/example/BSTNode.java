package org.example;

public class BSTNode {
    String query;
    BSTNode left, right;

    public BSTNode(String query){
        this.query = query;
        this.left = this.right = null;
    }
}
