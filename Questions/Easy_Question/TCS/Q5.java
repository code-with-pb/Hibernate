package TCS;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,55,33,10,77,55,30,10,10,55};
		
		boolean s[] = new boolean[a.length];
		
		for(int i = 0;i<a.length;i++) {
			if(s[i] == true) {
				continue;
			}
			int c = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					s[j] = true;
					c++;
				}
			}
			System.out.println(a[i]+" "+c);
		}
	}

}
