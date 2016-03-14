package com.chapter1;
/*
 * REVERSE WORDS IN A STRING
 * 
 * "The Sky is Blue" --> Blue is Sky The"
 * Need to handle some special cases.
 */
public class Question30 {

	public static void main(String[] args) {
		System.out.println(reverse("The Sky is Blue"));
	}

	static String reverse(String s) {
		String [] a = s.split("\\s");
		
		// now swap first and last 
		int left = 0;
		int right = a.length - 1;
		
		while (left < right) {
			swap(a, left++, right--);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (String x: a) {
			sb.append(x + " ");
		}
		return sb.toString();
	}
	
	static void swap(String [] a, int left, int right) {
		String temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
}
