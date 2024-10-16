package Multiple_Thread_Interface;

public class B1 implements Runnable{
	Thread th;
	B1(){
		th = new Thread(this);
		th.start();
	}
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
			try {
				th.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
