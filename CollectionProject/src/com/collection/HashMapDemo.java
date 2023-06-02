package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap m = new HashMap();
        HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		
		//HashMap m = new HashMap();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "x");//{101=John, 102=David, 103=x, 104=Mary, 105=Tye}
		m.put(106, "David");
		System.out.println(m);//{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
		System.out.println(m.get(105));//Tye
		
		m.remove(106);//remove pair from HashMap
		System.out.println(m);
		
		System.out.println(m.containsKey(101));//true
		System.out.println(m.containsKey(106));//false
		
		System.out.println(m.containsValue("Mary"));//true
		
		
		System.out.println(m.containsValue("rahul"));//false
		System.out.println(m.isEmpty());//false
		
		
		System.out.println(m.keySet());//[101, 102, 103, 104, 105]
		System.out.println(m.values());//[John, David, x, Mary, Tye]
		
		System.out.println(m.entrySet());//[101=John, 102=David, 103=x, 104=Mary, 105=Tye]
		
		
		//Read data as indiviual
		
		for(Object i:m.keySet())
		{
			
			System.out.println(i);
		}
		System.out.println("only values.......");
		for(Object i:m.values())
		{
			
			System.out.println(i);
		}
		
		System.out.println("................");
		
		for(Object i:m.keySet()) {
			
			System.out.println(i+"              "+m.get(i));
		}
		
		
		//Entry methods
		//************
		System.out.println("=========================");
		for(Map.Entry entry:m.entrySet()) {
			
			System.out.println(entry.getKey()+"      "+entry.getValue());
			
		}
		//iterator
		
		
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		
//		while(itr.hasNext())
//		{
//			
//			Map.Entry entry =(Entry) itr.next();
//		}
//		
		
		
	}
 }


