package Quick_Sort;

public class Q1 {
	public static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	public static int partition(int a[],int l,int h) {
		int v = a[h];
		int i = (l-1);
		int j = l;
		
		while(j<h) {
			if(a[j] <= v) {
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			j++;
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i+1;
	}
	public static void show(int a[]) {
		pivot(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,2,0,3,1,6,5,4,7,8};
		
		show(a);
	}

}
