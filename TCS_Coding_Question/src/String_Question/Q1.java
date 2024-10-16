package String_Question;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aka";
		
		int l =0;
		int r = s.length()-1;
		while(l<r) {
			char lf = s.charAt(l),rf = s.charAt(r);
			if(!Character.isLetterOrDigit(lf)) {
				
				l++;
			}
			else if(!Character.isLetterOrDigit(rf)) {
				r--;
			}
			else if(Character.toLowerCase(lf) != Character.toLowerCase(rf)) {
				System.out.println("No");
			}
			else {
				
				l++;
				r--;
			}
			//System.out.println("YanES");
		}
		System.out.println("Yes");
	}

}
