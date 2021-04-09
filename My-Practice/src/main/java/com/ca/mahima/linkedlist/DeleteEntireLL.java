package com.ca.mahima.linkedlist;

public class DeleteEntireLL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(100);
		LinkedList.Node n2 = new LinkedList.Node(200);
		LinkedList.Node n3 = new LinkedList.Node(300);
		LinkedList.Node n4 = new LinkedList.Node(400);
		LinkedList.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		System.out.println("Initial linked list is -------->");
		LinkedList.printLinkedList();

		deleteLL();
		System.out.println("LL is deleted successfully-------->");
		LinkedList.printLinkedList();
	}

	private static void deleteLL() {
		LinkedList ll = new LinkedList();
		if (LinkedList.head == null) {
			System.out.println("LL is empty");
		}

		while (LinkedList.head != null && LinkedList.head.next != null) {
			LinkedList.Node temp = LinkedList.head;
			LinkedList.Node next = temp.next;
			LinkedList.head = LinkedList.head.next;
			temp = null;
		}
		if (LinkedList.head.next == null)
			LinkedList.head = null;
	}
}
