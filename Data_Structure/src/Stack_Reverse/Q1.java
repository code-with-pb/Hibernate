package Stack_Reverse;
import java.util.*;


public class Q1 {
	public static void pd(int d,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.add(d);
			return;
		}
		int t = s.pop();
		pd(d,s);
		s.push(t);
	}
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.pop();
		reverse(s);
		pd(t,s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		reverse(s);
		pd(60,s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
