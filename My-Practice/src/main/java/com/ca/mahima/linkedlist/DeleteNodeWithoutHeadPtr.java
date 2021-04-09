package com.ca.mahima.linkedlist;

public class DeleteNodeWithoutHeadPtr {
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
		fourth.next = fifth;

		System.out.println("Initially Linked list is------>");
		LinkedList.printLinkedList();

		//deleteNode(th);
		deleteNodeWithoutHead(th);
		System.out.println("Linked list: deleting node " + th.data + " the list is---------> ");
		LinkedList.printLinkedList();
	}

	private static void deleteNode(LinkedList.Node n) {
		LinkedList.Node prev = n;
		if (n != null) {
			while (n.next != null) {

				int temp = n.data;
				n.data = n.next.data;
				n.next.data = temp;
				n = n.next;
			}
			//making last node null;
			LinkedList.Node fast = prev.next;
			while (fast.next != null) {
				prev = prev.next;
				fast = fast.next;
			}
			prev.next = null;

		}
	}
	
	private static void deleteNodeWithoutHead(LinkedList.Node node) {
		LinkedList.Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		System.gc();
		
	}

}
