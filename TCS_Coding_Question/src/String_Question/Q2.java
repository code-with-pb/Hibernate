package String_Question;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Take u forward is awesome";
		
		int i=0;
		int v=0,c=0,w=0;
		
		while(i<s.length()) {
			if(s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i)== 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				v++;
			}
			else if(s.charAt(i) == ' ') {
				w++;
			}
			else {
				c++;
			}
			i++;
		}
		System.out.println(v+" "+c+" "+w);
	}

}
