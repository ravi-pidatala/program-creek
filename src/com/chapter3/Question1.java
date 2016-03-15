package com.chapter3;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * two linked lists 
 * 2->4->7 + 9->7->8->4 = 1->2->6->5
 * 742 + 4879 = 5621
 Have prev, sum.
 * 
 */
public class Question1 {
	public static void main(String [] args) {
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
			
		a.add(2);
		a.add(4);
		a.add(7);

		b.add(9);
		b.add(7);
		b.add(8);
		b.add(4);

		LinkedList<Integer> result = getSum(a, b);
		ListIterator<Integer> it = result.listIterator();

		while (it.hasNext()) {
			System.out.print(it.next() + "->");
		}
			
	}
	
	static LinkedList<Integer> getSum(LinkedList<Integer> a, LinkedList<Integer> b) {
		
		LinkedList<Integer> result = new LinkedList<>();
		
		ListIterator<Integer> aIterator = a.listIterator();
		ListIterator<Integer> bIterator = b.listIterator();
		int prev = 0;
		
		while (aIterator.hasNext() && bIterator.hasNext()) {
			int sum = aIterator.next() + bIterator.next() + prev;
			prev = sum / 10;
			result.add(sum % 10);
		}

		while (aIterator.hasNext()) {
			int sum = aIterator.next() + prev;
			prev = sum / 10;
			result.add(sum % 10);
		}

		while (bIterator.hasNext()) {
			int sum = bIterator.next() + prev;
			prev = sum / 10;
			result.add(sum % 10);
		}
		
		if (prev != 0) {
			result.add(prev);
		}

		return result;
	}
	
}
