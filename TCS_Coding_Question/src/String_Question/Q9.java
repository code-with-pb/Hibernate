package String_Question;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "1hjf89";
		String num = "0";
		int sum = 0;
		
		for(int i=0;i<n.length();i++) {
			char s = n.charAt(i);
			if(Character.isDigit(s)) {
				num += s;
			}
			else {
				sum = Integer.parseInt(num);
				num = "0";
			}
		}
		System.out.print(sum + Integer.parseInt(num));
	}

}
