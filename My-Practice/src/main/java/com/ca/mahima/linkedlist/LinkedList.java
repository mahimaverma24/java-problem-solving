package com.ca.mahima.linkedlist;

public class LinkedList {

	public static Node head;

	public static class Node {

		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			//this.next = null;
		}
	}

//	public static void main(String[] arg) {
//
//		LinkedList ll = new LinkedList();
//		ll.head = new Node(1);
//		Node second = new Node(2);
//		Node third = new Node(3);
//
//		ll.head.next = second;
//		second.next = third;
//
//		printLinkedList();
//	}

	public static void printLinkedList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}
}
