package com.chapter3;
/*
 * find out if linkedlist has cycle in it.
 Two pointer method . If fast pointer and slow pointer meet any time , if has cycle. If fast pointer becomes null, no cycle.
 * 
 */
public class Question3 {

	public static void main(String[] args) {
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
		node6.next = node7;
		node7.next = node3;
		
		System.out.println(cycle(list));
		
	}

	static boolean cycle(NodeLinkedList list) {
		Node head = list.head;

		Node p1 = head;
		Node p2 = head; // fast pointer

		if (p2 == null || p2.next == null) {
			return false;
		}

		do  {
			p1 = p1.next;
			p2 = p2.next.next;
		} while (p2 != null && p1 != p2);

		if (p1 == p2) {
			return true;
		} else {
			return false;
		}
	}

}
