package Single_Inheritance_Thread;

public class B1 extends Thread{
	B1(){
		this.start();
	}
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i % 2 != 0) {
				System.out.print(i+" ");
			}
			try {
				this.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
