package com.chapter3;

/*
	Remove duplicates. in the result have only the ones that were distinct in the original linkedlist.
	if duplicate is found, get the previous node and remove the current one.
	Head node also may be duplicate. SPECIAL CASE.

	2>3>4>5>5>5>6>7>7
	2>3>4>6
	
	2>2>3>4>4>5
	3>5

	2>2>2>3>3
	
	One way is iterate through the linkedlist once and save the repeated ones into Set.

TODO

*/
public class Question7_1 {

	public static void main(String[] args) {
		
		//2>3>4>5>5>5>6>7>7
		NodeLinkedList list = new NodeLinkedList();
		Node head = new Node(2);
		Node node1 = new Node(3);
		Node node2 = new Node(4);
		Node node3 = new Node(5);
		Node node4 = new Node(5);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(7);
		
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
		
		
		removeDuplicates(list);
		LinkedListUtil.print(list);
	}
	
/*
check carefully for null nodes .
*/
//	static void removeDuplicates(NodeLinkedList list) {
//		
//		if (list.head == null) {
//			return;
//		}
//
//		Node head = list.head;
//		Node prev = head; 
//		Node p = head.next;
//
//		while (p != null && prev.data == p.data) {
//			list.head = p.next;
//			p = p.next;
//		}
//
//		while (p != null && p.next != null) {
//			if (p.data != p.next.data) {
//				p = p.next;
//				prev = prev.next;
//				continue;
//			}
//
//			while (p.next != null && p.data == p.next.data) {
//				// remove p also
//				p.next = p.next.next;
//			}
//			prev.next = p.next;
//		}
//
//}

	/*Helper node and two pointer approach
	 * have pointer at a current node.
	 * have pointer at next node(q). From next node get all the dups iterating.
	 * delete the nodes p.next to q
	 * 	2>3>4>5>5>5>6>7>7
		2>3>4>6
	
		2>2>3>4>4>5
		3>5

		2>2>2>3>3

	 */
	
	//Did this after debugging 
	static void removeDuplicates(NodeLinkedList list) {
		Node head = list.head;
		
		Node helper = new Node(0);
		helper.next = head;
		Node p = helper;
		boolean duplicate = false;

		while (p != null && p.next != null) {
			duplicate = false;
			Node last = p.next;

			//prev is the last node to be removed in the repetition.
			while (last != null && last.next != null && last.next.data == last.data) {
				last = last.next;
				duplicate = true;
			}
			if (duplicate) {
				p.next = last.next;// remove the nodes from p.next to prev
			} else {
				p = p.next;
			}
		}
			
		list.head = helper.next;

	}
}
