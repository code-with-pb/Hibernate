package String_Question;

public class Q4 {
	/* public static void RemoveVowels(String str) {
		    for (int i = 0; i < str.length(); i++) {
		      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
		        str = str.substring(0, i) + str.substring(i + 1);
		        i--;
		      }
		    }
		    System.out.println(str);
		  }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "take u forward";
		
		int n = s.length();
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i)== 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				s = s.substring(0, 1) + s.substring(i+1);
				i--;
			}
		}
		System.out.println(s);
		 /*String str = "take u forward";
		   //System.out.println("String after removing the vowels \n"+RemoveVowels(str));
		 RemoveVowels(str);*/
	}

}
