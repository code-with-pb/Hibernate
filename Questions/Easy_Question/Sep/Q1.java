package Sep;

import java.util.Arrays;

public class Q1 {
	public static void fn(int a[]) {
		
		// Soring Element in asc order
		Arrays.sort(a);
		
		int Arraysort [] = new int[a.length];
		int j=0;
		
		
		//Removing Duplicate Element in given array
		for(int i=0;i<a.length-1;i++) {
			if(a[i] != a[i+1]) {
				Arraysort[j++] = a[i];
			}
		}
		
		//printing Array with no duplicate element
		for(int i=0;i<j;i++) {
			System.out.print(Arraysort[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,4,1,2,3,3};
		
		//System.out.println(fn(a));
		
		fn(a);
		
		
	}

}
