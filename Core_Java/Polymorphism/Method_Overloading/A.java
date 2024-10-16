package Method_Overloading;

public class A {
	public void A1() {
		System.out.println("Class A1");
	}
	public void A1(int i) {
		System.out.println(i+" ");
	}
	public  void A1(int i,int j) {
		System.out.println(i+" "+j);
	}
	public void A1(String nm) {
		System.out.println(nm+" ");
	}
}
