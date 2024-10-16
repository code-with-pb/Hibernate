package String_Question;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "take u forward";
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				str = str.substring(0, 1) + str.substring(i+1);
				i--;
 			}
		}
		System.out.println(str);
	}

}
