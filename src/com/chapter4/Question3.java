package com.chapter4;

public class Question3 {
/*
 * POST ORDER left, right, current
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = TreeUtil.constructTree();
		postOrderTraversal(root);
	}
	
	static void postOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		
		postOrderTraversal(node.getLeft());
		postOrderTraversal(node.getRight());
		System.out.println(node.getData());
	}

}
