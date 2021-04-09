package com.ca.mahima.linkedlist;

public class MiddleElementLL {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(100);
		LinkedList.Node sec = new LinkedList.Node(200);
		LinkedList.Node th = new LinkedList.Node(300);
		LinkedList.Node fourth = new LinkedList.Node(400);
		LinkedList.Node fifth = new LinkedList.Node(500);

		LinkedList.head.next = sec;
		sec.next = th;
		th.next = fourth;
		fourth.next  =fifth;
		System.out.println("Initially Linked list is------>");
		LinkedList.printLinkedList();

		int mid = getMid();
		System.out.println("The mid element of LL is ----> " + mid);
	}

	private static int getMid() {
		LinkedList ll = new LinkedList();
		LinkedList.Node slowPtr = LinkedList.head;
		LinkedList.Node fastPtr = LinkedList.head;

		while (fastPtr != null && fastPtr.next != null) {

			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return slowPtr.data;
	}

}
