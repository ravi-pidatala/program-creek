package com.chapter4;

import java.util.LinkedList;

public class Question6 {

	/*
		flatten binary tree to linked list. 
		Perform in pre order traversal and put elements into linkedlist
		Recursive solution
		
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = TreeUtil.constructTree();
		LinkedList<TreeNode> nodeList = new LinkedList<>();
		build(root, nodeList);

		for (TreeNode node: nodeList) {
			System.out.print(node + "->");
		}

	}

	static void build(TreeNode node, LinkedList<TreeNode> nodeList) {
		if (node == null) {
			return;
		}

		nodeList.add(node);
		build(node.getLeft(), nodeList);
		build(node.getRight(), nodeList);

	}

}
