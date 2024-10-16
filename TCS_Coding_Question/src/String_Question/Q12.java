package String_Question;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "goolge";
		
		int a[] = new int[200];
		char s[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			else {
				a[(int)str.charAt(i)]++;
			}
		}
		for(int i=0;i<str.length();i++) {
			if(a[(int)str.charAt(i)] == 1 && a[i] != ' ') {
				System.out.print(s[i]+" ");
			}
		}
	}

}
