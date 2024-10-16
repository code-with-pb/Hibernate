package Question1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		for(int i=100;i<=999;i++) {
			for(int j = i;j <=999;j++)
            {
                int s1 = i * j;
                StringBuilder sb1 = new StringBuilder(""+s1);
                String sb2 = ""+s1;
                sb1.reverse();
                if(sb2.equals(sb1.toString()) && s<s1) {
                    s = s1;

                }
            }
		}
		System.out.println(s);
	}

}
