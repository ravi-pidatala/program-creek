package com.chapter6;
/*
	QUICKSORT

	1. Choose the last point.
	2. arrange the array such that all less than or equal to the current are on left and greator than are on right.
	3. The pivot point will be left pointer after the comparison. Swap the left point one with the current object.
	4. Now quick sort the left half and right half leaving the current one. 
	5. This is in memory sort.
	6. This is recursive one.
	
*/
public class Question2 {

	public static void main(String[] args) {
		int [] a = {5, -10, 130, 200, 3, 5, 67, -10, -100, 450};
		//int [] a = {5, -10, 130, 200, 3,};
		//int [] a = {200, 5};
		quickSort(a, 0, a.length - 1);

		for (int x: a) {
			System.out.print(x + ",");
		}

	}

	static void quickSort(int [] a, int start, int end) {
		if (start >= end) {
			return;
		}
		
		int left = start;
		int right = end - 1;

		while (left <= right) {
			while (left < end && a[left] <= a[end]) {
				left++;
			}
			while (right >= start && a[right] > a[end]) {
				right--;
			}
			if (left < right) {
				swap(a, left, right);
			}
		}
		swap(a, left, end); // left is on an index where the element is greator than current or left has gone beyond array length.

		// left will be equal to a.length when element at index current is maximum in the array segment. 
		int pivot = left < a.length ? left: end;

		quickSort(a, start, pivot - 1);
		quickSort(a, pivot + 1, end);

	}

	static void swap(int [] a, int x, int y) {
		if (x >= a.length || y >= a.length) {
			return;
		}
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
