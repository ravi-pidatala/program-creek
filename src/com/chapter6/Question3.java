package com.chapter6;
/*
	Insertion Sort
Got this after looking how it works in wikipedia.
Got it working in first attempt. Did this one carefully without hurrying.

*/
public class Question3 {

	public static void main(String[] args) {
		int [] a = {5, -10, 130, 200, 3, 5, 67, -10, -100, 450};
		//int [] a = {5, -10, 130, 200, 3,};
		//int [] a = {200, 5};

		for (int i = 1; i < a.length; i++) { // no need to sort the first element.
			insertionSort(a, i);
		}

		for (int x: a) {
			System.out.print(x + ",");
		}
		
	}

	static void insertionSort(int [] a, int index) {
		//TODO validations.
		int temp = a[index];
		int insertionPoint = -1;

		for (int i = index - 1; i >= 0; i--) {
			if (a[i] < temp) {
				insertionPoint = i;
				break;
			}
			a[i + 1] = a[i];// move the element to the right.
		}
		a[insertionPoint + 1] = temp;

	}

}
