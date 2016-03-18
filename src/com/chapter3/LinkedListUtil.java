package com.chapter3;

public class LinkedListUtil {

	public static void print(NodeLinkedList list) {
		Node p = list.head;
		
		while (p != null) {
			System.out.print(p.data + "->");
			p = p.next;
		}
		System.out.println();
	}
}
