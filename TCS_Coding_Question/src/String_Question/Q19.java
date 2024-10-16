package String_Question;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(((a-b))+c)";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != '(' && s.charAt(i) != ')') {
				sb.append(s.charAt(i));
			}
		}
		s = sb.toString();
		
		System.out.println(s);
		
	}

}
