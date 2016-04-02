package com.chapter7;

import com.chapter4.TreeNode;
import com.chapter4.TreeUtil;

/*
 * The houses form a binary tree. If the root is robbed, its left and right can not be robbed.

 */
public class Question6_2 {

	public static void main(String[] args) {
		
		TreeNode root = TreeUtil.constructTree();
		int [] result = getMax(root);

		System.out.println(Math.max(result[0], result[1]));
		
		
		
		
		
	}

	// int [] -> 0 is including current . 1 is excluding current.

	static int [] getMax(TreeNode node) {
		if (node == null) {
			return new int [] {0, 0};
		}

		int [] left = getMax(node.getLeft());
		int [] right = getMax(node.getRight());
		int [] result = new int[2];

		result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		result[1] = left[0] + node.getData() + right[0];

		return result;

	}

}
