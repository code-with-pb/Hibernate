package Queue_LinkedList;

public class Q2 {
	static class Node{
		int d;
		Node next;
		
		Node(int n){
			this.d = n;
			next = null;
		}
	}
	static class Queue{
		public static Node f;
		public static Node r;
		
		public static boolean isEmpty() {
			return f == null && r == null;
		}
		public static void add(int d) {
			Node nd = new Node(d);
			if(isEmpty()) {
				r = f = nd;
				return;
			}
			r.next = nd;
			r = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = f.d;
			f = f.next;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return f.d;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		q.add(10);
		q.add(20);
		q.add(40);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
