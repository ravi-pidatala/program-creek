package com.chapter3;
/*
 * Swap every two adjacent nodes in list
	
	2>4>6>7>8>9>10
	4>2>7>6>9>8>10

	Swap the p and p.next nodes. Use a helper node as head.

	Save p.next.next into temp
	p.next.next = temp.next // remove temp node from list
	temp.next = p.next
	p.next = temp.//DONE
	
	Got it wrong in first attempt.
 */
public class Question12 {

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
		
		swapAdjacent(list);
		
		LinkedListUtil.print(list);//3>2>5>4>7>6>9>8>10

	}

	static void swapAdjacent(NodeLinkedList list) {
		Node helper = new Node(0);
		helper.next = list.head;
		Node p = helper;

		while (p.next != null && p.next.next != null) {
			//swap the p.next and p.next.next
			Node temp = p.next.next;
			p.next.next = temp.next; // removed temp node from list
			temp.next = p.next;
			p.next = temp;

			p = p.next.next;
		}

		//helper.next = list.head; //DID THIS WRONG FIRST TIME . THIS LINE IS A MISTAKE
		list.head = helper.next;
	}

}
