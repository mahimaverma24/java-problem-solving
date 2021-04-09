package com.ca.mahima.linkedlist;

public class ReporderLL {
	public static void main(String[] args) {
		LinkedList l1 = LinkedListUtil.createLinkedList();
		LinkedList.printLinkedList();
		System.out.println("Reversed linked list is -----------> ");
		LinkedList l2 = new LinkedList();
		ReverseLL reverseLl = new ReverseLL();
		LinkedList.Node head = ReverseLL.reverse();
		LinkedList.head = head;
		System.out.println("Re ordered list is-------------->");
		LinkedList ll = reverseOrder(l1, l2);
		LinkedListUtil.printList(LinkedList.head);
	}

	private static LinkedList reverseOrder(LinkedList l1, LinkedList l2) {
		LinkedList.Node n1 = LinkedList.head;
		LinkedList.Node n2 = LinkedList.head;
		LinkedList ll = new LinkedList();
		LinkedList.Node temp = null;
		if (n1 != null && n2 != null) {
			while (n1.next != null && n2.next != null) {
				temp = n1;
				temp = temp.next;
				n1 = n1.next;
				temp = n2;
				temp = temp.next;
				n2 = n2.next;
			}
			LinkedList.head = temp;
		}
		return ll;
	}
}
