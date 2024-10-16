package Single_Inheritance_Thread;

public class C1 extends Thread{
	C1(){
		this.start();
	}
	public void run() {
		for(int i=0;i<101;i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
			if(i % 2 != 0) {
				System.out.print(i+" ");
			}
			try {
				this.sleep(100);
			}
			catch(Exception e) {
				System.out.println();
			}
		}
	}
}
