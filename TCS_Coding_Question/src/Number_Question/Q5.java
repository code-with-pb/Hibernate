package Number_Question;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		
		int t = n;
		int p = 0;
		int k = String.valueOf(n).length();
		
		while(t>0) {
			int d = t % 10;
			//System.out.println(d);
			t = t/10;
			int i=0;
			int s = 1;
			while(i != k) {
				s = s * d;
				//System.out.println(s);
				i++;
			}
			p =p + s;
			//System.out.println(p);
		}
		if(n == p) {
			System.out.println("Yes");
		}
	}

}
