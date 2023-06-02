package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		
		//default capacity 16 Load Factor 0.75
		//HashSet hs = new HashSet();
		
		//HashSet hs = new HashSet(100); //initaial capacity 100
		
		//HashSet hs = new HashSet(100,(float)0.90);
        
		//HashSet<Integer> hs = new HashSet<Integer> ();
		
		HashSet hs = new HashSet();
		
		//Add object /elements into Hashset
		
		
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		//hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		//remove
		hs.remove(16.4);
		System.out.println("After Removing the element:"+hs);
		
		
		//conatains
		
		System.out.println(hs.contains("welcome"));
		
		System.out.println(hs.contains("xyz"));//not present
		
		System.out.println(hs.isEmpty());
		
		//Reading Object/element from hashset using for...each loop
		
		for(Object e:hs)
		{
			System.out.println(e);
			
		}
		//Reading data using Iterator 
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
	}

}
