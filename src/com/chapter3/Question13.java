package com.chapter3;
/*
 * Reverse a singly linked list
 *  1>2>3>4>5>6>7
 *  7>6>5>4>3>2>1
 *  
 *  is there a way to do it in place?
 *  Yes, Create a linked list, remove head from here, append the node to head
 *  
 */
public class Question13 {

	public static void main(String[] args) {
		//2>3>4>5>6>7>8>9>10
		//3>2>null
				NodeLinkedList list = new NodeLinkedList();
				Node head = new Node(2);
				Node node1 = new Node(3);
				Node node2 = new Node(4);
				Node node3 = new Node(5);
				Node node4 = new Node(6);
				Node node5 = new Node(7);
				Node node6 = new Node(8);
				Node node7 = new Node(9);
				Node node8 = new Node(10);
				
				list.head = head;
				head.next = node1;
				node1.next = node2;
				node2.next = node3;
				node3.next = node4;
				node4.next = node5;
				node5.next = node6;
				node6.next = node7;
				node7.next = node8;
				
				LinkedListUtil.print(list);
				
				reverse(list);
				LinkedListUtil.print(list);
				
	}
	
	static void reverse(NodeLinkedList list) {
		Node p = list.head;
		Node q = null;
		
		while (p != null) {
			Node temp = p;
			p = p.next;
			temp.next = q;
			q = temp;
		}
		list.head = q;
		
	}

}
