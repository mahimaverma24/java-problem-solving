package com.ca.mahima.linkedlist;

public class ReverseLL {
	public static void main(String[] args) {

		LinkedListUtil.createLinkedList().printLinkedList();
		System.out.println("Reversed linked list is -----------> ");
		LinkedList.Node n = reverse();
		LinkedListUtil.printList(n);
	}

	public static LinkedList.Node reverse() {
		LinkedList ll = new LinkedList();

		LinkedList.Node prev = null;
		LinkedList.Node curr = LinkedList.head;
		LinkedList.Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;

	}
}
