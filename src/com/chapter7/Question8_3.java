package com.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Got this idea when i solved before questions.
 */
public class Question8_3 {

	public static void main(String[] args) {
		int [] a = {100, 99, 98, 5, 6, 8, 10, 4, 110, 6, 4, 5, 3};
		int k = 3;
		
		List<Integer> profitList = getProfitList(a);

		System.out.println(getMaxProfit(profitList , 1));


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

	static int getMaxProfit(List<Integer> profitList, int k) {
		Collections.sort(profitList, Collections.reverseOrder());
		int profit = 0;
		int i = 1;
		for (int x: profitList) {
			profit = profit + x;
			if (i == k) {
				break;
			}
			i++;
		}
		return profit;
	}

}
