package com.chapter1;


/*
 * There are N children standing in a line. Each child is assigned a rating value. 
 * You are giving candies to these children subjected to the following requirements:
1. Each child must have at least one candy.
2. Children with a higher rating get more candies than their neighbors.

children --> 110, 11, 12, 41, 2, 1, 0, -1

Go from left to right once increasing . Go from right to left increasing when found. o[n]

110(1), 11(1), 12(2), 41(3), 2(1), 1(1), 0(1), -1(1)
110(2), 11(1), 12(2), 41(5), 2(4), 1(3), 0(2),-1(1)




Approach:
1. Each child must have atleast one candy , give one to each
2. Go forward. if current is greater than prev, give a candy to current.
3. If current is less than prev, continue and chocs ok, continue.
4. If current is less than prev and chocs not ok, increase prev chocs by 1, check condition for prev.

Take students in double linkedlist, so iteration is easy

 */
public class Question45 {

	public static void main(String[] args) {
		
		
		Child child1 = new Child(110);
		Child child2 = new Child(11);
		Child child3 = new Child(12);
		Child child4 = new Child(41);
		Child child5 = new Child(2);
		Child child6 = new Child(1);
		Child child7 = new Child(0);
		Child child8 = new Child(-1);
		Child child9 = new Child(10);
		
		Child [] children = {child1, child2, child3, child4, child5, child6, child7, child8, child9};
		
		giveChocs(children);
		
		for(Child c: children) {
			System.out.println(c.rating + "(" + c.chocolates + ")");
		}
		
		
	}
	
	public static void giveChocs(Child [] children) {
		
		//TODO validations
		children[0].chocolates = 1;
		
		//left to right.i.e comparison of current with left 
		for (int i = 1; i < children.length; i++) {
			if (children[i].rating > children[i - 1].rating) {
				children[i].chocolates = children[i - 1].chocolates + 1;
			} else {
				children[i].chocolates = 1;
			}
		}
		
		// right to left. compare with right one.
		for (int i = children.length - 2; i >= 0; i--) {
			if (children[i].rating > children[i + 1].rating && children[i].chocolates <= children[i + 1].chocolates) {
				children[i].chocolates = children[i + 1].chocolates + 1;
			}
		}
	}
	
//	public static void giveChocs(DoubleLinkedistNode p) {
//		while (p != null) {
//			if (p.prev != null && p.data > p.prev.data) {
//				p.chocs++;
//				p = p.next;
//				continue;
//			}
//			
//			if (p.prev != null && p.data < p.prev.data) {
//				if (p.chocs < p.prev.chocs) {
//					p = p.next;
//					continue;
//				} else {
//					//increase choc to prev 
//					p.prev.chocs++;
//					giveChocs(p.prev);
//					return;
//				}
//				
//			}
//		}
//		
//	}
}

class Child {
	public int rating;
	public int chocolates;
	
	public Child(int rating) {
		this.rating = rating;
	}
}
