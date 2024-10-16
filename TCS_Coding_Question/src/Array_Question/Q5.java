package Array_Question;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,5,5,8,9,6,9,8,6,3,3,2,1,2,4,7,};
		
		boolean vis[] = new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(vis[i] == true) {
				continue;
			}
			int k = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					vis[j] = true;
					k++;
				}
			}
			System.out.println(a[i]+" "+k);
		}
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" "+k);
		}*/
	}

}
