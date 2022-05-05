package bj002588_multiplication2;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer A;
		Integer B;
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A>99 && A<1000 && B>99 && B<1000) {
				String sB = B.toString();
				int digit;
				
				for(int i=(sB.length()-1); i>=0; i--) {
					digit = Character.getNumericValue(sB.charAt(i));
					System.out.println(A*digit);
				}
                System.out.println(A * B);
				break;
			}
		}
		 sc.close();
	}
}
