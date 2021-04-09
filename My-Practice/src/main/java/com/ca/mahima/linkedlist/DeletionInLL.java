package com.ca.mahima.linkedlist;

public class DeletionInLL {

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

		/* Given a key, deletes the first occurrence of key in linked list */
		int key = 2;
		// deleteKey(key);
		// System.out.println("After deleting key " + key + " from LL, the linked list
		// is -------->");
		// ll.printLinkedList();
		int position = 2;
		System.out.println("After deleting node at position " + position + " the LL is ----------->");
		deletionAtPosition(position);
		LinkedList.printLinkedList();
	}

	private static void deletionAtPosition(int pos) {
		LinkedList ll = new LinkedList();
		LinkedList.Node curr = LinkedList.head;
		if (pos == 0) {
			LinkedList.head = curr.next; // Change head
			return;
		}

		for (int i = 0; curr != null && i < pos - 1; i++) {
			curr = curr.next;
		}

		if (curr == null || curr.next == null) {
			System.out.println("Position not found");
			return;
		}

		LinkedList.Node next = curr.next.next;
		curr.next = next;

	}

	private static void deleteKey(int key) {
		LinkedList ll = new LinkedList();
		LinkedList.Node prev = null;
		LinkedList.Node curr = LinkedList.head;
		// Node next = ll.head;
		if (curr != null && curr.data == key) {
			LinkedList.head = curr.next;
			return;
		}
		while (curr != null && curr.data != key) {
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			System.out.println("key not found");
			return;
		}

		prev.next = curr.next;

	}

}
