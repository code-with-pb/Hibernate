package MULTITHREADING_PRIORITY;

public class A1 implements Runnable{
	Thread th;
	long c=1;
	A1(int p){
		th = new Thread(this);
		th.setPriority(p);
		th.start();
	}
	public void run() {
		while(true) {
			c++;
		}
	}
}
