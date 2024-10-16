package ProblemsOnArray;
import java.util.*;

public class Q7 {
	public static void fist(int a[],int val,int n) {

		for(int i=n-1;i>=0;i--) {
			a[i+1] = a[i];
		}
		a[0] = val;
	}
	public static void last(int a[],int val,int n) {
		a[n] = val;
	}
	public static void middle(int a[],int val,int p,int n) {
		for(int i=n;i>=p;i--) {
			a[i] = a[i-1];
		}
		a[p-1] = val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,7,6,1,4,9,0};
		
		//fist(a,3,7);
		//last(a,5,7);
		middle(a,20,5,7);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
