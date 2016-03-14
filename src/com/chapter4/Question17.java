package com.chapter4;
/*
	Implement a Trie with insert, search and startsWith methods.
	


*/
public class Question17 {

	public static void main(String[] args) {
		TrieNode root = TrieUtil.getTrie1();
		String s = "MAN";
		
		if (TrieUtil.search(root, s)) {
			System.out.println("String present");
		} else {
			System.out.println("String NOT present");
		}
	}
}
