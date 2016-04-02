package com.chapter7;

import java.util.ArrayList;
import java.util.List;

/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Can do it like 8_1. How ever do not add profits in here. just have an array list called profit list. select maximum two profits from the list

*/
public class Question8_2 {

	public static void main(String[] args) {
		int [] a = {100, 99, 98, 5, 6, 8, 10, 4, 110, 6, 4, 5, 3};
		
		List<Integer> profitList = getProfitList(a);

		System.out.println(getMaxProfit(profitList));


	}

	static List<Integer> getProfitList(int [] a) {
		List<Integer> profitList = new ArrayList<>();

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				continue;
			}

			int j = i + 1;

			while (j < a.length) {
				if (a[j] > a[j - 1] && (j == a.length - 1 || a[j] > a[j + 1])) {
					// buy stock at day i and sell at day j
					int profit = a[j] - a[i];
					System.out.println("but stock at day " + i + " and sell at day " + j + "with profit " + (a[j] - a[i]));
					profitList.add(profit);
					i = j;
					break;
				}
				j++;
			}
		}
		return profitList;
	}

	static int getMaxProfit(List<Integer> profitList) {
		int max1 = 0;
		int max2 = 0;

		for (int x: profitList) {
			if (x > max1 && x > max2) {
				max2 = max1;
				max1 = x;
			} else if (x > max2) {
				max2 = x;
			}
		}
		return max1 + max2;
	}


}
