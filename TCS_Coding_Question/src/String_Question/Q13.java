package String_Question;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "CAT";
		String str2 = "ATC";
		
		if(str1.length() != str2.length()) {
			System.out.println(0);
		}
		int a[] = new int[26];
		for(int i=0;i<str1.length();i++) {
			a[str1.charAt(i)- 'A']++;
		}
		for(int i=0;i<str2.length();i++) {
			a[str2.charAt(i) - 'A']--;
		}
		for(int i=0;i<26;i++) {
			if(a[i] != 0) {
				System.out.println(0);
			}
			System.out.println(1);
		}
	}

}
