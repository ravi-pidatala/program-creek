package com.chapter6;

/*
	An array can be sorted using merge sort.
	1. have helper Array which is of same length as our array
	2. helperLeft and helper Right. 
	3. copy elements when necessary
	4. divide the array into half, sort left half, sort right half, merge both halves

	o[n log n] run time . extra space o[n]
*/
public class MergeSort {

	public static void main(String[] args) {
		int [] a = {1, -10, 9, 8, 100, 40, 450, -100, -10};
		int [] helper = new int [a.length];
		for (int x: a) {
			System.out.print(x + ",");
		}
		System.out.println();
		mergeSort(a, 0, a.length - 1, helper);

		for (int x: a) {
			System.out.print(x + ",");
		}
	}

	static void mergeSort(int [] a, int left, int right, int [] helper) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(a, left, mid, helper);
		mergeSort(a, mid + 1, right, helper);
		merge(a, left, mid, right, helper);
	}

	//mid is last element in the first half.
	static void merge(int [] a, int left, int mid, int right, int [] helper) {

		int helperL = left;
		int helperR = mid + 1;
		int index = left;

		//put elements from a into helper from left to right
		for (int i = left; i <= right; i++) {
			helper[i] = a[i];
		}

		while (helperL <= mid && helperR <= right) {
			if (helper[helperL] < helper[helperR]) {
				a[index++] = helper[helperL++];
			} else {
				a[index++] = helper[helperR++];
			}
		}

		while (helperL <= mid) {
			a[index++] = helper[helperL++];
		}




	}

}
