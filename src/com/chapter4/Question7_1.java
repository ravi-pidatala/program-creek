package com.chapter4;
/*
 * Method to return all root-leaf sum paths.

 1. List<ArrayList<TreeNode>> where each arralist corresponds to a successfult root-leaf sum path.
 2. Add root to a list.
 3. check current , check in left . check in right. 
 4. if path found, add the arraylist to the list<arraylist> . duplicate the arrayist, remove the element just added and continue the search.
 5. Recursive pattern.
 */

import java.util.ArrayList;
import java.util.List;

public class Question7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 236;
		List<ArrayList<TreeNode>> allPaths = new ArrayList<ArrayList<TreeNode>>();
		List<TreeNode> path = new ArrayList<>();

		TreeNode root = TreeUtil.constructTree4();
		path.add(root);

		getAllPaths(root, allPaths, path,sum - root.getData());
		
		for (ArrayList<TreeNode> nodeList: allPaths) {
			for (TreeNode node : nodeList) {
				System.out.print(node + "-->");
			}
			System.out.println();
		}

	}

	//Recursion
	static void getAllPaths(TreeNode node, List<ArrayList<TreeNode>> allPaths, List<TreeNode> path, int sum) {
		if (node == null) {
			return;
		}

		if (node.getLeft() == null && node.getRight() == null && sum == 0) {
			ArrayList<TreeNode> pathToAdd = new ArrayList<TreeNode>(path);
			allPaths.add(pathToAdd);
			path.remove(node);
			return;
		}

		if (node.getLeft() != null) {
			path.add(node.getLeft());
			getAllPaths(node.getLeft(), allPaths, path, sum - node.getLeft().getData());
			//path.remove(node.getLeft());
		}

		if (node.getRight() != null) {
			path.add(node.getRight());
			getAllPaths(node.getRight(), allPaths, path, sum - node.getRight().getData());
			//path.remove(node.getRight());
		}

		path.remove(node);
	}
}
