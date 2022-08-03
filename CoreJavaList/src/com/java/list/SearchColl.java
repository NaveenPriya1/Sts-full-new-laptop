package com.java.list;

import java.util.ArrayList;
import java.util.Collections;

public class SearchColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> al = new ArrayList<>();
     al.add(5);
     al.add(10);
     al.add(50);
     al.add(1);
     
     Collections.sort(al);
    int index = Collections.binarySearch(al, 50);
    System.out.println(index);
    System.out.println(al.get(index));
    
    System.out.println(al.contains(20));
    System.out.println(al.contains(5));
    al.remove(2);
    System.out.println(al);
	}

}
