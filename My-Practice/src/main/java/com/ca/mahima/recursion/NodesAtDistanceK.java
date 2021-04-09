package com.ca.mahima.recursion;

import com.ca.mahima.tree.Node;

public class NodesAtDistanceK {
	public static void main(String[] args) {
		Node a = new Node(16);
		a.left = new Node(14);
		a.right = new Node(20);
		a.left.left = new Node(6);
		a.left.right = new Node(15);
		a.right.left = new Node(17);
		a.right.right = new Node(22);
		int k = 2;
		printNodeAtDisctace(a, k);
	}

	private static void printNodeAtDisctace(Node root, int k) {
		if (root == null)
			return;
		if (k == 0) {
			System.out.println(root.data);
		} else {
			printNodeAtDisctace(root.left, k - 1);
			printNodeAtDisctace(root.right, k - 1);
		}
	}

}
