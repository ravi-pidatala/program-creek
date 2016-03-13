package com.chapter1;

import java.util.HashMap;
import java.util.Map;

/*
	isomorphic strings.


*/
public class Question3 {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "fof"));
	}

	public static boolean isIsomorphic(String a, String b) {
		if (a == null || b == null || a.length() != b.length()) {
			return false;
		}


		Map<Character, Character> result = new HashMap<>();
		
		for (int i = 0; i < a.length(); i++) {
			Character aChar = a.charAt(i);
			Character bChar = b.charAt(i);

			if (aChar.equals(bChar)) {
				continue;
			}

			if (result.get(aChar) == null) {
				result.put(aChar, bChar); // replace aChar with bChar in String a
			} else if (result.get(aChar).equals(bChar)) { // replaced character. No violation
				continue;
			} else { // aChar was replaced by a different bChar before. String not isoMorphic
				return false;
			}
		}

		// print solution
		for (Map.Entry<Character, Character> entry: result.entrySet()) {
			System.out.println("Replcing char " + entry.getKey() + " with char " + entry.getValue());
		}
		return true;

	}
}
