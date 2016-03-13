package com.chapter5;

import java.util.List;

public class GraphUtil {
	
	static GraphNode rootNode = new GraphNode("0");;
	static GraphNode node1 = new GraphNode("1");
	//static GraphNode node2 = new GraphNode("2");
	static GraphNode node3 = new GraphNode("3");
	static GraphNode node4 = new GraphNode("4");
	static GraphNode node5 = new GraphNode("5");

	static GraphNode constructGraph() {
		

		rootNode.setAdjNodes(new GraphNode [] {node1, node4, node5});
		
		node1.setAdjNodes(new GraphNode[] {node3, node4, rootNode});
		node3.setAdjNodes(new GraphNode[] {node1, node4});
		node4.setAdjNodes(new GraphNode[] {rootNode, node1, node3});
		node5.setAdjNodes(new GraphNode[] {rootNode});
		
		return rootNode;	
	}
	
	static GraphNode[] getNodes() {
		return new GraphNode[] {rootNode,node1, node3, node4, node5}; 
	}
	       /*
	        * 0 --> 1, 4, 5
	        * 1 --> 3, 4
	        * 2 --> 1
	        * 3 --> 2,4
	        */
	  
	static void markAllAsUnvisited() {
		for (GraphNode node : getNodes()) {
			node.setVisited(false);
		}
	}
	
	static void setAllUnvisited(List<GraphNode> nodeList) {
		for (GraphNode node: nodeList) {
			node.setVisited(false);
		}
	}
}
