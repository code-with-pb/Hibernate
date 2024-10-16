package SYnchronization_Thread;

public class A1 extends Thread{
	String s[] = {"I","Love","Java"};
	A1(String nm){
		super(nm);
		this.start();
	}
	public void run() {
		B1.dis(s,getName());
	}
}
