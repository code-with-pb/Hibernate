package TCS;

import java.util.Arrays;

public class Q2 {
	static int sl(int a[]) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,9,6,3,2,1,4,7,5,0};
		
		System.out.println(sl(a));
		
		Arrays.sort(a);
		
		System.out.println(a[1]);
		System.out.println(a[a.length-2]);
	}

}
