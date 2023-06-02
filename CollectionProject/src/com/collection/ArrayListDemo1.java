package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//ArrayList al = new ArrayList();
		
		//ArrayList<Integer> al = new ArrayList<>();
		//ArrayList<String> al = new ArrayList<>();
		//List al = new ArrayList();
		ArrayList al = new ArrayList();
		
		//Add new element to the arrayList
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println(al);
		
		//size()
        System.out.println("number of elements in arrayList: "+al.size());
        //remove
        al.remove(1);//here 1 is index
        //al.remove("welcome");//here welcome is element
        System.out.println("after removing element:"+al);
        
        //insert new Element
        al.add(2, "Python");
        System.out.println("After insertion:"+al);
        
        //retreive specific element
       System.out.println( al.get(2));
       
       //change element or replace
       al.set(2, "c#");
       System.out.println("After replacing element:"+al);
       
       //searching
       System.out.println(al.contains("c#"));
       System.out.println(al.contains("c"));
       
       //isEmpty
       System.out.println(al.isEmpty());
       
       //for loop to read the data
       
       
       System.out.println("Reading elements using  for loop:");
       for(int i=0; i<al.size(); i++)
       {
    	   
    	   System.out.println(al.get(i));
       }
       
       
       
       
       //for each loop to read the data
       
       System.out.println("reading elements using for each loop..........");
       for(Object e: al)
       {
    	   
    	   System.out.println(e);
       }
       
       
       //iterator() to read the data
       
       System.out.println("Reading element using iterator....");
       
       Iterator it = al.iterator();
       //System.out.println(it)o/p=java.util.ArrayList$Itr@5a07e868; 
       
       
       while(it.hasNext())
       {
    	   
    	   System.out.println(it.next());
       }
       
       
       
	}

}
