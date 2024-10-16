package Binary_Search;

public class Q3 {
	public static int s(int n[],int k) {
		for(int i=0;i<n.length;i++) {
			int s = 0,e = n.length-1;
			while(s<=e) {
				int m = (s+e)/2;
				if(n[m] == k) {
					return m;
				}
				else if(n[m] < k){
					s = m+1;
				}
				else {
					e = m-1;
				}
				
			}
			s++;
		//System.out.print(-1);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n [] = {1,2,3,4,5,6,7,8,9,10};
		int k = 7;		
			
		int m = s(n,k);
		if(m == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("Found at index.."+m);
		}
	}

}
