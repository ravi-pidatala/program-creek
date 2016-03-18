package com.chapter1;
/*
 * Increasing tuplet sub sequence
 * o[n]. it only goes through left to right one or less than one time
 */
public class Question53 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int [] a = {23, 42, 32, 33, 31, 30, 36, 37};

		System.out.println(isSubSequencePresent(a));// false



	}

	static boolean isSubSequencePresent(int [] a) {
		int i = 0;

		while (i <= a.length - 3) { // a.length -1, a.length - 2,
			System.out.println("processing " + i);
			if (a[i + 1] <= a[i]) {
				i++;
				continue;
			}
			if (a[i + 2] <= a[i + 1]) {
				i += 2;
			} else {
				return true;
			}

		}
		return false;


	}

}
