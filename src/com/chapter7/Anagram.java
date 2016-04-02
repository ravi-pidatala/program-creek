package com.chapter7;

import java.util.ArrayList;
import java.util.List;

/*
 * Print all anagrams of a given string. 
 * Solve small problem . Build it from there.
 */
public class Anagram {

	public static void main(String[] args) {
		
		List<String> anagrams = printAnagrams("abcde");
		
		int index = 1;
		for (String x: anagrams) {
			System.out.println( index++ + ":" +  x);
		}
	}
	
	static List<String> printAnagrams(String s) {
		char [] c = s.toCharArray();
		List<String> r = new ArrayList<>();
		
		r.add(c[0] + "");
		
		for (int i = 1; i < c.length; i++) {
			List<String> temp = new ArrayList<>();
			
			for (String x: r) {
				for (int j = 0; j <= x.length(); j++) {
					String y = x.substring(0, j) + c[i] + x.substring(j, x.length());
					temp.add(y);
				}
			}
			r = temp;
		}
		return r;
	}

}
