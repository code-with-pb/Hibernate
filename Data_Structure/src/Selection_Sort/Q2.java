package Selection_Sort;

public class Q2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,7,9,6,3,1,2,4,0};
		
		for(int i=0;i<a.length-1;i++) {
			int t = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
