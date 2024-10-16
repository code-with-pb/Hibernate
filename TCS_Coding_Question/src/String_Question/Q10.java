package String_Question;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "take u forward is awesome";
		StringBuffer s = new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			if(i == 0 || i == str.length()-1) {
				s.setCharAt(i, Character.toUpperCase((char)(int)str.charAt(i)));
			}
			else if(str.charAt(i) == ' '){
				s.setCharAt(i-1, Character.toUpperCase((char)(int)str.charAt(i-1)));
				s.setCharAt(i+1, Character.toUpperCase((char)(int)str.charAt(i+1)));
			}
		}
		System.out.println(s);
	}

}
