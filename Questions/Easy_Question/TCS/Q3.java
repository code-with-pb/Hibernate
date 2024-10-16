package TCS;

public class Q3 {
	static int Sm(int a[],int n) {
		if(n<2) {
			return -1;
		}
		int sm = Integer.MAX_VALUE;
		int sm_2 = Integer.MAX_VALUE;
		int i;
		for(i=0;i<n;i++) {
			if(a[i] < sm) {
				sm_2 = sm;
				sm = a[i];
			}
			else if(a[i] < sm_2) {
				sm_2 = a[i];
			}
		}
		return sm_2;
	}
	static int Sl(int a[],int n) {
		if(n<2) {
			return -1;
		}
		int sl = Integer.MIN_VALUE;
		int sl2 = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] > sl) {
				sl2 = sl;
				sl = a[i];
			}
			else if(a[i] > sl2) {
				sl2 = a[i];
			}
		}
		return sl2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,9,7,5,6,4,1,2,3,0};
		
		System.out.println(Sm(a,10));
		
		System.out.println(Sl(a,10));
	}

}
