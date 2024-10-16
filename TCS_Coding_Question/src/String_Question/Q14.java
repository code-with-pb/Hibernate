package String_Question;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "takeuforward";
		
		char ans = 'a';
		int fre = 0, n = str.length();
		int count[] = new int[256];
		
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
			if(count[str.charAt(i)] > fre) {
				fre = count[str.charAt(i)];
				ans = str.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
