package Array_Question;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,5,6,9,4,1,2};
		int s[] = new int[a.length];
		
		for(int i=a.length-1;i>=0;i--) {
			s[a.length-i-1] = a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
