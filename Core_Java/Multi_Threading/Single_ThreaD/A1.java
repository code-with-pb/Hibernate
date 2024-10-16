package Single_ThreaD;

public class A1 {
	public static void main(String args[]) {
		Thread th = Thread.currentThread();
		for(int i=1;i<11;i++) {
			System.out.print(i+" ");
			try {
				th.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
