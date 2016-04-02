package com.chapter7;
/*
	Best time to buy and sell a stock. Only one transaction can be made.

	Make note of max profit , updating the minimum element. The minimum element at a time need not correspond to max profit.

	This method works because we want min. element from left and max element from right to maximize the profit.
	Since it is proce of shares, the int array has non negative numbers only.
	Runtime is o[n]
*/
public class Question8 {

	public static void main(String[] args) {
		int [] a = {50, 300, 400, 500, 230, 55, 30, 490, 20};//min in array is 20 max is 500.

		System.out.println(getMaxProfit(a)); // 460 is max profit


	}

	static int getMaxProfit(int [] a) {
		int minimum = Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < a.length; i++) {
			profit = Math.max(profit, a[i] - minimum);
			minimum = Math.min(a[i] , minimum);
		}
		return profit;

	}

}
