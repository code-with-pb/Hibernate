package String_Question;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = "Heelo whats up".toCharArray();
		char n = 0;
		
		for(int i=0;i<s.length;i++) {
			if(s[i] != ' ') {
				s[n] = s[i];
				n++;
			}
		}
		System.out.println(String.valueOf(s).subSequence(0, n));
	}

}
