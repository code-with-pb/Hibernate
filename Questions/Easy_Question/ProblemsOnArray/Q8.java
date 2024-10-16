package ProblemsOnArray;

import java.util.Arrays;

public class Q8 {
	public static void s(int a[]) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				System.out.println(a[i]+" ")
;			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1,2,3,4,5,6,1,2,3,7,5,9};
s(a);
	}

}
