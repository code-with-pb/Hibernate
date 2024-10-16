package String_Question;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a+((b-c)+d)";
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) != '(' && a.charAt(i) != ')') {
				sb.append(a.charAt(i));
			}
		}
		System.out.print(sb.toString()+" ");
	}

}
