package com.chapter4;

import java.util.LinkedList;
import java.util.Queue;

public class Question4 {


	/*
	level order traversal of graph.
	similar to BFS . Check if level increase can be detected somehow.

	Have variable level inside TreeNode.Each time , its children are added to queue, increase the level and add.
	Have variable prevLevel at method level . Check if current Level is > prev level , print a new line.
	This is not recursive method.

	This question was asked in VM Ware phone interview. Remembered that Queue needs to be used in such scenerios.

	Saw online that this can be done using two Queues. Got similar idea before but did not try to implement
	this.
	
	*/
	public static void main(String[] args) {
		TreeNode root = TreeUtil.constructTree();
		printLevelOrder(root);
		
		System.out.println();
		printLevelOrder2(root);

	}

	public static void printLevelOrder(TreeNode root) {

		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		int prevLevel = 0;
		System.out.print(prevLevel + ": ");

		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			if (node.getLeft() != null) {
				q.add(node.getLeft());
				node.getLeft().setLevel(node.getLevel() + 1);
			}
			if (node.getRight() != null) {
				q.add(node.getRight());
				node.getRight().setLevel(node.getLevel() + 1);
			}

			if (prevLevel < node.getLevel()) {
				System.out.println();
				System.out.print(++prevLevel + ": ");
			}

			System.out.print(node + "-->");

		}

	}

	public static void printLevelOrder2(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();
		
		q.add(root);
		
		int prevLevel = 0;
		System.out.print(prevLevel + ": ");

		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			if (node.getLeft() != null) {
				q2.add(node.getLeft());
			}
			if (node.getRight() != null) {
				q2.add(node.getRight());
			}

			System.out.print(node + "-->");

			if (q.isEmpty() && !q2.isEmpty()) {
				q.addAll(q2);
				q2.clear();
				System.out.println();
				System.out.print(++prevLevel + ": ");
			}
			

		}

	}

}
