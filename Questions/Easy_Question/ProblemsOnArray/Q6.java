package ProblemsOnArray;

import java.util.Arrays;

public class Q6 {
	public static void m(int a[],int n) {
		Arrays.sort(a);
		
		if(n % 2 == 0) {
			int m1 = (n/2)-1;
			int m2 = (n/2);
			
			System.out.println((double)(a[m1] + a[m2]) / 2);
		}
		else {
			System.out.println(a[(n/2)]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,4, 7, 1, 2, 5, 6,7,8,9};
		
		m(a,10);
	}

}
