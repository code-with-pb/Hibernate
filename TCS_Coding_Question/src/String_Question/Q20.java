package String_Question;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2hhhted5hyj 85ht";
		String tempsum = "0";
		char[]a = s.toCharArray();
		int b = 0;
		for(int i=0;i<a.length;i++) {
			char p = s.charAt(i);
			if(Character.isDigit(a[i])) {
				tempsum += p;
			}
			else {
				b += Integer.parseInt(tempsum);
                tempsum = "0";
			}
		}
		System.out.println(b + Integer.parseInt(tempsum));
	}

}
