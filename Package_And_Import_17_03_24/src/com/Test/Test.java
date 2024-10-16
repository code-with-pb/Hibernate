package com.Test;

import com.abc.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.add();
		
		com.xyz.A o = new com.xyz.A(); // when you have same method in diff packages then you have to call 
									   //by package name if you ara calling both package method at same class
		
		o.add();
	}

}
