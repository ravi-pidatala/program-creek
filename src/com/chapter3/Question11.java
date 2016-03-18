package com.chapter3;

/*
 * 
 * Remove all nodes from a linked list which have a value.
 * GOT IDEA from online. HAVE HELPER NODE AS HEAD.
 * 
 *   3>2>3>4>4>4>4>5>
 *   2>4>4>4>4>5
 *   
 *    */
public class Question11 {

	public static void main(String[] args) {
		NodeLinkedList list = new NodeLinkedList();
		Node head = new Node(3);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(4);
		Node node5 = new Node(4);
		Node node6 = new Node(4);
		Node node7 = new Node(5);
		
		list.head = head;
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		removeElements(list,  3);
		
		Node p = list.head;
		
		while (p!=null) {
			System.out.print(p.data + "->");
			p = p.next;
		}
		
	}
	
	static void removeElements(NodeLinkedList list, int value) {
		Node head = list.head;
		Node helper = new Node(-1);
		helper.next = head;
		
		Node p = helper;		
		
		while (p.next != null) {
			if (p.next.data == value) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		list.head = helper.next;
	}

}
