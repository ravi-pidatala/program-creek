package com.chapter5;

import java.util.List;

public class GraphNode implements Cloneable {
	
	private String data;
	private boolean visited;	
	private boolean clone;
	
	private GraphNode[] adjNodes;
	private List<GraphNode> adjNodeList;
	
	public GraphNode(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public GraphNode[] getAdjNodes() {
		return adjNodes;
	}

	public void setAdjNodes(GraphNode [] adjNodes) {
		this.adjNodes = adjNodes;
	}

	public List<GraphNode> getAdjNodeList() {
		return adjNodeList;
	}

	public void setAdjNodeList(List<GraphNode> adjNodeList) {
		this.adjNodeList = adjNodeList;
	}
	
	public boolean isClone() {
		return clone;
	}

	public void setClone(boolean clone) {
		this.clone = clone;
	}

	@Override
	public String toString() {
		return data + " " + isClone();
	}
	
	@Override
	public GraphNode clone() throws CloneNotSupportedException {
		return (GraphNode)super.clone();
	}
}
