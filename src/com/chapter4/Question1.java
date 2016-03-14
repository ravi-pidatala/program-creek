package com.chapter4;
/*
PRE ORDER TRAVERSAL
*/
public class Question1 {

	public static void main(String [] args) {
		TreeNode root = TreeUtil.constructTree();
		preOrderTraversal(root);
	}

/*
	current -> left --> right 
	in recursion.
*/
	static void preOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + ",");
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}
}
