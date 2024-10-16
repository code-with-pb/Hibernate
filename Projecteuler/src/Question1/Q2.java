package Question1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1;
		
		int s = 0,t=0;
		
		System.out.print(i+" "+j);
		
		for(int k=0;k<11;k++) {
			
			//System.out.println(j);
			s = i+j;
			i = j;
			j = s;
			
			System.out.print(" "+s);
			
			if(s % 2 == 0) {
				t = t + s;
			}
		}
		System.out.println();
		System.out.println(t);
		
	}

}
