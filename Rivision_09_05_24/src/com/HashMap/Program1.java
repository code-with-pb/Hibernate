package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program1 {
	
	public static void HashMap1() {
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("CSK", "Dhoni");
		hm.put("MI","Rohit");
		hm.put("RCB", "Virat");
		hm.put("DC", "Pant");
		hm.put("LSG", "Rahul");
		
		System.out.println("******Iterate by KeySet******");
		
		for(String k : hm.keySet()) {
			String v = hm.get(k);
			
			System.out.println("Key: "+k+" values: "+v);
		}
		
		System.out.println("******Iterate by EntrySet******");
		
		for(Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		
		System.out.println("******Iterate by forEach******");
		
		hm.forEach((k,v) -> System.out.println("Key: "+k+ " value: "+v));
	}
}
