package Binary_Tree;

import java.util.*;

public class Q4 {
	static class Node{
		int d;
		Node l,r;
		
		Node(int d){
			this.d = d;
			l = null;
			r = null;
		}
	}
	static class BinaryTree{
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
			return ;
		}
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node cr = q.remove();
			if(cr == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(cr.d+" ");
				if(cr.l != null) {
					q.add(cr.l);
				}
				if(cr.r != null) {
					q.add(cr.r);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,2,1,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1};
		
		BinaryTree b = new BinaryTree();
		
		Node root = b.Bt(a);
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		levelorder(root);
	}

}
