package Binary_Tree_Queustion;

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
	public static int CN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = CN(root.l);
		int rn = CN(root.r);
		
		return ln + rn + 1;
	}
	public static int SN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = SN(root.l);
		int rn = SN(root.r);
		
		return ln + rn + root.d;
	}
	public static int HT(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = HT(root.l);
		int rn = HT(root.r);
		
		return Math.max(ln, rn) + 1;
	}
	public static int D(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = D(root.l);
		int rn = D(root.r);
		
		int ht = HT(root.l) + HT(root.r) + 1;
		
		return Math.max(ln, Math.max(rn, ht));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,8,9,6,3,2,0,1,4,20};
		
		Node root = null;
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		inorder(root);
		System.out.println();
		System.out.println(CN(root));
		System.out.println(SN(root));
		System.out.println(HT(root));
		System.out.println(D(root));
		
	}

}
