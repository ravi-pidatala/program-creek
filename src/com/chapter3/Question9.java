package com.chapter3;

import java.util.HashMap;
import java.util.Map;

/*
	LRU cache.
	Doubly linked List and hashmap.

	Hashmap contains all the items that are present in the cache.
    When an item is requested, check if it is present in hashmap. 
    1. If not, insert the key  at head of linkedlist and delete element key from tail of it.

	2. If item present , remove the key from its position and add it to head.

*/
public class Question9 {
	static DoubleLinkedList dll = new DoubleLinkedList();
	static Map<Integer, Integer> valueMap = new HashMap<>();
	static int size = 10;
	
	public static void main(String[] args) {
		
	}
	
	public int get(int key) {
		/*
		 * 1. check if key is present in hashmap.
		 * 2. if present, return the value, get the key from dll and place it in the head.
		 * 3. If not present, get the value from database (or any other place). make call to set.
		 */
		
		if (valueMap.get(key) != null) {
			
			// iterate through the dll. find the key object
			DoubleLinkedistNode p = dll.head;
			
			while (p != null) {
				if (p.data == key) {
					// delete this node from current position and put it in head position.
					if (p.prev != null) { // current node is not head.
						p.prev.next = p.next;;
					}
					if (p.next!= null) { //curr node is not tail
						p.next.prev = p.prev;
					}
					dll.head = p;
					break;
				}
				p = p.next;
			}
			return valueMap.get(key);
		}  else {
			int value = getFromDatabase(key);
			set(key, value);
			return value;
		}
	}
	
	private int getFromDatabase(int key) {
		return key + 1000;
	}

	public void set(int key, int value){
		/*
		 * check if hasmap is full. If full , 
		 * delete the tail key in dll and corresponding key value pairs from hashmap.
		 * 
		 * else 
		 * insert the key into head of dll and make an entry of key value pairs into hashmap.
		 */
		
	//  value not present in cache
		
				
		if (valueMap.size() < size) { // hashmap not full. just put key object at head of dll and insert key value pair into hashmap
			valueMap.put(key, value);
			DoubleLinkedistNode node = new DoubleLinkedistNode(key);
			node.next = dll.head;
			dll.head = node;
		}

		if (valueMap.size() >= size) {
			DoubleLinkedistNode tail = dll.tail;
			tail.prev.next = null;
			tail.prev = null;

			valueMap.remove(tail.data);
			valueMap.put(key, value);
		}
		
	}
}
