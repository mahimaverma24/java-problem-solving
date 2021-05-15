package com.ca.mahima.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftViewBinaryTree {
    static Node root;
    static int maxLevel = 0;
    static List<Integer> leftNodes = new ArrayList<>();

    public static void main(String[] args) {
        root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
       leftViewUtil(root, 1);
       System.out.print(leftNodes);
    }

    static void leftViewUtil(Node root, int level) {

        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            //System.out.print(root.data + " ");
            leftNodes.add(root.data);
            maxLevel = level;
        }
        leftViewUtil(root.left, level + 1);
        leftViewUtil(root.right, level + 1);
    }

}
