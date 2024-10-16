package Single_Inheritance_Thread;

public class A1 extends Thread{
	A1(){
		this.start();
	}
	public void run() {
		for(int i=0;i<11;i+=2) {
			System.out.print(i+" ");
			try {
				this.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
