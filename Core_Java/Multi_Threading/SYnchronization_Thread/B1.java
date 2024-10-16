package SYnchronization_Thread;

public class B1 {
	public static synchronized void dis(String s[],String nm) {
		for(int i=0;i<s.length;i++) {
			System.out.println(nm + s[i]);
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
