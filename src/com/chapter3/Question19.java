package com.chapter3;
/*
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 */
public class Question19 {

	public static void main(String [] args) {
		NodeLinkedList list = LinkedListUtil.construct();//2>3>4>5>6>7>8>9>10
		
		process(list);
		LinkedListUtil.print(list); //2>4>6>8>10>3>5>7>9>null
	}
	
	/*
	 * This requires two pointer approach. Slow pointer goes one , fast pointer moves two steps at a time.
	 * Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.
1s, 2f
take fast node into another list. slow node next is fastnode next. 
3s, 4f
1>3>4>5>null, 2>null

5s, nullf
1>3>5>null, 2>4>null

point tail of linkedlist to head of second linkedlist 

	 */
	static void process(NodeLinkedList list) {//Validations
		Node head = list.head;
		
		if (head == null || head.next == null) {
			return;
		}
		
		Node slow = head;
		Node fast = head.next;
		Node connect = head.next;
		
		while (slow != null && fast != null) {
			slow.next = fast.next;
			if (slow.next != null) {
				slow = slow.next;
			}
			fast.next = slow.next;
			fast = slow.next;	
		}
		slow.next = connect;
		
	}
}
