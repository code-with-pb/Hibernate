package TCS;

import java.util.Arrays;
import java.util.Collection;

public class Q4 {
	static void re(int a[],int n) {
		int i = 0,j = n-1;
		while(i < j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			
			i++;j--;
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}
	static int rev(int a[],int i,int j) {
		i = 0;
		j = a.length-1;
		while(i < j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		return rev(a,i+1,j-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,9,7,4,5,6,3,2,1,55};
		
		//Collection.reverse(Arrays.asList(a));		
		System.out.println(rev(a,0,a.length-1));
		
		re(a,10);
		
		System.out.println();
		
		int s[] = new int[10];
		
		for(int i=a.length-1;i>=0;i--) {
			s[a.length-i-1] = a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
