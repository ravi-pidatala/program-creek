package com.chapter10;
/*
	Reverse integer

	take integer from last digit and put it into front.
	Saw answer online.
*/
public class Question1 {

	public static void main(String[] args) {
		System.out.println(reverse(-983409));
		
	}

	static int reverse(int x) {
		int rev = 0;

		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return rev;
	}

}
