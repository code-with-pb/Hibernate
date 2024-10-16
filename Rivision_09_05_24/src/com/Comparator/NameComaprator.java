package com.Comparator;

import java.util.Comparator;

public class NameComaprator implements Comparator<Program1>{


	@Override
	public int compare(Program1 o1, Program1 o2) {
		// TODO Auto-generated method stub
		return (o1.nm.compareTo(o2.nm));
	}
}
