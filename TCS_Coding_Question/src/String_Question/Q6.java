package String_Question;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		
		String a = "hello mamun bhai";
		
		for(int i = 0;i<a.length();i++) {
			int ascii = (int )a.charAt(i);
			if(i>=65 && i <= 90 || i>=97 && i<=120) {
				s.append(a.charAt(i));
			}
		}
		System.out.println(s.toString());
	}

}
