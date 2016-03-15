package com.chapter3;

public class Node implements Cloneable {
	
	public Node(int data) {
		this.data = data;
	}
	public Node next;
	public int data;
	public Node random; //for Q4
	public boolean isClone; //for Q4
	
	@Override
	public Node clone() throws CloneNotSupportedException {
		return (Node)super.clone();
	}
}
