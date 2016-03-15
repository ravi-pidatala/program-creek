package com.chapter3;

public class NodeLinkedList {

	public Node head;
	
	public Node insertFirst(Node node) {
		if (head == null) {
			head = node;
			head.next = null;
		} else {
			node.next = head;
			head = node;
		}
		return node;
	}
	
	public Node removeHead() {
		if (head == null) {
			return null;
		}
		
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	
}
