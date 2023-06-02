package com.collection;

import java.util.HashSet;

public class hashSetDemo3 {

	public static void main(String[] args) {
	
		//Union ,Intersection ,difference
        
		
		HashSet<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("HashSet 1:"+set1);
		
		
		

		HashSet<Integer> set2 = new HashSet<>();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		
		System.out.println("HashSet 2:"+set2);
		
		//Union it will find unique element from set1 and set2
		
		
		set1.addAll(set2);
		System.out.println("Union:"+set1);
		
		//intersection ,whatever common element between set1 and set2 
		
		set1.retainAll(set2);
		System.out.println("Intersection :"+set1);
		
		//difference
		
		set1.removeAll(set2);
		System.out.println("difference:"+set1);
		
	}

}
