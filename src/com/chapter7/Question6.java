package com.chapter7;

import java.util.HashMap;
import java.util.Map;
/*
 * Got idea by looking at hint very good question
 */
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {50, 1, 1, 50, 100, 101};

		Map<Integer, Integer> robMap = new HashMap<Integer, Integer>();
		System.out.println(rob(a, a.length - 1));
		System.out.println(dpRob(a, a.length - 1, robMap));
	}

	static int rob(int [] a, int i) {
		if (i >= a.length) {
			// log error
			return 0;
		}

		if (i < 0) {
			return 0;
		}

		if (i == 0) {
			return a[i];
		}

		return Math.max(rob(a, i - 1), rob(a, i - 2) + a[i]);
	}

	static int dpRob(int [] a, int i, Map<Integer, Integer> robMap) {
		if (i >= a.length || robMap == null) {
			// log error
			return 0;
		}

		if (i < 0) {
			return 0;
		}

		if (i == 0) {
			return a[i];
		}

		if (robMap.get(i) == null) {
			robMap.put(i, Math.max(dpRob(a, i - 1, robMap), dpRob(a, i - 2, robMap) + a[i]));
		}
		return robMap.get(i);
	}

}
