package com.ca.mahima.tree;

/**
 * Time Complexity: O(n^2) in worst case. complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2).
 * Space Complexity: O(n) in worst case.
 **/
public class LevelOrderTraversalRecursive {
    public static void main(String[] args) {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(13);
        tree_level.root.left = new Node(10);
        tree_level.root.right = new Node(15);
        tree_level.root.left.left = new Node(6);
        tree_level.root.left.right = new Node(8);
        tree_level.root.right.left = new Node(12);

        System.out.println("Level order traverse of binary tree is - ");
        for (int i = 1; i <= 3; i++) {
            levelOrder(tree_level.root, i);
        }
    }

    private static void levelOrder(Node root, int level) {

        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            levelOrder(root.left, level - 1);
            levelOrder(root.right, level - 1);
        }
    }
}
