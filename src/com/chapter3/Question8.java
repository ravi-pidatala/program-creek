package com.chapter3;

import java.util.Iterator;
import java.util.LinkedList;

/*
	Partition a singly linkedlist.
	all nodes < x come before all nodes >= x

	1>3>4>5>-10>9>23>400>-20 . x = 5

	Go through the linked list  . If an element is >= x , remove it from current linkedlist and put it in a different ll.
	joiin both the lists in the end.

	o[n] runtime.
	o[1] extra space.
 
*/
public class Question8 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();

		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(5);

		l1.add(-10);
		l1.add(9);
		l1.add(23);
		l1.add(400);
		l1.add(-20);

		Iterator<Integer> it = l1.iterator();
		
		while (it.hasNext()) {
			System.out.print(it.next() + "->");
		}
		
		partitionIt(l1, 5);
		System.out.println();
		it = l1.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "->");
		}
		
		
	}
	
	static void partitionIt(LinkedList<Integer> l1, int x) {
		LinkedList<Integer> l2 = new LinkedList<>();

		Iterator<Integer> it = l1.iterator();

		while (it.hasNext()) {
			Integer a = it.next();
			if (a >= x) {
				//put it into another ll
				it.remove();
				l2.add(a);
			}
		}
		
		l1.addAll(l2);
		
	}

}
