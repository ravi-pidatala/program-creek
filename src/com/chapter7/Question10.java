package com.chapter7;

public class Question10 {
/*
	1 10 -10
	5  4   3
  -50 60 100
   30 15 -10
*/
	public static void main(String[] args) {
		int [][] a = new int[4][3];
		a[0] = new int [] {1, 10, -10};
		a[1] = new int [] {5, 4, 3};
		a[2] = new int [] {-50, 60, 100};
		a[3] = new int [] {30, 15, -10};
		System.out.println();
		System.out.println("minimum sum is " + getMinSum(a, 0, 0, a[0][0]));
		System.out.println("minimum sum is " + getMinSumOptimum(a));

	}

	// static int getMinSum(int [] [] a, int d, int r, int sum) {
	// 	int rSum = sum;
	// 	int dSum = sum;

	// 	if (d < a.length - 1 && r < a[0].length) {
	// 		dSum = getMinSum(a, d + 1, r, sum + a[d + 1][r]);
	// 	}

	// 	if (r < a[0].length - 1  && d < a.length) {
	// 		rSum = getMinSum(a, d, r + 1, sum + a[d][r + 1]);
	// 	} 


	// 	int minSum = (rSum < dSum ? rSum: dSum);
	// 	if (d == a.length - 1 && r == a[0].length - 1) {
	// 		return minSum;
	// 	}
	// }

	//brute force aproach.
	static int getMinSum(int [][]a, int r, int c, int sum) {
		if (r == a.length - 1 && c == a[0].length - 1) {
			return sum;
		}

		if (r < a.length - 1 && c < a[0].length - 1) {
			int downSum = getMinSum(a, r + 1, c, sum + a[r + 1][c]);
			int rightSum = getMinSum(a, r, c + 1, sum + a[r][c + 1]);
			return (downSum < rightSum ? downSum: rightSum);
		}

		//go down
		if (r < a.length - 1) {
			return getMinSum(a, r + 1, c, sum + a[r + 1][c]);
		}

		//go right
		if (c < a[0].length - 1) {
			return getMinSum(a, r, c + 1, sum + a[r][c + 1]);
		}

		return -1;
	}


	static int getMinSumOptimum(int [][] a) {
		
		int [][] grid = new int [a.length][a[0].length];
		grid[0][0] = a[0][0];

		// populate first column
		for (int i = 1; i < a.length; i++) {
			grid[i][0] = a[i][0] + grid[i - 1][0];
		}
 
		//populate first row
		for (int j = 1; j < a[0].length; j++) {
			grid[0][j] = grid[0][j - 1] + a[0][j];
		}

		// i corresponds to row number
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				// j to column number
				grid[i][j] = a[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
			}
		}

		return grid[a.length - 1] [a[0].length - 1];

	}

}
