package com.ca.mahima.tree;
//Java implementation to check if given Binary tree

//is a BST or not

/* Class containing left and right child of current
node and key value*/

public class BinaryTree {
	// Root of the Binary Tree
	public Node root;

	/*
	 * can give min and max value according to your code or can write a function to
	 * find min and max value of tree.
	 */

	/*
	 * returns true if given search tree is binary search tree (efficient version)
	 */
//	boolean isBST() {
//		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
//	}

	/*
	 * Returns true if the given tree is a BST and its values are >= min and <= max.
	 */
//	boolean isBSTUtil(Node node, int min, int max) {
//		/* an empty tree is BST */
//		if (node == null)
//			return true;
//
//		/* false if this node violates the min/max constraints */
//		if (node.data < min || node.data > max)
//			return false;
//
//		/*
//		 * otherwise check the subtrees recursively tightening the min/max constraints
//		 */
//		// Allow only distinct values
//		return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
//	}
	Node prev;

	boolean isBST() {
		prev = null;
		return isBST(root);
	}

//INORDER traversal approach
	boolean isBST(Node node) {
		// traverse the tree in inorder fashion and
		// keep a track of previous node
		if (node != null) {
			if (!isBST(node.left))
				return false;

			// allows only distinct values node
			if (prev != null && node.data <= prev.data)
				return false;
			prev = node;
			return isBST(node.right);
		}
		return true;
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
//		tree.root = new Node(4);
//		tree.root.left = new Node(2);
//		tree.root.right = new Node(5);
//		tree.root.left.left = new Node(1);
//		tree.root.left.right = new Node(3);
		tree.root = new Node(16);
		tree.root.left = new Node(14);
		tree.root.right = new Node(20);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(15);
		tree.root.right.left = new Node(17);
		tree.root.right.right = new Node(21);

		if (tree.isBST())
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}
}
