package com.chapter7;

import java.util.HashMap;
import java.util.Map;

/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26

Given an encoded message containing digits, determine the total number of ways to decode it.


 */
public class Question12 {

	public static void main(String[] args) {
		String message = "102569";

		System.out.println(getWays(message, new HashMap<String, Integer>()));

	}

	static int getWays(String m, Map<String, Integer> waysMap) {
		//TODO validate the message
		
		if (m.length() == 0 || m.length() == 1) {
			return 1;
		}
		if (waysMap.get(m) != null) {
			return waysMap.get(m);
		}

		if ((m.charAt(0) == '1' || m.charAt(0) == '2') && m.charAt(1) != '0') {
			// 2 ways to decode
			waysMap.put(m, getWays(m.substring(1, m.length()), waysMap) + getWays(m.substring(2, m.length()), waysMap));
			return waysMap.get(m);
		}

		waysMap.put(m, getWays(m.substring(1, m.length()), waysMap));
		return waysMap.get(m);
	}



}
