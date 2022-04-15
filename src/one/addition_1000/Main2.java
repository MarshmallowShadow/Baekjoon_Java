package one.addition_1000;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A>0 && A<10 && B>0 && B<10) {
				System.out.println(A + B);
				break;
			}
		}
		 sc.close();
	}
}
