package Binary_Tree_Queustion;
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
		static int i = -1;
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
	public static int HN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = HN(root.l);
		int rn = HN(root.r);
		
		return Math.max(ln, rn) + 1;
	}
	public static int DN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = DN(root.l);
		int rn = DN(root.r);
		
		int hn = HN(root.l) + HN(root.r) + 1;
		
		return Math.max(ln, Math.max(rn, hn));
	}
	public static void PrintInRange(Node root,int x,int y) {
		if(root == null) {
			return;
		}
		if(root.d >= x && root.d <= y) {
			PrintInRange(root.l,x,y);
			System.out.print(root.d+" ");
			PrintInRange(root.r,x,y);
		}
		else if(root.d >= y) {
			PrintInRange(root.l,x,y);
		}
		else {
			PrintInRange(root.r,x,y);
		}
	}
	public static void PrintPath(ArrayList<Integer> p) {
		for(int i=0;i<p.size();i++) {
			System.out.print(p.get(i)+" ");
		}
		System.out.println();
	}
	public static void PrintRoot2Leaf(Node root,ArrayList<Integer> p) {
		if(root == null) {
			return;
		}
		p.add(root.d);
		
		if(root.l == null && root.r == null) {
			PrintPath(p);
		}
		else {
			PrintRoot2Leaf(root.l,p);
			PrintRoot2Leaf(root.r,p);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,2,3,1,6,7,9,4,0};
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		//inorder(root);
		System.out.println();
		System.out.println(CN(root));
		System.out.println(SN(root));
		System.out.println(HN(root));
		System.out.println(DN(root));
		System.out.println();
		PrintInRange(root,4,8);
		System.out.println();
		PrintRoot2Leaf(root,new ArrayList<>());
	}

}
