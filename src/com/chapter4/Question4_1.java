package com.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
	continuation of previous problem. 
	Non recursive
	put all the elements from level q into new Linkedlist and add it to the arraylist.
	Recurse the arraylist from last.
*/
public class Question4_1 {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.constructTree();

		List<ArrayList<TreeNode>> levelArrayList = getTreeNodes(root);

		for (int i = levelArrayList.size() - 1; i >= 0; i--) {
			printList(levelArrayList.get(i));
		}		

	}

	static void printList(ArrayList<TreeNode> nodeList) {
		for (TreeNode node: nodeList) {
			System.out.print(node + "->");
		}

		System.out.println();
	}

	static List<ArrayList<TreeNode>> getTreeNodes(TreeNode root) {
		List<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();

		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();

		q1.add(root);
		result.add(new ArrayList<TreeNode>(q1));

		while (!q1.isEmpty()) {
			TreeNode node = q1.poll();

			if (node.getLeft() != null) {
				q2.add(node.getLeft());
			}

			if (node.getRight() != null) {
				q2.add(node.getRight());
			}

			if (q1.isEmpty()) {
				q1.addAll(q2);
				q2.clear();
				ArrayList<TreeNode> levelList = new ArrayList<TreeNode>(q1);
				result.add(levelList);
			}
		}
		return result;
	}

}
