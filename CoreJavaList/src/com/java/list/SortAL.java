package com.java.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> al = new ArrayList<>();
     al.add(5);
     al.add(10);
     al.add(50);
     al.add(1);
     
     Collections.sort(al);
     System.out.println(al);
	}

}
