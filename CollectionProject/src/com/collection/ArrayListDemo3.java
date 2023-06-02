package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String arr[] = {"Dog","cat","element"};
		
		for(String value :arr)
		{
			
			System.out.println(value);
		}
     
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
		
		
	}

}
