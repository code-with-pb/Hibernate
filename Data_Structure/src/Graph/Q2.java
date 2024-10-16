package Graph;
import java.util.*;

import Graph.Q1.Edge;

public class Q2 {
	static class Edge{
		int d,s;
		
		Edge(int d,int s){
			this.d = s;
			this.s = d;
		}
	}
	public static void graph(ArrayList<Edge> a[]) {
		for(int i=0;i<a.length;i++) {
			a[i] = new ArrayList<>();
		}
		a[0].add(new Edge(0,1));
		a[0].add(new Edge(0,2));
		
		a[1].add(new Edge(1,0));
		a[1].add(new Edge(1,3));
		
		a[2].add(new Edge(2,0));
		a[2].add(new Edge(2,4));
		
		a[3].add(new Edge(3,1));
		a[3].add(new Edge(3,5));
		
		a[4].add(new Edge(4,2));
		a[4].add(new Edge(4,5));
		
		a[5].add(new Edge(5,3));
		a[5].add(new Edge(5,4));
		a[5].add(new Edge(5,6));
		
		a[6].add(new Edge(6,5));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 7;
		
		ArrayList<Edge> a[] = new ArrayList[v];
		
		graph(a);
		
		for(int i=0;i<a[5].size();i++) {
			Edge e = a[5].get(i);
			System.out.print(e.d+" ");
		}
	}

}
