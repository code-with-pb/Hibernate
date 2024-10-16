package Bubble_Sort;

public class Q3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,9,6,1,4,3,2,10,7};
		
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
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
