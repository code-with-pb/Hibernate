package Pattern_Triangle;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int ct = 4;
		int r,c;
		
		for(int i = 1;i<=ct;i++) {
			for(r = 1;r<=row;r++) {
				for(c = 1;c<=row;c++) {
					if(r == c) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
				
			}
			for(r = 1;r<=row;r++) {
				for(c = 1;c<=row;c++) {
					if(c <= (row+1-r)) {
						if(c == (row+1-r)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						
					}
				}
				System.out.println("");
			}
			
		}
	}

}
