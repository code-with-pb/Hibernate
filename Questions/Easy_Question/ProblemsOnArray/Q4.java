package ProblemsOnArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Q4 {
	public static void s(int a[]) {
		int n = a.length;
		
		int s[] = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			s[n-i-1] = a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	public static void p(int a[]) {
		int s = 0, e = a.length-1;
		
		while(s < e) {
			int t = a[e];
			a[e] = a[s];
			a[s] = t;
			s++;e--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void k(int a[]) {
		Collections.reverse(Arrays.asList(a));
		
		for(int i=0;i<a.length;i++) {

			System.out.print(a[i]+" ");
		}
	}
	public static void r(int a[],int s,int e) {
		
		if(s <= e) {
			int t = a[s];
			a[s] = a[e];
			a[e] = t;
			
			r(a,s+1,e-1);
		}
		//return e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,8,3,1,9,0};
		
		s(a);
		
		p(a);
		
		k(a);
		
		r(a,0,a.length-1);
	}

}
