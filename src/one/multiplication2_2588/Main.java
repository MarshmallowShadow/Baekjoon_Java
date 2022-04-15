package one.multiplication2_2588;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer A = sc.nextInt();
		Integer B = sc.nextInt();
		
        String sB = B.toString();
        int digit;
        
        for(int i=(sB.length()-1); i>=0; i--) {
            digit = Character.getNumericValue(sB.charAt(i));
            System.out.println(A*digit);
        }
        System.out.println(A * B);
        
        sc.close();
	}
}
