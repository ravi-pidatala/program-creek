package com.chapter4;

public class Question2 {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.constructTree();
		inOrderTraversal(root);
	}
	
	//left, current, right
	static void inOrderTraversal (TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getData() + ",");
		inOrderTraversal(node.getRight());
		
	}

}
