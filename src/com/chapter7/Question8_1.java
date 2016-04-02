package com.chapter7;
/*Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).


1. Do not own stock
	take current day is x. Go forward till i get day y such that , p(y) > p(y - 1) && p(y) > p(y + 1). Buy stock at day x and sell it at day y

Copare price of current day with that of next day. If 

*/
public class Question8_1 {

	public static void main(String[] args) {
			
		int [] a = {100, 99, 98, 5, 6, 8, 10, 4, 110, 6, 4, 5, 3};
		System.out.println(getMaxProfit(a));
		int [] b = {50, 40, 30, 20};
		System.out.println(getMaxProfit(b));
	}

	static int getMaxProfit(int [] a) {
		int profit = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				continue;
			}

			int j = i + 1;

			while (j < a.length) {
				if (a[j] > a[j - 1] && (j == a.length - 1 || a[j] > a[j + 1])) {
					// buy stock at day i and sell it at day j.
					System.out.println("but stock at day " + i + " and sell at day " + j + "with profit " + (a[j] - a[i]));
					profit = profit + a[j] - a[i];
					i = j; // for loop will increment i by 1
					break;
				}
				j++;
			}
		}
		return profit;
	}
}
