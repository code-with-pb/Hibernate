package Stack_LinkedList;

public class Q1 {
	static class Node{
		int d;
		Node next;
		
		Node(int n){
			d = n;
			next = null;
		}
	}
	static class Stack{
		public static Node h;
		
		public static boolean isEmpty() {
			return h == null;
		}
		
		public static void push(int d) {
			Node nd = new Node(d);
			if(isEmpty()) {
				h = nd;
				return;
			}
			nd.next = h;
			h = nd;
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int t = h.d;
			h = h.next;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return h.d;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
