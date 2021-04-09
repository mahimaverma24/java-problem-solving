package com.ca.mahima.linkedlist;

public class SegregateEvenOdds {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(11);
		LinkedList.Node sec = new LinkedList.Node(2);
		LinkedList.Node th = new LinkedList.Node(30);
		LinkedList.Node fourth = new LinkedList.Node(41);
		LinkedList.Node fifth = new LinkedList.Node(5);

		LinkedList.head.next = sec;
		sec.next = th;
		th.next = fourth;
		fourth.next = fifth;

		System.out.println("Initially Linked list is------>");
		LinkedList.printLinkedList();

		segregate(ll);

	}

	private static void segregate(LinkedList ll) {

		LinkedList.Node n = LinkedList.head;
		LinkedList.Node odd = null;
		LinkedList.Node oddEnd = null;
		LinkedList.Node even = null;
		LinkedList.Node evenEnd = null;

		while (n != null) {

			if (n.data % 2 == 0) {
				if (even == null) {
					even = n;
					evenEnd = even;
				} else {
					evenEnd.next = n;
					evenEnd = evenEnd.next;
				}

			} else {

				if (odd == null) {
					odd = n;
					oddEnd = odd;
				} else {
					oddEnd.next = n;
					oddEnd = oddEnd.next;
				}
			}
			n = n.next;
		}

		if (even == null || odd == null) {
			return;
		}
		evenEnd.next = odd;
		oddEnd.next = null;
		LinkedList.head = even;

		System.out.println("Linked list after segregation of evens and odds ----------> ");
		LinkedList.printLinkedList();
	}
}
