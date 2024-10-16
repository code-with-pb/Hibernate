package Learning_Search;

public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int k = 8;
		
		int i = 0;
		while(i<a.length) {
			if(a[i] == k) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
