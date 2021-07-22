package com.ca.mahima.tree;
/**
 *   O(n^2)
 *
 * */
public class CheckBalancedBst {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println(isBalanced(tree.root));
    }

    private static boolean isBalanced(Node root) {

        if (root == null)
            return true;
        return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int height(Node root) {
        if (root == null)
            return -1;
        int height = Math.max(height(root.left), height(root.right));
        return height;
    }
}
