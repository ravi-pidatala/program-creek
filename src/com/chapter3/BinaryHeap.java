package com.chapter3;
/*
 * 
 * Found how to perform heapsort by looking and by luck.
 */
public class BinaryHeap {

	public static void main(String[] args) {
		int [] a = {5, 10, 21, 6, -9 , 10};
		for(int x: a) {
			System.out.print(x + ",");
		}
		
		//heapify(a);
		maxHeapSort(a); // finds the minimum element and puts it at the back of array.
		System.out.println();
		for(int x: a) {
			System.out.print(x + ",");
		}

	}

	// min heap the integer array. the array has 1 based index.
	static void heapify(int [] a) {
		int n = a.length;
		for (int i = n / 2; i >= 0; i--) {
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			int min = i;

			if (left < n && a[left] < a[min]) {
				min = left;
			}
			if (right < n && a[right] < a[min]) {
				min = right;
			}

			swap(a, i, min);
		}
	}
	
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	// min heap the integer array. the array has 1 based index.
	static void heapify(int [] a, int n) {
		for (int i = n / 2; i >= 0; i--) {
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			int min = i;

			if (left < n && a[left] < a[min]) {
				min = left;
			}
			if (right < n && a[right] < a[min]) {
				min = right;
			}

			swap(a, i, min);
		}
	}
	
	
	static void maxHeapSort(int [] a) {
		for (int i = a.length; i > 0; i--) {
			heapify(a, i);
			swap(a, i - 1, 0);
		}
	}

}
