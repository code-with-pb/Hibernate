package Abstract_Class;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1(1,"Akash",98);
		b.id = 10;
		b.nm = "Akash";
		b.m = 98;
		
		b.setdata();
		System.out.println(b.show());
	}

}
