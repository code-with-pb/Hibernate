package com.Loops;

public class Program2 {

	public static boolean IsPrime(int n) {
		// TODO Auto-generated method stub
		
		if(n == 1 || n == 0)return false;
		
		for(int i=2; i<n; i++) {
			if(n%i == 0) return false;
		}
		
		return true;
		
	}

	

}
