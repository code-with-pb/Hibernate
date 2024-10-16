package com.Test;

public class Test_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//com.Loops.Program1.PrintserialNum();
		
		int  n = 100;
		for(int i = 1; i <= n; i++) {
			if(com.Loops.Program2.IsPrime(i)) {
				System.out.println(i);
			}
		}
		
		com.Loops.Program1.EvenOddNum();
		
	}

}
