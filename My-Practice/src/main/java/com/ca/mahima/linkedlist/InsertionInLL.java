package com.ca.mahima.linkedlist;

public class InsertionInLL {

	public static void main(String[] arg) {

		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(12);
		LinkedList.Node sec = new LinkedList.Node(33);
		LinkedList.Node th = new LinkedList.Node(24);
		LinkedList.head.next = sec;
		sec.next = th;
		System.out.println("Initially Linked list is------>");
		LinkedList.printLinkedList();
		int data = 17;
		insertAtFirst(data);
		System.out.println("After insertion of node " + data + " at first position, the linked list is ------>");
		LinkedList.printLinkedList();

		System.out.println("Inserting 100 after node 33 linked list is ------->");
		insertAfterGivenNode(sec, 100);
		LinkedList.printLinkedList();

		System.out.println("Inserting given node 200 at last. The linked list is -------->");
		insertAtLast(200);
		LinkedList.printLinkedList();
	}

	public static void insertAtFirst(int data) {
		LinkedList ll = new LinkedList();
		LinkedList.Node newNode = new LinkedList.Node(data);
		newNode.next = LinkedList.head;
		LinkedList.head = newNode;
	}

	public static void insertAfterGivenNode(LinkedList.Node prev, int data) {
		LinkedList ll = new LinkedList();
		LinkedList.Node newNode = new LinkedList.Node(data);
		newNode.next = prev.next;
		prev.next = newNode;
	}

	/* --Add a node at the end-- */

	public static void insertAtLast(int data) {
		LinkedList ll = new LinkedList();
		LinkedList.Node lastNode = new LinkedList.Node(data);
		LinkedList.Node prev = LinkedList.head;

		while (prev.next != null) {
			prev = prev.next;
		}
		prev.next = lastNode;
	}
}
