package com.chapter7;

public class Question11 {

	public static void main(String[] args) {
		int [][] a = new int[4][3];
		a[0] = new int [] {1, 10, -10};
		a[1] = new int [] {5, 4, 3};
		a[2] = new int [] {-50, 60, 100};
		a[3] = new int [] {30, 15, -10};

		System.out.println(getPaths(a, 0, 0));
		System.out.println(getPathsOptimized(a));


	}

	static int getPaths(int [][] a, int r, int c) {

		if(r < a.length - 1 && c < a[0].length - 1) {
			return getPaths(a, r + 1, c) + getPaths(a, r, c + 1);
		}

		if (r < a.length - 1 || c < a.length - 1) {
			return 1;
		}
		return 0;
	}

	//Optimized method. Found this solution online.
	static int getPathsOptimized(int [][] a) {
		//VALS

		int [][] grid = new int [a.length] [a[0].length];

		// 1st column
		for (int i = 0; i < a.length; i++) {
			grid[i][0] = 1;
		}

		//1st row
		for (int j = 0; j < a[0].length; j++) {
			grid[0][j] = 1;
		}

		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				grid[i][j] = grid[i - 1] [j]+ grid[i][j - 1];
			}
		}
		return grid[a.length - 1][a[0].length - 1];

	}
}
