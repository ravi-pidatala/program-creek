package com.chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/*
 * got idea looking online. Could get result after some series of trials.
 */
public class Question1 {

	public static void main(String[] args) {
		GraphNode root = GraphUtil.constructGraph();
		
		try {
			List<GraphNode> clonedNodes = clone(root);
			
			// traverse the cloned root
			Queue<GraphNode> cloneQ = new LinkedList<>();
			
			cloneQ.add(clonedNodes.get(0));
			
			GraphUtil.setAllUnvisited(clonedNodes);
			
			while (!cloneQ.isEmpty()) {
				GraphNode n = cloneQ.poll();
				if (!n.isVisited()) {
					System.out.println(n + " cloned :" + n.isClone());
					
					for (GraphNode node: n.getAdjNodes()) {
						cloneQ.add(node);
					}
				}
				n.setVisited(true);
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * try using the bfs.
	 */
	public static List<GraphNode> clone(GraphNode node) throws CloneNotSupportedException {
		Queue<GraphNode> q = new LinkedList<>();
		List<GraphNode> clonedNodes = new ArrayList<>();
		
		q.add(node);
		Map<GraphNode, GraphNode> cloneMap = new HashMap<>();
		GraphNode clonedRoot = null;
		
		while (!q.isEmpty()) {
			GraphNode n = q.poll();
			if (!n.isVisited()) {
				
				GraphNode clonedNode = n.clone(); // only n is cloned , not adjacent nodes.
				clonedNodes.add(clonedNode);
				if (clonedRoot == null) {
					clonedRoot = clonedNode;
				}
				
				cloneMap.put(n,  clonedNode);
				clonedNode.setClone(true);
				
				for (int i = 0; i < n.getAdjNodes().length; i++) {
					GraphNode neighbour = n.getAdjNodes()[i];

					for (int j = 0; j < neighbour.getAdjNodes().length; j++) {
						GraphNode adjAdj = neighbour.getAdjNodes()[j];
						if (cloneMap.get(adjAdj) != null) {
							neighbour.getAdjNodes()[j] = cloneMap.get(adjAdj);
						}
					}
					q.add(n.getAdjNodes()[i]);
				}
				
				n.setVisited(true);
				clonedNode.setVisited(true);
			}
		}
		return clonedNodes;
	}

	
}
