package com.priorityque;

import java.util.PriorityQueue;

public class PeekOnly {
     
	// peek only technique
	
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		 pq.add(10);
	     pq.add(67);
	     pq.add(76);
	     pq.add(87);
	     pq.add(1);
	     
	     System.out.println(pq.peek());//1
	     System.out.println(pq.peek());//1
	     System.out.println(pq.peek());//1
	}

}
