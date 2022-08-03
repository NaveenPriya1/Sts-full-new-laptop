package com.java.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList<>();
		ll.add(2);
		ll.add(7);
		ll.add("Naveen");
		
		System.out.println(ll);
		
		//iterator
		
		Iterator itr =ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		System.out.println();
		
		ll.add(10.33);
		// contains
		System.out.println(ll.contains(10.33));
		//remove
		ll.remove(2);
		//size
		System.out.println(ll.size());
		//remove all
		ll.removeAll(ll);
		System.out.println(ll);

	}

}
