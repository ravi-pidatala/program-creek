package com.chapter3;
/*
 * Remove nth node from end of the list.
 * Two pointer approach.
 * 
 * 1>2>3>4>5>6>   n = 2
 * 1>2>3>4>6>
 * 
 */
public class Question14 {

	public static void main(String[] args) {
		//2>3>4>5>6>7>8>9>10
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
		
		removeFromEnd(list, 10);
		
		LinkedListUtil.print(list);
	}
	
	static void removeFromEnd(NodeLinkedList list, int n) {
		Node left = list.head;
		Node right = list.head;
		
		int i = 1;
		while (i <= n && right != null) {
			right = right.next;
			i++;
		}
		if (right == null) {
			return;
		}
		while (right.next != null) {
			left = left.next;
			right = right.next;
		}
		if (left == null || left.next == null) {
			return;
		}
		left.next = left.next.next;
		return;
	}

}
