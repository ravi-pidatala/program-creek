package com.chapter1;
/*
	Consider the array like circular. 
	[1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 

	start from first element. get the k+ 1 element and put k in temp and first element in k  position.
	now , got k times from the k  position (at the end of array go to start).  Swap the temp and the position value.
	Continue till the first position gets its correct element. 
*/
public class Question1 {
	/*  
	    o[n] memory
		o[n - k] extra space
		
	*/
	public static void main(String [] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int k = 1;

		rotate(a, k);

		for(int x: a) {
			System.out.print(x + ",");
		}
	}

	static void rotate(int [] a , int k) {
		
		int n = a.length;
		if ( k <= 0 || (n % k == 0 && k != 1)) {
			return;
		}


		int [] b = new int [n - k];

		//copy the first n - k - 1  elements.
		for (int i = 0; i < n - k; i++) {
			b[i] = a[i];
		}

		// rotate the elements
		for (int i = 0; i < k ; i++) {
			a[i] = a[n - k + i];
		}

		for(int i = k; i < n; i++) {
			a[i] = b [i - k];
		}
	}

	/*
		Rotate the array each time.
		extra space - o[1]
		memory - o[n * k] since k times the array is rotated.
	*/
		public void rotate2(int [] a, int k) {
			for (int i = 0; i < k; i++) {
				int last = a[a.length - 1];

				for (int j = a.length - 1; j > 0; j--) {
					a[j] = a[j - 1]; 
				}
				a[0] = last;
			}
		}

		public void rotate3(int [] a, int k) {
			
		}



}
