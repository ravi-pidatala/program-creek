package com.chapter7;

public class Question7 {

	public static void main(String[] args) {
		int [] x = {2, 3, 1, 1, 4};
		int [] y = {3, 3, 0, 0, 1, 4};

		System.out.println(isReacheable(x));

		System.out.println(isReacheable(y));
	}
	
	static boolean isReacheable(int [] a) {
		//vali
 		boolean [] b = new boolean[a.length - 1];

		for (int i = a.length - 2; i >= 0; i--) {
			for(int j = i + a[i]; j >= i; j--) {
				if (j >= a.length - 1 || b[j]) {
					b[i] = true;
					break;
				}
			}
		}
		return b[0];
	}

}
