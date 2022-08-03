package com.priorityque;

import java.util.PriorityQueue;

public class PriyorityQEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue<>();
		 pq.add(10);
	     pq.add(67);
	     pq.add(76);
	     pq.add(87);
	     pq.add(1);
	     
	     System.out.println(pq);
	     System.out.println(pq.contains(76));
	     System.out.println(pq.remove(76));
	     System.out.println(pq);
	     pq.removeAll(pq);
	     System.out.println(pq);

	}

}
