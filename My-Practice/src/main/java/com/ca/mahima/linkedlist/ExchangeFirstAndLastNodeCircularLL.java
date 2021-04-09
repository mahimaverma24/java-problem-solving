package com.ca.mahima.linkedlist;

/**
 * Just swap data of first and last element see the logic of iterating it in do
 * while loop.
 *
 */
public class ExchangeFirstAndLastNodeCircularLL {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(12);
		LinkedList.Node sec = new LinkedList.Node(33);
		LinkedList.Node th = new LinkedList.Node(24);
		LinkedList.head.next = sec;
		sec.next = th;
		th.next = LinkedList.head; // circular LL
		System.out.println("Initially Circular LL is ------->");
		printCircularLinkedList(LinkedList.head);
		System.out.println(" ");
		System.out.println("After swaping Circular LL is ------->");
		exchangeFirstAndLast(LinkedList.head);
	}

	private static void exchangeFirstAndLast(LinkedList.Node head) {

		LinkedList.Node last = head;
		while (last.next != head)
			last = last.next;
		// System.out.println(last.data);
		LinkedList.Node headNode = swapNodes(last, head);
		printCircularLinkedList(headNode);
	}

	private static LinkedList.Node swapNodes(LinkedList.Node last, LinkedList.Node head) {
		int temp;
		temp = last.data;
		last.data = head.data;
		head.data = temp;
		return head;
	}

	private static void printCircularLinkedList(LinkedList.Node head) {
		LinkedList.Node n = head;
		do {
			System.out.print(n.data + " ");
			n = n.next;

		} while (n != head);
	}

}
