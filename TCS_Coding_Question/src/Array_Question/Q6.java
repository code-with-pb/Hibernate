package Array_Question;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,9,6,3};
		int n = a.length;
		int k = 2;
		int j=1;
		
		for(int i=0;i<k;i++) {
			int t = a[i];
			a[i] = a[n-j];
			a[n-j] = t;
			j++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
