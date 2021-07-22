package com.ca.mahima.tree;

import java.util.ArrayList;
import java.util.List;

public class FindKthLargestNumberInBST {
    public static List<Integer> nodesInDescOrder = new ArrayList<>();
    static Node root;

    public static void main(String[] args) {
        root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        int k = 3;  // 25 output

        descInorderTraversal(root);
        System.out.println(nodesInDescOrder);
        System.out.println(getKthLargest(nodesInDescOrder, k));

    }

    private static int getKthLargest(List<Integer> nodesInDescOrder, int k) {
        return nodesInDescOrder.get(k - 1);
    }

    private static void descInorderTraversal(Node root) {
        if (root == null)
            return;
        descInorderTraversal(root.right);
        nodesInDescOrder.add(root.data);
        descInorderTraversal(root.left);

    }
}
