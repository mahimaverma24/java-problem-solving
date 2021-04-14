package com.ca.mahima.linkedlist;

/*Removal of every 'kth' person from a circle. Find the last remaining person.
input--> A->B->C->D->A...   //circular LL
* Steps:-  1. value is 2; remove B at position 2 then-> A->C->D...
    2. remove D; pointer is on C (as B has been removed; next element will be head) at position 2 --> A->C..
    3. remove C at position 3 --> A winner since one element remaining.
*

*/
class Winner {

    public static class Node {
        char data;
        Node next;

        Node(char d) {
            this.data = d;
            this.next = null;
        }
    }

    static Node head;

    public static void main(String[] args) {

        Node nodeA = new Node('A');
        head = nodeA;
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('D');
        head.next.next.next.next = nodeA; // making it circular linkedlist

        int valueToElimatePlayer = 2;

        eliminatePlayer(valueToElimatePlayer);
    }

    private static void eliminatePlayer(int value) {

        int pos = 1;
        Node nextHead = head;

        while (nextHead != null && nextHead.next != null) {
            if (pos == value) {
                nextHead = deleteNode(nextHead);
                pos = 1;
            }
            nextHead = nextHead.next;
            pos++;
            if (nextHead.data == nextHead.next.data) {
                System.out.println("The winner is--- " + nextHead.data);
                break;
            }
        }

    }

    private static Node deleteNode(Node node) {

        Node temp = head, prev = null;
        if (head.data == node.data) {
            temp = temp.next;
        }

        while (temp.data != node.data) {
            prev = temp;
            temp = temp.next;
        }
        // unlink to be deleted node
        prev.next = temp.next;
        return prev.next;
    }

}
