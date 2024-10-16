package Method_Overriding;

public class B1 extends A1{
	public void A1() {
		super.A1();
		System.out.println("Class B1's Method A");
	}
	public void A1(int i) {
		
		System.out.println("Class B1's Method A1's Value: "+i);
		super.A1(i);
	}
}
