package Learning_Search;

public class Q1 {
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
	public static void show(int a[],int k) {
		int i = Ls(a,k);
		
		if(i == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found: "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,8,5,2,1,4,6,30,7};
		
		show(a,30);
	}

}
