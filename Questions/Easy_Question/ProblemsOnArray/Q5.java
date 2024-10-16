package ProblemsOnArray;

public class Q5 {
	public static void Frequency(int a[],int n) {
		
		
		boolean b[] = new boolean[n];
		
		for(int i=0;i<n;i++) {
			 if(b[i] == true) {
				 continue;
			 }
			 int c = 1;
			 for(int j=i+1;j<n;j++) {
				 if(a[j] == a[i]) {
					 b[j] = true;
					 c++;
				 }
			 }
			 System.out.print(a[i]+" "+c);
			 System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,10,30,20,10,50,30,50,30,50};
		
		Frequency(a,11);
	}

}
