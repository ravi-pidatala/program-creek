package com.chapter4;
/*
	Implement a Trie with insert, search and startsWith methods.
	


*/
public class Question17 {

	public static void main(String[] args) {
		TrieNode root = TrieUtil.getTrie1();
		String s = "MANYT";
		
		if (TrieUtil.search(root, s)) {
			System.out.println("String present");
		} else {
			System.out.println("String NOT present");
		}
		
		TrieUtil.insert("MANYT", root);
		
		if (TrieUtil.search(root, s)) {
			System.out.println("String" + s + " present");
		} else {
			System.out.println("String " + s + " NOT present");
		}
		
	}
}
