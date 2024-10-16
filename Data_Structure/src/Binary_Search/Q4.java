package Binary_Search;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,9,6,3,2,1,24,0,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
