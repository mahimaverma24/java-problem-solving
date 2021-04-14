package com.ca.mahima.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Time Complexity: O(n) where n is number of nodes in the binary tree
 * Space Complexity: O(n) where n is number of nodes in the binary tree
 * **/
public class LevelOrderTraversal {

	static void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			/*
			 * poll() removes the present head. For more information on poll() visit
			 * http://www.tutorialspoint.com/java/ util/linkedlist_poll.htm
			 */
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			/* Enqueue left child */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			/* Enqueue right child */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(13);
		tree_level.root.left = new Node(10);
		tree_level.root.right = new Node(15);
		tree_level.root.left.left = new Node(6);
		tree_level.root.left.right = new Node(8);
		tree_level.root.right.left = new Node(12);

		System.out.println("Level order traverse of binary tree is - ");
		printLevelOrder(tree_level.root);
	}

}
