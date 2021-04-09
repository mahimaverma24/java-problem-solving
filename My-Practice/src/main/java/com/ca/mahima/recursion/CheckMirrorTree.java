package com.ca.mahima.recursion;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}


public class CheckMirrorTree {
	public static void main(String[] args) {

		Node a = new Node(1);
		Node b = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);

		b.left = new Node(3);
		b.right = new Node(2);
		b.right.left = new Node(5);
		b.right.right = new Node(4);
	//	b.right.right.left = new Node(2);

		// isMirrorTree(a, b);
		System.out.println(isMirrorTree(a, b));
	}

	private static boolean isMirrorTree(Node a, Node b) {

		// base condition
		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;

		return a.data == b.data && (isMirrorTree(a.left, b.right) && isMirrorTree(a.right, b.left));
	}
}
