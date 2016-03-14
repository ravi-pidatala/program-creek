package com.chapter4;

public class TrieUtil {

	public static TrieNode getTrie1() {
		TrieNode root = new TrieNode();
		
		TrieNode node1 = new TrieNode();
		TrieNode node2 = new TrieNode();
		TrieNode node3 = new TrieNode();
		TrieNode node4 = new TrieNode();
		TrieNode node5 = new TrieNode();
		TrieNode node6 = new TrieNode();
		TrieNode node7 = new TrieNode();
		TrieNode node8 = new TrieNode();
		TrieNode node9 = new TrieNode();
		TrieNode node10 = new TrieNode();
		TrieNode node11 = new TrieNode();
		TrieNode node12 = new TrieNode();
		TrieNode node13 = new TrieNode();
		TrieNode node14 = new TrieNode();
		
		node1.setCharacter('M');
		node2.setCharacter('L');
		node3.setCharacter('A');
		node4.setCharacter('A');
		node5.setCharacter('Y');
		node6.setCharacter('I');
		node7.setCharacter('[');
		node8.setCharacter('N');
		node9.setCharacter('[');
		node10.setCharacter('E');
		node11.setCharacter('Y');
		node12.setCharacter('[');
		node13.setCharacter('[');
		node14.setCharacter('[');
		
		root.chars['M' - 65] = node1;
		root.chars['L' - 65] = node2;
		root.chars['A' - 65] = node3;
		
		node1.chars['A' - 65] = node4;
		node1.chars['Y' - 65] = node5;
		node2.chars['I' - 65] = node6;
		node3.chars[26] = node7;
		
		node4.chars['N' - 65] = node8;
		node5.chars[26] = node9;
		node6.chars['E' - 65] = node10;
		
		node8.chars['Y' - 65] = node11;
		node10.chars[26] = node13;
		
		node11.chars[26] = node14;
		
		return root;
	}
	
	
	public static boolean search(TrieNode node, String s) {
		s = s + '[';
		for (int i = 0; i < s.length(); i++) {
			if (search(node, s, i)) {
				node = node.chars[s.charAt(i) - 65];
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean prefix(TrieNode node, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (search(node, s, i)) {
				node = node.chars[s.charAt(i) - 65];
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean search(TrieNode node, String s, int index) {
		if (index > 26 || index < 0) {
			return false;
		}
		
		if (node.chars[s.charAt(index) - 65] != null) {
			return true;
		}
		return false;
	}
}
