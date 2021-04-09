package com.ca.mahima.linkedlist;

/**
 * Given a linked list, delete N nodes after skipping M nodes of a linked list
 * until the last of the linked list.
 * 
 * @author mverma
 *
 */
public class DeleteMnodesAfterNnode {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.head = new LinkedList.Node(100);
		LinkedList.Node sec = new LinkedList.Node(200);
		LinkedList.Node th = new LinkedList.Node(300);
		LinkedList.Node fourth = new LinkedList.Node(400);
		LinkedList.Node fifth = new LinkedList.Node(500);
		LinkedList.Node sixth = new LinkedList.Node(600);

		LinkedList.head.next = sec;
		sec.next = th;
		th.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		System.out.println("Initially Linked list is------>");
		LinkedList.printLinkedList();
		int m = 2; // position
		int n = 1; // delete 1 nodes
		// deleteNnodesAfterM(m, n);
		linkdelete(LinkedList.head, m, n);
		System.out.println("Linked list: deleting " + n + " nodes after skipping " + m + " nodes.");
		LinkedList.printLinkedList();
	}

	private static void deleteNnodesAfterM(int m, int n) {
		LinkedList ll = new LinkedList();
		LinkedList.Node temp = LinkedList.head;
		LinkedList.Node prev = LinkedList.head;

		for (int i = 0; temp != null && i < m; i++) {
			prev = temp;
			temp = temp.next;
		}

		while (temp != null && n != 0) {
			temp = temp.next;
			n--;
		}
		prev.next = temp;
	}

	static void linkdelete(LinkedList.Node head, int M, int N) {

		LinkedList.Node temp = head;
		LinkedList.Node prev = head;
		while (temp != null) {
			int n = N;
			for (int i = 0; temp != null && i < M; i++) {
				prev = temp;
				temp = temp.next;
			}

			while (temp != null && n != 0) {
				temp = temp.next;
				n--;
			}
			prev.next = temp;
		}

	}
}
