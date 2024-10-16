package ProblemsOnArray;

public class Q3 {
	public static int SecondLargElAP1(int a[]) {
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] < min) {
				min2 = min;
				min = a[i];	
			}
			else if(a[i] < min2 && a[i] != min) {
				min2 = a[i];
			}
		}
		return min2;
	}
	public static int SecondSmallElAp1(int a[]) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i ] > max) {
				max2 = max;
				max = a[i];
			}
			else if(a[i] > max2 && a[i] != max) {
				max2 = a[i];
			}
		}
		return max2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,9,6,4,2};
		
		System.out.println(SecondLargElAP1(a));
		
		System.out.println(SecondSmallElAp1(a));
	}

}
