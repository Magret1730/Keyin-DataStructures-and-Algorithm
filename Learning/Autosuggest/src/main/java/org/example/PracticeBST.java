package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the k-th smallest element/number in a given stream.
 * list = [50, 30, 70,20,40,60,80]
 * sort(list) = [20, 30, 40, 50, 60, 70, 80]
 * inOrder trave
 *
 */

class BSTPracticeNode {
    public int value;
    public BSTPracticeNode left;
    public BSTPracticeNode right;
    BSTPracticeNode(int value) {
        this.value = value;
    }

}


public class PracticeBST {
    public BSTPracticeNode root;

    //insert
   public BSTPracticeNode insert (BSTPracticeNode node, int value) {
        if (node == null) return new BSTPracticeNode(value);

        if (value <= node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    //InOrder traversal -> sorted list
    public void inOrder(BSTPracticeNode node, List<Integer> list) {
        if (node == null) return;;
        inOrder(node.left, list);
        list.add(node.value);
        inOrder(node.right, list);
    }


    //Find the Kth smallest
    public int kthSmallest(int k){
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        if (k <=0 || k > list.size()) {
            throw new IllegalArgumentException("k out of bound");
        }
        return list.get(k-1);
    }

    // Find the closest value to a Target.
    public int closestToTarget(int target) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int closest = list.get(0);
        int minDiff = Math.abs(closest - target);

        for (int num : list) {
            int diff = Math.abs(num - target);

            if (diff < minDiff) {
                minDiff = diff;
                closest = num;
            }
        }

        return closest;
    }

}