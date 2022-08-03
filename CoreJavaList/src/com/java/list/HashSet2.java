package com.java.list;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set hs= new HashSet<>(32,0.90f);
       hs.add(10.33);
       hs.add(67);
       hs.add(76);
       hs.add(87);
       hs.add(1);
       System.out.println(hs);
       
       hs.remove(76);
       System.out.println(hs);
       hs.removeAll(hs);
       System.out.println(hs.contains(10.33));
	}

}
