package TCS;

public class Q8 {
	public static void k(int a[],int n) {
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
		int a[] = {10,20,10,30,40,50,30,40,40};
		
		k(a,9);
	}

}
