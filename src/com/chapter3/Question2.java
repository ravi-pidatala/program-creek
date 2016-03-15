package com.chapter3;

import java.util.LinkedList;

/*
	0->1->2->3->4->5->6->7
	0>7>1>6>2>5>3>4

	0->1->2->3->4->5->6
	0>6>1>5>2>4>3

	0
	0

	In place sort without altering node's values. n * n /2 i.e o[n^2].
	
	Two pointer approach? 

	Looked for solution online. 
	1. Break the linked list into two lists in half.
	2. Reverse the order of second list.
	3. Merge the two linkedlists.
*/
public class Question2 {

	public static void main(String [] args) {
		NodeLinkedList list = new NodeLinkedList();
		Node head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		list.head = head;
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		//node6.next = node7;

		printList(list);
		System.out.println();
		reorderList(list);
		
		
	}

	static void reorderList(NodeLinkedList list) {
		Node head = list.head;

		if (head == null) {
			return;
		}


		Node p1 = head;
		Node p2 = head;

		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}

		//break linkedlist . till  p1 is one and after p1 is next linked list
		Node head2 = p1.next;
		p1.next = null;
		NodeLinkedList list2 = new NodeLinkedList();
		list2.head = head2;

		NodeLinkedList reverse = reverseOrder(list2);

		merge(list, reverse);

		printList(list);

	}

	static void printList(NodeLinkedList list) {
		Node temp = list.head;

		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	static NodeLinkedList reverseOrder(NodeLinkedList list) {
		if (list.head == null) {
			return null;
		}
		NodeLinkedList reverse = new NodeLinkedList();

		while (list.head != null) {
			reverse.insertFirst(list.removeHead());
		}
		
		return reverse;
	}
/*
	
*/
	static void merge(NodeLinkedList list1, NodeLinkedList list2) {
		Node p = list1.head;
		
		while (list2.head != null && p != null) {
			Node temp = p.next;
			p.next = list2.removeHead();
			p.next.next = temp;
			p = p.next.next;
		}
	}

}