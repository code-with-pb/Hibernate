package Learning_Search;

public class Q2 {
	public static int Ls(int a[],int k) {
		int i = 0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,9,7,4,6,3,2,1,0};
		
		int i = Ls(a,3);
		
		if(i != -1) {
			System.out.println("Found "+i);
		}
	}

}
