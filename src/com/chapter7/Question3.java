package com.chapter7;

/*
 * Longest pallindrome substring
 * aaba
 */
public class Question3 {
	
	public static void main(String [] args) {
		
		String s = "aabaaa";

		System.out.println(getLongestPallindromeSubstring(s));
	}
	
	static String getLongestPallindromeSubstring(String s) {
		
		String longestPallindome = new String("");

		for (int i = 1; i < s.length(); i++) {
			String temp = s.charAt(i) + "";
			
			// find pallindrome string with i as center
			int j = i;
			int index = 1;
			while (j - index >= 0 && j + index < s.length()) {
				if (s.charAt(j - index) == s.charAt(j + index)) {
					temp = s.substring(j - index, j + index + 1);
				}
				index++;
			}
			if (temp.length() > longestPallindome.length()) {
				longestPallindome = temp;
			}
		}

		return longestPallindome;
	}
}
