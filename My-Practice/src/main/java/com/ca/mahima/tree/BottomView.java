package com.ca.mahima.tree;// Java Program to print Bottom View of Binary Tree
import java.util.*;
import java.util.Map.Entry;

// Tree NodeTree class
class NodeTree
{
	int data; //data of the NodeTree
	int hd; //horizontal distance of the NodeTree
	NodeTree left, right; //left and right references

	// Constructor of tree NodeTree
	public NodeTree(int key)
	{
		data = key;
		hd = Integer.MAX_VALUE;
		left = right = null;
	}
}

//Tree class
class Tree
{
	NodeTree root; //root NodeTree of tree

	// Default constructor
	public Tree() {}

	// Parameterized tree constructor
	public Tree(NodeTree NodeTree)
	{
		root = NodeTree;
	}

	// Method that prints the bottom view.
	public void bottomView()
	{
		if (root == null)
			return;

		// Initialize a variable 'hd' with 0 for the root element.
		int hd = 0;

		// TreeMap which stores key value pair sorted on key value
		Map<Integer, Integer> map = new TreeMap<>();

		// Queue to store tree NodeTrees in level order traversal
		Queue<NodeTree> queue = new LinkedList<NodeTree>();

		// Assign initialized horizontal distance value to root
		// NodeTree and add it to the queue.
		root.hd = hd;
		queue.add(root);

		// Loop until the queue is empty (standard level order loop)
		while (!queue.isEmpty())
		{
			NodeTree temp = queue.remove();

			// Extract the horizontal distance value from the
			// dequeued tree NodeTree.
			hd = temp.hd;

			// Put the dequeued tree NodeTree to TreeMap having key
			// as horizontal distance. Every time we find a NodeTree
			// having same horizontal distance we need to replace
			// the data in the map.
			map.put(hd, temp.data);

			//System.out.println(map);
			// If the dequeued NodeTree has a left child add it to the
			// queue with a horizontal distance hd-1.
			if (temp.left != null)
			{
				temp.left.hd = hd-1;
				queue.add(temp.left);
			}
			// If the dequeued NodeTree has a right child add it to the
			// queue with a horizontal distance hd+1.
			if (temp.right != null)
			{
				temp.right.hd = hd+1;
				queue.add(temp.right);
			}
		}

		// Extract the entries of map into a set to traverse
		// an iterator over that.
		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> bottom : set) {
			System.out.print(bottom.getValue() + " ");
		}
	}
}

// Main driver class
public class BottomView
{
	public static void main(String[] args)
	{
		NodeTree root = new NodeTree(20);
		root.left = new NodeTree(8);
		root.right = new NodeTree(22);
		root.left.left = new NodeTree(5);
		root.left.right = new NodeTree(3);
		root.right.left = new NodeTree(4);
		root.right.right = new NodeTree(25);
		root.left.right.left = new NodeTree(10);
		root.left.right.right = new NodeTree(14);
		Tree tree = new Tree(root);
		System.out.println("Bottom view of the given binary tree:");
		tree.bottomView();
	}
}
