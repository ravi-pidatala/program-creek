package com.chapter4;

import com.chapter4.TreeNode;

public class TreeUtil {

	/*
	 * 			  67
	 *         /     \
	 *        34       91
	 *       /  \    /    \
	 *      4    56  88  1002
	 *                      \
	 *                      12200
	 */
	public static TreeNode constructTree() {
		TreeNode root = new TreeNode(67);
		TreeNode node1 = new TreeNode(34);
		TreeNode node2 = new TreeNode(91);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(56);
		TreeNode node5 = new TreeNode(88);
		TreeNode node6 = new TreeNode(1002);
		TreeNode node7 = new TreeNode(12200);
		
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setRight(node7);

		return root;
	}


	/*
	 * 			  67
	 *         /     \
	 *        34       91
	 *       /  \    /    \
	 *      4    56  66  1002
	 *                     \
	 *                      12200
	 *                      	\
	 *                     		12300 
	 */
	public static TreeNode constructTree2() {
		TreeNode root = new TreeNode(67);
		TreeNode node1 = new TreeNode(34);
		TreeNode node2 = new TreeNode(91);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(56);
		TreeNode node5 = new TreeNode(66);
		TreeNode node6 = new TreeNode(1002);
		TreeNode node7 = new TreeNode(12200);
		TreeNode node8 = new TreeNode(12300);
		
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setRight(node7);
		node7.setRight(node8);
		
		return root;
	}
	
	public static TreeNode constructTree3() {
	/*
	 * 			  25
	 *         /     \
	 *        23       33
	 *       /  \    /    \
	 *     21    24  31   39
	 *    /  \           /   \
	 *   2   22         32    12200
	 *                      	\
	 *                     		12300 
	 */
		TreeNode root = new TreeNode(25);
		TreeNode node1 = new TreeNode(23);
		TreeNode node2 = new TreeNode(33);
		TreeNode node3 = new TreeNode(21);
		TreeNode node4 = new TreeNode(24);
		TreeNode node5 = new TreeNode(31);
		TreeNode node6 = new TreeNode(39);
		TreeNode node7 = new TreeNode(2);
		TreeNode node8 = new TreeNode(22);
		TreeNode node9 = new TreeNode(32);
		TreeNode node10 = new TreeNode(12200);
		TreeNode node11 = new TreeNode(12300);

		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node3.setLeft(node7);
		node3.setRight(node8);
		node6.setLeft(node9);
		node6.setRight(node10);
		node10.setRight(node11);
	
		return root;
	
	
	}
	
	/*
	 * 			  67
	 *         /     \
	 *        34       91
	 *       /  \    /    \
	 *      4    56  88  1002
	 *         /    /      \
	 *        79  -10       12200
	 */
	public static TreeNode constructTree4() {
		TreeNode root = new TreeNode(67);
		TreeNode node1 = new TreeNode(34);
		TreeNode node2 = new TreeNode(91);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(56);
		TreeNode node5 = new TreeNode(88);
		TreeNode node6 = new TreeNode(1002);
		TreeNode node7 = new TreeNode(12200);
		TreeNode node8 = new TreeNode(-10);
		TreeNode node9 = new TreeNode(79);
		
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setRight(node7);
		node5.setLeft(node8);
		node4.setLeft(node9);

		return root;
	}

	
	
}
