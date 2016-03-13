package com.chapter1;

import java.util.Stack;

public class Question2 {
	public static void main(String [] args) {
		String [] a = {"5", "1", "2", "+", "4", "*", "+","3", "−"};
		System.out.println(getResult(a));
	}

/*
	push values into stack and compute .
	Not doing validations. They include checking elements in stack and checking if stack is empty.
*/
	public static int getResult(String [] a) {
		Stack<Integer> s = new Stack<>();

		for(String x: a) {
			try {
				Integer y = Integer.parseInt(x);
				s.add(y);
			} catch (NumberFormatException nfe) {
				performOperation(s, x);
			}
			
		}
		return s.pop();
	}

	static void performOperation(Stack<Integer> s, String op) {

		Integer y = s.pop();
		Integer z = s.pop();

		switch (op.charAt(0)) {
			case '*':
				s.add(y * z);
				break;
			case '+':
				s.add(y + z);
				break;
			case '−':
				s.add(z - y);
				break;
			case '/':
				s.add(z / y);
				break;
			default:
				System.out.println("Invalid operation" + op);
		}
	}
}