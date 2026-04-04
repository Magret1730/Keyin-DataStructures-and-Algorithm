package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * YOu are designing an auto suggestion feature for a search engine.
 * The system should store past search queries in a BST and suggest the nearest match when a user types a query.
 * 1. Implement a BST that stores search queries
 * 2.
 */
public class AutoSuggestPractice {
    /**
     * You are designing a auto suggestion feature for a search engine. The system should store past search
     * queries in a BST and suggest the nearest match when a user types a query.
     * 1. Implement a BST that stores search queries
     * 2. Give a prefix, return the closest matching query.
     */


    private BSTNode root;

    public void insert(String query){
        root = insertRecord(root, query);
    }

    private BSTNode insertRecord(BSTNode root, String query){
        if (root == null) {
            return new BSTNode(query);
        }
        if (query.compareTo(root.query) < 0){
            root.left = insertRecord(root.left, query);
        } else if (query.compareTo(root.query) > 0){
            root.right = insertRecord(root.right, query);
        }
        return root;
    }

    //Get suggestions method based on a match prefix
    public List<String> getSuggestions(String prefix){
        List<String> suggestions = new ArrayList<>();
        BSTNode node = findTheClosestMatch(root, prefix);
        inOrderTravelsal(node, prefix, suggestions);
        return suggestions;
    }

    private BSTNode findTheClosestMatch(BSTNode root, String prefix){
        if (root == null || root.query.startsWith(prefix)){
            return root;
        }
        if (prefix.compareTo(root.query) < 0){
            return findTheClosestMatch(root.left, prefix);
        } else {
            return findTheClosestMatch(root.right, prefix);
        }
    }

    private void inOrderTravelsal(BSTNode node, String prefix, List<String> suggestions){
        if (node == null){
            return;
        }
        inOrderTravelsal(node.left, prefix, suggestions);
        if(node.query.startsWith(prefix)){
            suggestions.add(node.query);
        } else if (!suggestions.isEmpty()){
            return; // Stop traversal when we move past the prefix range
        }
        inOrderTravelsal(node.right, prefix, suggestions);

    }

}
