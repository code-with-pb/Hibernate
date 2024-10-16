package String_Question;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "Hello";
		
		StringBuilder sb = new StringBuilder(str);
			
			sb.reverse();
			
			str = sb.toString();
			
			System.out.println(str);
	}

}
