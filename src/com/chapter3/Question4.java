package com.chapter3;

import java.util.HashMap;
import java.util.Map;

/*
	LinkedList is given. Each Node has an additional random pointer that points to any Node in the list or to null
	Make deep copy of the linked list.

	Idea is instantiate a map with node as key and its clone as value.
*/
public class Question4 {

	public static void main(String[] args) throws Exception {
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

		head.random = node2;
		node1.random = node2;
		node2.random = node3;
		node3.random = node4;
		node4.random = head;
		node5.random = node6;
		node6.random = null;
		node7.random = node4;


		Node cloneHead = copy(list);
		printList(cloneHead);


	}

	static void printList(Node head) {
		Node p = head;

		while (p != null) {
			if (!p.isClone) {
				System.out.println("Node not clone");
			}
			System.out.print(p.data + ",");
			if (p.random != null && !p.random.isClone) {
				System.out.println("Random Node not cloned");
			}
			if (p.random != null) {
				System.out.print(p.random.data);
			}
			
			System.out.print("->");
			p = p.next;
		}
	}
/*
	ASSUME Linkedlist has no cycle.
*/
	static Node copy(NodeLinkedList list) throws Exception {

		//First copy all the nodes and make clone
		Node node = list.head;
		Node cloneHead = node.clone();
		cloneHead.isClone = true;
		Node prev = cloneHead;


		Map<Node, Node> cloneMap = new HashMap<>();
		
		cloneMap.put(node, prev);
		prev.next = null;

		while (node.next != null) {
			Node clone = node.next.clone();
			clone.isClone = true;
			cloneMap.put(node.next, clone);
			prev.next = clone;
			clone.next = null;
			prev = clone;
			node = node.next;
		}

		Node p = cloneHead;

		while (p != null) {
			Node random = p.random;
			if (random != null && cloneMap.get(random) != null) {
				p.random = cloneMap.get(random);
			}
			p = p.next;
		}

		return cloneHead;

	}

}
