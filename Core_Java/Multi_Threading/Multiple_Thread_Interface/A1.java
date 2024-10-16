package Multiple_Thread_Interface;

public class A1 implements Runnable{
	Thread th;
	A1(){
		th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<21;i+=2) {
			System.out.print(i+" ");
			try {
				th.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
