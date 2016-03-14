package com.chapter4;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 * Method returns one roo-leaf path of sum.
 */
public class Question7 {

	public static void main(String[] args) {
		int sum = 236;

		TreeNode root = TreeUtil.constructTree4();
		List<TreeNode> nodeList = new ArrayList<>();
		nodeList.add(root);
		
		
		System.out.println(sumExists(root, sum - root.getData(), nodeList));
		
		for (TreeNode node: nodeList) {
			System.out.print(node + " -->");
		}
	}

	static boolean sumExists(TreeNode node, int sum, List<TreeNode> nodeList) {
		if (node == null) {
			return false;
		}

		if (node.getLeft() == null && node.getRight() == null && sum == 0) {
			return true;
		}

		if (node.getLeft() != null) {
			nodeList.add(node.getLeft());
			if (sumExists(node.getLeft(), sum - node.getLeft().getData(), nodeList)) {
				return true;
			} else {
				nodeList.remove(node.getLeft());
			}
		}

		if (node.getRight() != null) {
			nodeList.add(node.getRight());
			if (sumExists(node.getRight(), sum - node.getRight().getData(), nodeList)) {
				return true;
			} else {
				nodeList.remove(node.getRight());
			}
		}
		return false;
	}

}
