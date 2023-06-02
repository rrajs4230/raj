package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		
		ArrayList al = new ArrayList();
		
		//group of elements
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("A");
		al.add("B");
		al.add("c");
		
		ArrayList al_dup = new ArrayList();
		
		al_dup.addAll(al);
		System.out.println(al_dup);//[x, y, z, A, B, c]
         
		al_dup.removeAll(al);
		System.out.println("after removing:"+al_dup);//[]
		
		
		//sort---------Collections.sort()
		
		System.out.println("Elements in the array list:"+al);
		
		Collections.sort(al);
		System.out.println("Elements in the array list after sorting:"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("After sorting element:"+al);
		
		//Shuffling
		Collections.shuffle(al);
		System.out.println("After shuffling:"+al);
		
	}

}
