package Binary_Search;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,5,6,9,3,2,1,0,55};
		int k = 3;
		int i=0;
		
		while(i<a.length) {
			if(a[i] == k) {
				System.out.println(i);
			}
			i++;
		}
		//System.out.println(i);
	}

}
