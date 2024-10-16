package Binary_Search_Tree;

public class Q4 {
	static class Node{
		int d;
		Node l,r;
		
		Node(int d){
			this.d = d;
			l = null;
			r= null;
		}
	}
	public static Node insert(Node root,int k) {
		if(root == null) {
			root = new Node(k);
			return root;
		}
		if(root.d > k) {
			root.l = insert(root.l,k);
		}
		if(root.d < k) {
			root.r = insert(root.r,k);
		}
		return root;
	}
	public static boolean search(Node root,int k) {
		if(root == null) {
			return false;
		}
		if(root.d > k) {
			return search(root.l,k);
		}
		else if(root.d == k) {
			return true;
		}
		else {
			return search(root.r,k);
		}
	}
	public static Node inordersuccess(Node root) {
		if(root.l != null) {
			root = root.l;
		}
		return root;
	}
	public static Node delete(Node root,int k) {
		if(root.d > k) {
			root.l =  delete(root.l,k); 
		}
		else if(root.d < k) {
			root.r = delete(root.r,k);
		}
		else {
			if(root.l == null && root.r == null) {
				return null;
			}
			if(root.l == null) {
				return root.r;
			}
			else if(root.r == null) {
				return root.l;
			}
			Node is = inordersuccess(root.r);
			root.d = is.d;
			root.r = delete(root.r,is.d);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,7,9,8,6,3,2,4,1,0};
		
		Node root = null;
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		if(search(root,8)) {
			System.out.println("Found...");
		}
		inorder(root);
		System.out.println();
		delete(root,8);
		inorder(root);
	}

}
