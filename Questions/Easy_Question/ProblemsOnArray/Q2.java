package ProblemsOnArray;

import java.util.Arrays;

public class Q2 {
	public static int LargeElement(int a[]) {
		int m = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}
	public static void Ml(int[] a) {
		int n = a.length-1;
		Arrays.sort(a);
		System.out.println(a[n]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,10,5,7,9};
		System.out.println(LargeElement(a));
		
		Ml(a);
	}

}
