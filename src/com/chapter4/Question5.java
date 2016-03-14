package com.chapter4;

/*
	Given binary tree , Check if it is binary search tree.

	Recursive solution. 
	if currNode > leftNode and curr Node < rightNode and left subtree is binary Search , right subtree is binary search.

	Did this wrong for the first time. Then got idea that i already solved it before. Remember the concept.

	1. is Current node within limits.
	2. set limits for left child and call to isBst
	3. set limits for right child and call to isBst



*/
public class Question5 {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.constructTree();
		TreeNode root2 = TreeUtil.constructTree2();
		TreeNode root3 = TreeUtil.constructTree3();

		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println(isBST(root2, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println(isBST(root3, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	//no repetitions.
	static boolean isBST(TreeNode node, int min, int max) {
		if (node == null) {
			return true;
		}

		boolean isBst = true;

		if (node.getData() < min || node.getData() > max) {
			isBst = false;
		}

		if (isBst && node.getLeft() != null) {
			isBst = isBST(node.getLeft(), min, node.getData());
		}

		if (isBst && node.getRight() != null) {
			isBst = isBST(node.getRight(), node.getData(), max);
		}

		return isBst;

	}




}