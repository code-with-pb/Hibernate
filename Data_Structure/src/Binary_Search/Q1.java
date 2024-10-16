package Binary_Search;

public class Q1 {
	public static int Bs(int a[],int k) {
		int i = 0, j = a.length-1;
		while(i<=j) {
			int m = (i+j)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] < k) {
				i = m+1;
			}
			else {
				j = m-1;
			}
		}
		return -1;
	}
	public static void show(int a[],int k) {
		int i = Bs(a,k);
		
		if(i == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found: "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6,7,8,9,10};
		
		show(a,8);
	}

}
