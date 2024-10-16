package Binary_Tree;

public class Q2 {
	static class Node{
		int d;
		Node l,r;
		
		Node(int n){
			d = n;
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
		System.err.print(root.d+" ");
		inorder(root.r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree b = new BinaryTree();
		Node root = b.Bt(a);
		
		inorder(root);
	}

}
