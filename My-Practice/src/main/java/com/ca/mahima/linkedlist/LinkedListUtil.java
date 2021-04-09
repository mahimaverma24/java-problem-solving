package com.ca.mahima.linkedlist;

public class LinkedListUtil {

	public static void printList(LinkedList.Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
	}

	public static LinkedList createLinkedList() {
		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(100);
		LinkedList.Node n2 = new LinkedList.Node(200);
		LinkedList.Node n3 = new LinkedList.Node(300);
		LinkedList.Node n4 = new LinkedList.Node(400);
		LinkedList.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		return ll;
	}

}
