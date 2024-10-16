package Queue_Circular;
import java.util.*;

public class Q1 {
	static class Queue{
		static int a[];
		static int s ,r=-1,f=-1;
		
		Queue(int n){
			a = new int[n];
			s = n;
		}
		public static boolean isEmpty() {
			return r == -1 && f == -1;
		}
		public static boolean IsFull() {
			return (r+1)%s == f;
		}
		public static void add(int d) {
			if(IsFull()) {
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] = d;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = a[f];
			if(f == r) {
				f = r= -1;
			}
			else {
				f = (f+1)%s;
			}
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[f];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(50);
		q.add(60);
		q.add(10);
		
		q.remove();
		
		q.add(50);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
