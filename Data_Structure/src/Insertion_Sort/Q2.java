package Insertion_Sort;

public class Q2 {
	public static void Is(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int t = a[i];
			int j = i-1;
			for(j = i-1;j>=0;j--) {
				if(a[j] > t) {
					a[j+1] = a[j];
				}
			}
			a[j+1] = t;
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,9,6,4,2,3,1,0,7};
		
		Is(a);
	}

}
