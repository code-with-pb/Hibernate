package Binary_Search_Tree_Question;

import java.util.ArrayList;

public class Q1 {
	static class Node{
		int d;
		Node l,r;
		
		Node(int m){
			d = m;
			l= null;
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
		int a[] = {5,8,6,9,7,4,1,23,10,11,2,16,22,33,55,88,61};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		PrintInRange(root,7,61);
		System.out.println();
		
		PrintRoot2Leaf(root,new ArrayList<>());
		
	}

}
