package com.chapter6;
/*
	MERGESORT
*/
	
public class Question1 {

	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4};
		int [] helper = new int[a.length];
		mergeSort(a, helper, 0, a.length - 1);

		for (int x: a) {
			System.out.print(x + ",");
		}
	}

	static void mergeSort(int [] a,int [] helper, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;

		mergeSort(a, helper, start, mid);
		mergeSort(a, helper, mid + 1, end);
		merge(a, helper, start, mid, end);
	}

	static void merge(int [] a, int [] helper, int left, int middle, int end) {

		for (int i = left; i <= middle; i++) {
			helper[i] = a[i];
		}

		int helperLeft = left;
		int helperRight = middle + 1;
		int index = left;

		while (helperLeft <= middle && helperRight <= end) {
			if (helper[helperLeft] <= a[helperRight]) {
				a[index++] = helper[helperLeft++];
			} else {
				a[index++] = a[helperRight++];
			}
		}

		while (helperLeft <= middle) {
			a[index++] = helper[helperLeft++];
		}
	}

}
