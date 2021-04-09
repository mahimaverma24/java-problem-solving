package com.ca.mahima.linkedlist;

import com.ca.mahima.linkedlist.LinkedList.Node;

public class LoopInLL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.head = new Node(100);
		Node sec = new Node(200);
		Node th = new Node(300);
		Node fourth = new Node(400);
		Node fifth = new Node(500);
		LinkedList.head.next = sec;
		sec.next = th;
		th.next = fourth;
		fourth.next = fifth;
		fifth.next = sec;

		boolean found = getLoopNode();
		System.out.println("Loop detected in LL ------> " + found);

		int len = getLengthOfLoop();
		System.out.println("The length of loop is ---------> " + len);

	}

	private static int getLengthOfLoop() {
		LinkedList ll = new LinkedList();
		Node slowPtr = LinkedList.head;
		Node fastPtr = LinkedList.head;
		int count = 0;

		while (slowPtr.next != null && fastPtr.next != null && fastPtr.next.next != null) {

			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

			if (slowPtr == fastPtr) {
				count = countNodesInLoop(slowPtr);
				break;
			}

		}
		return count;
	}

	private static int countNodesInLoop(Node node) {
		int count = 1;
		Node temp = node;

		while (temp.next != node) {
			count++;
			temp = temp.next;
		}

		return count;

	}

	private static boolean getLoopNode() {
		LinkedList ll = new LinkedList();
		Node slowPtr = LinkedList.head;
		Node fastPtr = LinkedList.head;
		boolean flag = false;

		while (slowPtr.next != null && fastPtr.next != null && fastPtr.next.next != null) {

			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

			if (slowPtr == fastPtr) {
				flag = true;
				break;
			}

		}
		return flag;
	}

}
