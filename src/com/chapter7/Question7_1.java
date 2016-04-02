package com.chapter7;

/*
	After constructing boolean array like before, start from index , check out the max it can reach and see if the max index is out of range 
	or max index is true. If not both, check for max - 1. If found , increase step count by 1 and continue till the end.
*/
public class Question7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {2, 3, 1, 1, 4};
		int [] y = {3, 3, 0, 0, 1, 4};

		System.out.println(getMinJumpCount(x));

		System.out.println(getMinJumpCount(y));

	}

	static int getMinJumpCount(int [] a) {

		boolean [] b = new boolean[a.length - 1];
		//construct boolean array b
		for (int i = a.length - 2; i >= 0; i--) {
			for (int j = i + a[i]; j>= i; j--) {
				if (j >= a.length - 1 || b[j]) {
					b[i] = true;
					break;
				}
			}
		}

		if (!b[0]) {
			return -1;
		}
		int jumps = 0;
	

		for (int i = 0; i <= a.length - 2;) {
//			if (i + a[i] >= a.length - 1) {
//				System.out.println("jumping from " + i + " to " + i + a[i]);
//				jumps++;
//				break;
//			}

			for (int j = a[i] + i; j >= i; j--) {
				if (j >= a.length - 1 || b[j]) {
					jumps++;
					System.out.println("jumping from " + i + " to " + j);
					i = j;
					break;
				}
			}
		}
		return jumps;



	}

}
