package String_Question;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcadgahgdbs";
		
		int a[] = new int[26];
		for(int i=0;i<str.length();i++) {
			a[str.charAt(i)- 'a']++;
			//System.out.print(a+" ");
		}
		for(int i=0;i<26;i++) {
			if(a[i] != 0) {
				System.out.print((char) (i + 'a'));
				System.out.println(a[i]+" ");
			}
		}
	}

}
