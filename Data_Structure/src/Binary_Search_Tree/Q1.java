package Binary_Search_Tree;

public class Q1 {
	static class Node{
		int d;
		Node l,r;
		
		Node(int n){
			d= n;
			l =null;
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
	public static Node delete(Node root,int k) {
		if(root.d > k) {
			return delete(root.l,k);
		}
		else if(root.d < k) {
			return delete(root.r,k);
		}
		else {
			if(root.l == null && root.r == null) {
				return null;
			}
			else if(root.l == null) {
				return root.r;
			}
			else if(root.r == null){
				return root.l;
			}
			Node is = inorderSuccess(root.r);
			root.d = is.d;
			root.r = delete(root.r,is.d);
			return root;
		}
	}
	public static Node inorderSuccess(Node root) {
		while(root.l != null) {
			root = root.l;
		}
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,9,6,3,2,1,4,7,0};
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		inorder(root);
		System.out.println();
		if(search(root,9)) {
			System.out.println("FOund...");
		}
		inorder(root);
		delete(root,8);
		System.out.println();
		inorder(root);
		/*else {
			
		}*/
	}

}
