package Binary_Tree;
import java.util.*;

public class Q1 {
	static class Node{
		int d;
		Node l,r;
		
		Node(int n){
			d = n;
			l = null;
			r = null;
		}
	}
	/*static class BinaryTree{
		public static int i = -1;
		public static Node Bt(int a[]) {
			i++;
			
			if(a[i] == -1) {
				return null;
			}
			Node nd = new Node(a[i]);
			nd.l = Bt(a);
			nd.r = Bt(a);
			
			return nd;
		}
	}*/
	public static Node insert(Node root,int k) {
		if(root == null) {
			root = new Node(k);
			return root;
		}
		if(root.d > k) {
			root.l = insert(root.l,k);
		}
		else {
			root.r = insert(root.r,k);
		}
		return root;
	}
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.d+" ");
		preorder(root.l);
		preorder(root.r);
	}
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.l);
		postorder(root.r);
		System.out.print(root.d+" ");
	}
	public static void levelorder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(curr.d+" ");
				if(curr.l != null) {
					q.add(curr.l);
				}
				if(curr.r != null) {
					q.add(curr.r);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,9,8,7,1,0,3,2,4,6};
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		levelorder(root);
	}

}
