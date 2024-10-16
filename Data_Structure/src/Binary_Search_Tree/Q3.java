package Binary_Search_Tree;

public class Q3 {
	static class Node{
		int d;
		Node l,r;
		
		Node (int n){
			d = n;
			l = null;
			r = null;
		}
	}
	public static Node insert(Node root,int val) {
		if(root == null){
			root = new Node(val);
			return root;
		}
		if(root.d > val) {
			root.l = insert(root.l,val);
		}
		else {
			root.r = insert(root.r,val);
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
	public static Node inorderSucess(Node root) {
		if(root.l != null) {
			root = root.l;
		}
		return root;
	}
	public static Node delete(Node root,int k) {
		if(root == null) {
			return null;
		}
		if(root.d > k) {
			root.l = delete(root.l,k);
		}
		else if(root.d < k) {
			root.r = delete(root.r,k);
		}
		else {
			if(root.l == null && root.r == null) {
				return null;
			}
			else if(root.l == null) {
				return root.r;
			}
			else if(root.r == null) {
				return root.l;
			}
			Node is = inorderSucess(root.r);
			root.d = is.d;
			root.r = delete(root.r,is.d);
			
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,3,6,1,2,4,9,0};
		
		Node root = null;
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		
		if(search(root,8)) {
			System.out.println("Found...");
		}
		System.out.println();
		inorder(root);
		System.out.println();
		delete(root,8);
		inorder(root);
	}

}
