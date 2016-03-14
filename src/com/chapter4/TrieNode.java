package com.chapter4;

public class TrieNode {
// A - Z (65 - 90)
	
	public TrieNode [] chars = new TrieNode[27];
	private char character;
	private boolean leaf;
	
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public char getCharacter() {
		return character;
	}
	public void setCharacter(char character) {
		this.character = character;
	}
	
}
