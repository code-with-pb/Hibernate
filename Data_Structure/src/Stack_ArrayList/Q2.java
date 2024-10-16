package Stack_ArrayList;
import java.util.*;

public class Q2 {
	static class stack{
		static ArrayList<Integer> ls = new ArrayList<>();
		public static boolean isEmpty() {
			return ls.size() == 0;
		}
		
		public static void add(int d) {
			ls.add(d);
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = ls.get(ls.size()-1);
			ls.remove(ls.size()-1);
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return ls.get(ls.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
		
		s.add(10);
		s.add(20);
		s.add(30);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.remove();
		}
	}

}
