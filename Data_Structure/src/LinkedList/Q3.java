package LinkedList;

public class Q3 {
	public static Node h;
	
	private static int s = 0;
	static class Node{
		int d;
		Node next;
		
		Node(int d){
			this.d = d;
			next = null;
			s++;
		}
	}
	public static void add(int d) {
		Node nd = new Node(d);
		if(h == null) {
			h = nd;
			return;
		}
		nd.next = h;
		h = nd;
	}
	public static void addl(int d) {
		Node nd = new Node(d);
		if(h == null) {
			h = nd;
			return;
		}
		Node curr = h;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = nd;
	}
	public static void show() {
		if(h == null) {
			return;
		}
		Node curr = h;
		while(curr.next != null) {
			System.out.print(curr.d+" -> ");
			curr = curr.next;
		}
		System.out.print("null ");
	}
	public static void delf() {
		if(h == null) {
			return;
		}
		s--;
		h = h.next;
	}
	public static void  dellas() {
		if(h == null) {
			return;
		}
		s--;
		if(h.next == null) {
			h = null;
		}
		Node l = h.next;
		Node l2 = h;
		
		while(l.next != null) {
			l = l.next;
			l2 = l2.next;
		}
		l2.next = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3 q = new Q3();
		
		q.add(1);
		q.add(10);
		q.add(20);
		q.show();
		
		System.out.println();
		
		q.addl(0);
		q.addl(200);
		q.addl(10);
		q.show();
		
		System.out.println();
		
		q.delf();
		q.dellas();
		q.show();
	}

}
