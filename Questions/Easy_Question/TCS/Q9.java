package TCS;
import java.util.*;
public class Q9 {
	public static void s(int a[]) {
		int n = a.length;
		Arrays.sort(a);
		
		if(n % 2 == 0) {
			int m1 = (n/2)-1;
			int m2 = (n/2);
			
			System.out.println((double)(a[m1] + a[m2])/2);
		}
		else {
			System.out.println(a[n/2]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,6,3,2,1,4,1};
		
		s(a);
	}

}
