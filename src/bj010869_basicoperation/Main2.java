package bj010869_basicoperation;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
        double C;
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A>=1 && A<=10000 && B>=1 && B<=10000) {
				System.out.println(A + B);
				System.out.println(A - B);
				System.out.println(A * B);
                System.out.println(A / B);
                System.out.println(A % B);
				break;
			}
		}
		 sc.close();
	}
}
