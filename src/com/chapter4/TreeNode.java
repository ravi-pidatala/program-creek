package com.chapter4;


public class TreeNode {

	private TreeNode left;
	private TreeNode right;
	private TreeNode parent; // for q6 only.
	private int data;	
	private int level; // for q4 only.

	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "" + data + "";
	}
}
