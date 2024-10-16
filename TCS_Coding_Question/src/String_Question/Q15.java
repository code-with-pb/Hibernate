package String_Question;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbacdcbc";
		boolean a[] = new boolean[26];
		
		 String ans = "";
		 
		 for(int i=0;i<str.length();i++) {
			 if(a[str.charAt(i)- 'a'] == false) {
				 ans += str.charAt(i);
				 a[str.charAt(i) - 'a'] = true;
			 }
		 }
		 System.out.println(ans);
	}

}
