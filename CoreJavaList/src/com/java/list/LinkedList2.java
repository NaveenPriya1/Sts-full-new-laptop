package com.java.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer> ll = new LinkedList<>();
     ll.add(50);
     ll.add(99);
     ll.add(45);
     ll.add(77);
     
     Collections.sort(ll);
     System.out.println(ll);
    int index= Collections.binarySearch(ll, 99);
    System.out.println(index);
	}

}
