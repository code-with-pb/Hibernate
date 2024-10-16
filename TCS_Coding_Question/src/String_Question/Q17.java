package String_Question;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		String str = "Helelo $#@Mamun bh9ai";
		StringBuffer b = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			int ascii = (int)str.charAt(i);
			if(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
				b.append(str.charAt(i));
			}
		}
		System.out.println(b.toString());
	}

}
