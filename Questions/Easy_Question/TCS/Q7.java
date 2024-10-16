package TCS;
import java.util.*;

public class Q7 {
	public static void p(int a[]) {
		int s = 0,e = a.length-1;
		
		while(s<=e) {
			int t = a[s];
			a[s] = a[e];
			a[e] = t;
			s++;e--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void k(int a[],int s,int e) {
		if(s<=e) {
			int t = a[s];
			a[s] = a[e];
			a[e] = t;
			
			k(a,s+1,e-1);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {9,8,7,2,5,4,1,0,3};
		
		//p(a);
		
		k(a,0,a.length-1);
	}
}
