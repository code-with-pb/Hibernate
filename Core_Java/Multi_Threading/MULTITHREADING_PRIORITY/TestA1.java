package MULTITHREADING_PRIORITY;

public class TestA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = Thread.currentThread();
		th1.setPriority(Thread.MAX_PRIORITY);
		A1 a = new A1(Thread.MAX_PRIORITY);
		A1 a1 = new A1(Thread.MIN_PRIORITY);
		A1 a2 = new A1(Thread.NORM_PRIORITY);
		A1 a3 = new A1(Thread.NORM_PRIORITY-2);
		A1 a4 = new A1(Thread.NORM_PRIORITY+2);
		
		try {
			th1.sleep(100);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//th1.stop();
		a.th.stop();
		a1.th.stop();
		a2.th.stop();
		a3.th.stop();
		a4.th.stop();
		
		System.out.println("Th1 = "+a.c+" "+a1.c+" "+a2.c+" "+a3.c+" "+a4.c);
		
		
	}

}
