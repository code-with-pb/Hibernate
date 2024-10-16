package String_Question;
import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		
		int n = s.length();
		char a[] = new char[n];
		
		Stack<Character> ch = new Stack<>();
		
		for(int i=0;i<n;i++) {
			ch.push(s.charAt(i));
		}
		int i=0;
		while(!ch.isEmpty()) {
			a[i++] = ch.pop();
		}
		s = new String(a);
		System.out.println(s);
	}

}
