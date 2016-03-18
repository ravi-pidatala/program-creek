package com.chapter3;
/*
 * 
 * Sorted linkedlist . So just compare the ones that are beside each other.
 */
public class Question7 {

	public static void main(String [] args) {
		NodeLinkedList list = new NodeLinkedList();
		Node head = new Node(0);
		Node node1 = new Node(0);
		Node node2 = new Node(2);
		Node node3 = new Node(2);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(5);
		Node node7 = new Node(6);
		
		list.head = head;
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		printlist(head);
		
		removeDuplicates(list);
		System.out.println();
		
		printlist(head);
	}
	
	static void printlist(Node head) {
		Node p = head;
		
		while (p != null) {
			System.out.print(p.data + "->");
			p = p.next;
		}
	}

//ASSUME NO CYCLe in linkedlist
	/*
	delete all duplicates from sortedlinkedlist so that each element appears only once.
	*/
	static void removeDuplicates(NodeLinkedList list) {
		Node p = list.head;

		while (p != null && p.next != null) {
			if (p.data == p.next.data) {
				Node delete = p.next;
				p.next = p.next.next;
				delete.next = null;
			}
			p = p.next;
		}
	}
}