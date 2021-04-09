package com.ca.mahima.linkedlist;

import com.ca.mahima.linkedlist.LinkedList.Node;

public class LengthOfLL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.head = new Node(100);
		Node n2 = new Node(200);
		Node n3 = new Node(300);
		Node n4 = new Node(400);
		LinkedList.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		int len = getLegth();
		System.out.println("The length of LL is ------>   " + len);
	}

	public static int getLegth() {
		LinkedList ll = new LinkedList();
		int len = 0;
		while (LinkedList.head != null) {
			len++;
			LinkedList.head = LinkedList.head.next;
		}
		return len;

	}
}
