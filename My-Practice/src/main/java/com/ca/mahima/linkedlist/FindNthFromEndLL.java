package com.ca.mahima.linkedlist;

/**
 * Program for n�th node from the end of a Linked List
 * 
 * @author mverma
 *
 */
public class FindNthFromEndLL {
	public static void main(String[] args) {
		LengthOfLL lenthClass = new LengthOfLL();
		int l = LengthOfLL.getLegth();
		int n = 1; // if we traverse from last the 3rd node will be 200
		LinkedList.Node nthNode = findNthFromLast(l, n);
		System.out.println("Nth node id -----> " + nthNode.data);

	}

	private static LinkedList.Node findNthFromLast(int l, int n) {
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
		if (LinkedList.head == null) {
			System.out.println("LL is empty");
		}

		if (n > l) {
			System.out.println("Invalid position");
		}
		LinkedList.Node temp = LinkedList.head;
		for (int i = 1; temp != null && i < (l - n + 1); i++) {
			temp = temp.next;
		}
		return temp;
	}
}
