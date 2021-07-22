package com.ca.mahima.tree;

public class LcaInBST {
    static Node root;

    public static void main(String[] args) {
        root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        Node n1 = root.left;
        Node n2 = root.right.right;
        Node n = findLcaOfBst(root, n1, n2);
        System.out.println("Lowest common ancestor of node " + n1 + " and " + n2 + " is :" + n.data);
    }

    private static Node findLcaOfBst(Node root, Node n1, Node n2) {
        while (root != null) {

            if (n1.data < root.data && n2.data < root.data)
                root = root.left;
            else if (n1.data > root.data && n2.data > root.data)
                root = root.right;
            else
                break;
        }
        return root;
    }
}
