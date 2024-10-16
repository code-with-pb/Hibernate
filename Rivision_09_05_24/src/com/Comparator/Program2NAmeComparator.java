package com.Comparator;

import java.util.Comparator;

public class Program2NAmeComparator implements Comparator<Program2>{

	@Override
	public int compare(Program2 o1, Program2 o2) {
		// TODO Auto-generated method stub
		return (o1.name.compareTo(o2.name));
	}
	
}
