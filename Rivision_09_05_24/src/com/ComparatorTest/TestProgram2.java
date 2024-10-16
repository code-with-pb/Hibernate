package com.ComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Comparator.Program2;
import com.Comparator.Program2NAmeComparator;

public class TestProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 p1 = new Program2(1,"Akash");
		Program2 p2 = new Program2(5,"Raju");
		Program2 p3 = new Program2(4,"Adi");
		Program2 p4 = new Program2(3,"Ask");
		Program2 p5 = new Program2(2,"Sak");
		
		List<Program2> ps = new ArrayList<>();
		
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		ps.add(p4);
		ps.add(p5);
		
		Collections.sort(ps,new Program2NAmeComparator());
		
		for(Program2 p : ps) {
			System.out.println(p);
		}
	}

}
