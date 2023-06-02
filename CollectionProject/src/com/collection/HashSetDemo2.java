package com.collection;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber = new HashSet<>();
         
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("Hashset:"+evenNumber);
		
		//addAll()
		HashSet<Integer> number = new HashSet<>();
		number.addAll(evenNumber);
		number.add(10);
		
		System.out.println("New HashSet:"+number);
		
		//removeAll
		
		number.removeAll(evenNumber);
		System.out.println("After removing:"+number);
		
		
	}

}
