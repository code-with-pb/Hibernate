package ProblemsOnArray;

import java.util.Arrays;

public class Q1 {
	public static int SmallesElementAp1(int a[]) {
		int m = a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i] < m) {
				m = a[i];
			}
		}
		return m;
	}
	public static void SmElAp2(int a[]) {
		Arrays.sort(a);
		System.out.println(a[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,1,3,0};
		
		System.out.println(SmallesElementAp1(a));
		SmElAp2(a);
	}

}
