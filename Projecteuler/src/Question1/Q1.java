package Question1;

public class Q1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		
		for(int i=1;i<1000;i++) {
			/*if(i == 3 || i == 5) {
				s += i;
			}*/
			if(i % 3 == 0 || i % 5 == 0) {
				s = s + i;
				//System.out.println(i);
			}
		}
		System.out.println(s);
	}

}
