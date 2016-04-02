package com.chapter7;

import java.util.HashMap;
import java.util.Map;
/*
	Since it is circle, first and last houses can not be robbed . get result excluding the first house, get result excluding last house.
	the greator of the two is the result.
*/
public class Question6_1 {

	public static void main(String[] args) {
		int [] a = {50, 1, 1, 50};

		int firstExcluded = robWithoutFirst(a, a.length - 1, new HashMap<Integer, Integer>());
		int lastExcluded = robWithoutLast(a, a.length - 2, new HashMap<Integer, Integer>());
		
		System.out.println("result excluding first is " + firstExcluded);
		System.out.println("result excluding last is " + lastExcluded);
			
	}

	static int robWithoutFirst(int [] a, int i, Map<Integer, Integer> robMap) {
		// validations

		if (i <= 0) {
			return 0;
		}

		if (robMap.get(i) == null) {
			robMap.put(i, Math.max(robWithoutFirst(a, i - 1, robMap), robWithoutFirst(a, i - 2, robMap) + a[i]));
		}

		return robMap.get(i);
	}

	static int robWithoutLast(int [] a, int i, Map<Integer, Integer> robMap) {
		// validations

		if (i < 0) {
			return 0;
		}

		if (i == 0) {
			return a[i];
		}

		if (robMap.get(i) == null) {
			robMap.put(i, Math.max(robWithoutLast(a, i - 1, robMap), robWithoutLast(a, i - 2, robMap) + a[i]));
		}

		return robMap.get(i);
	}



}
