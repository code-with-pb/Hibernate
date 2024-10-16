package com.HashMap;

import java.util.*;
import java.util.Map.Entry;


public class Program3 {

	public static void HashMap1() {
		// TODO Auto-generated method stub
		
		ArrayList<String> p1 = new ArrayList<>();
		
		p1.add("Virat");
		p1.add("Dinesh");
		p1.add("Faf");
		p1.add("Siraj");
		p1.add("Patidar");
		
		HashMap<String,ArrayList<String>> a = new HashMap<>();
		
		a.put("RCB", p1);
		
		ArrayList<String> p2 = new ArrayList<>();
		
		p2.add("Dhoni");
		p2.add("Ruturaj");
		p2.add("Jadeja");
		p2.add("Suresh");
		p2.add("Dipak");
		
		HashMap<String,ArrayList<String>> b = new HashMap<>();
		
		b.put("CSK", p2);
		
		ArrayList<String> p3 = new ArrayList<>();
		
		p3.add("Rohit");
		p3.add("Ishan");
		p3.add("Hardik");
		p3.add("Sachin");
		p3.add("Karan");
		
		HashMap<String,ArrayList<String>> c = new HashMap<>();
		
		c.put("MI", p3);
		
		ArrayList<String> p4 = new ArrayList<>();
		
		p4.add("Akash");
		p4.add("Raj");
		p4.add("Sukshan");
		p4.add("Adi");
		p4.add("Rakesh");
		
		HashMap<String,ArrayList<String>> d = new HashMap<>();
		
		d.put("DC", p4);
		
		ArrayList<String> p5 = new ArrayList<>();
		
		p5.add("Pravin");
		p5.add("Hrishikesh");
		p5.add("Mangesh");
		p5.add("Shubham");
		p5.add("Vikas");
		
		HashMap<String,ArrayList<String>> e = new HashMap<>();
		
		e.put("LSG", p5);
		
		for(Entry<String , ArrayList<String>> f: a.entrySet()) {
			System.out.println("Team: "+f.getKey()+" Player's: "+f.getValue());
		}
		
		for(Entry<String , ArrayList<String>> g : b.entrySet()) {
			System.out.println("Team: "+g.getKey()+" Player's: "+g.getValue());
		}
		
		for(Entry<String , ArrayList<String>> h : c.entrySet()) {
			System.out.println("Team: "+h.getKey()+" Player's: "+h.getValue());
		}
		
		for(Entry<String , ArrayList<String>> i : d.entrySet()) {
			System.out.println("Team: "+i.getKey()+" Player's: "+i.getValue());
		}
		
		for(Entry<String , ArrayList<String>> j : e.entrySet()) {
			System.out.println("Team: "+j.getKey()+" Player's: "+j.getValue());
		}
	}

}
