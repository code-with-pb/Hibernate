package Sep;

import java.util.*;


public class Q3 {
	public static int findMinorMax(int a[]) {
		int mi = 100, mx = 0;
		for(int x : a) {
			mi = Math.min(mi, x);
			mx = Math.max(mi, x);
		}
		for(int x : a) {
			if(x != mi && x != mx) {
				return x;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,2,1,4};
		
		System.out.println(Q3.findMinorMax(a)+" ");
	}

}
