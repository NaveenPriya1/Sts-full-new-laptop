package com.priorityque;

import java.util.PriorityQueue;

public class PollingTech {
	//polling technique on priority queue it will sort
	
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		 pq.add(10);
	     pq.add(67);
	     pq.add(76);
	     pq.add(87);
	     pq.add(1);
	     
	     System.out.println(pq.poll());//1
	     System.out.println(pq.poll());//10
	     System.out.println(pq.poll());//67
	     System.out.println(pq.poll());//76
	     System.out.println(pq.poll());//87
	     System.out.println(pq.poll());//null
	     
	}

}
