package Multiple_Inheritance;

public class B1 implements A1,C1 {
	float d;
	public double rupees(float d) {
		return d * 83;
	}
	
	@Override
	public float rupees() {
		// TODO Auto-generated method stub
		return d * 60.5f;
	}
	public void show() {
		System.out.println(rupees(1)+" "+doller);
		System.out.println(rupees()+" "+yo);
	}
	
}
