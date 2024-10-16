package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Program2 {

	public static void HashMap1() {
		// TODO Auto-generated method stub
		ArrayList<String> p = new ArrayList<>();
		
		p.add("Rahul");
		p.add("Sachin");
		p.add("Sevag");
		p.add("Yuvraj");
		p.add("Gambhir");
		p.add("Yadav");
		
		HashMap<String , ArrayList<String>> t = new HashMap<>();
		
		t.put("India", p);
		
		/*for(String s : t.keySet()) {
			
			System.out.println("Team: "+t);
		}*/
		
		for(Entry<String, ArrayList<String>> mp : t.entrySet()) {
			
			System.out.println("Team: "+mp.getKey()+" Player's: "+mp.getValue());
		}
	}

}
