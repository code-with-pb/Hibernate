package LinkedList;

public class Q2 {
	public static Node h;
	
	private static int s;
	
	Q2(){
		s = 0;
	}
	static class Node{
		int d;
		Node next;
		
		Node(int n){
			d = n;
			next = null;
			s++;
		}
	}
	public static void addf(int d) {
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
		System.out.println("null");
	}
	public static void deletef() {
		if(h == null) {
			return;
		}
		s--;
		h = h.next;
	}
	public static void deletel() {
		if(h == null) {
			return;
		}
		s--;
		if(h.next == null) {
			h = null;
			return;
		}
		Node ls1 = h.next;
		Node ls2 = h;
		while(ls1.next != null) {
			ls1 = ls1.next;
			ls2 = ls2.next;
		}
		ls2.next = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 q = new Q2();
		
		q.addf(10);
		q.addf(20);
		q.addf(30);
		q.show();
		
		System.out.println();
		
		q.addl(5);
		q.addl(9);
		q.show();
		
		System.out.println();
		
		q.deletef();
		q.deletel();
		q.show();
		
	}

}
