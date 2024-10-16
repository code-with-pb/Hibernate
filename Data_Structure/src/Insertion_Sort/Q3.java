package Insertion_Sort;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,6,3,9,2,8,1,7,4,0};
		
		for(int i=0;i<a.length;i++) {
			int k = a[i];
			int j = i-1;
			while(j>=0 && a[j] > k) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = k;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
