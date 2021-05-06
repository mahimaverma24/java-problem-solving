package com.ca.mahima.tree;

/*
* // For above binary search tree
* Given a binary search tree and a target node K.
* The task is to find the node with minimum absolute difference with given target value K.
Input  :  k = 4
Output :  4

Input  :  k = 18
Output :  17

Input  :  k = 12
Output :  9
*
* Time complexity -> O(h)
* */
public class ClosestElementInBST {
    static Node root;
    static int minDiffKey = -1;
    static int minDiffElement = Integer.MAX_VALUE;

    public static void main(String[] args) {
        root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(17);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(7);
        root.right.right = new Node(22);
        root.right.right.left = new Node(20);

        int k = 18;
        getClosestEmlementOfKey(root, k);
        System.out.print(minDiffKey);
    }

    private static void getClosestEmlementOfKey(Node root, int k) {
        if (root == null)
            return;

        if (k == root.data) {
            minDiffKey = root.data;
            return;
        }

        if (minDiffElement > Math.abs(k - root.data)) {
            minDiffElement = Math.abs(k - root.data);
            minDiffKey = root.data;
        }

        if (k > root.data) {
            getClosestEmlementOfKey(root.right, k);
        } else {
            getClosestEmlementOfKey(root.left, k);
        }

    }
}
