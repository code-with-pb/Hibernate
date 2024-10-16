package TCS;
import java.util.*;

public class Q10 {
	public static void freq(int a[],int n) {
		boolean b[] = new boolean[n];
		for(int i=0;i<n;i++) {
			if(b[i] == true) {
				continue;
			}
			int c = 1;
			for(int j=i+1;j<n;j++) {
				if(a[i] == a[j]) {
					b[j] = true;
					c++;
				}
			}
			System.out.println(a[i]+" "+c);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,5,1,1,2,5,8,6,8,2,3,4,3,9,7,7,7};
		
		freq(a,17);
	}

}
