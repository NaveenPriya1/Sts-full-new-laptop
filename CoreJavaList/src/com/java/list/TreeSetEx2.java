package com.java.list;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet ts= new TreeSet<>();
       ts.add("Naveen");
       ts.add("Suresh");
       ts.add("amar");
       ts.add("Akash");
       ts.add("Zahir");
       System.out.println(ts);
       System.out.println(ts.size());
       System.out.println(ts.contains("amar"));
	}
    //tree set follows assecending order
}
