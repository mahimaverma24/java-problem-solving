package com.ca.mahima.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SpiralOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(13);
        tree_level.root.left = new Node(10);
        tree_level.root.right = new Node(15);
        tree_level.root.left.left = new Node(6);
        tree_level.root.left.right = new Node(8);
        tree_level.root.right.left = new Node(12);

        ArrayList<Integer> spiralTreeOrder = spiralTraversal(tree_level.root);
        System.out.print(spiralTreeOrder);
    }

    static ArrayList<Integer> spiralTraversal(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return new ArrayList<>(); // NULL check
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(root);

        while (!s1.empty() || !s2.empty()) {
            // Print nodes of current level from s1 and push nodes of
            // next level to s2
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                list.add(temp.data);
                //System.out.print(temp.data + " ");

                // Note that is right is pushed before left
                if (temp.right != null)
                    s2.push(temp.right);

                if (temp.left != null)
                    s2.push(temp.left);
            }

            // Print nodes of current level from s2 and push nodes of
            // next level to s1
            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                //System.out.print(temp.data + " ");
                list.add(temp.data);
                // Note that is left is pushed before right
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }

        return list;
    }
}
