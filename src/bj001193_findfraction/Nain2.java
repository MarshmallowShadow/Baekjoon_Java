package bj001193_findfraction;
import java.util.Scanner;

public class Nain2 {
	static String fraction(long A, long B, long num) {
		long count = num;
		while(count > 1) {
			if(A == 1) {
				B++;
				count --;
				while(B > 1 && count > 1) {
					B--;
					A++;
					count--;
				}
			}
			if(B == 1) {
				A++;
				count --;
				while(A > 1 && count > 1) {
					A--;
					B++;
					count--;
				}
			}
			fraction(A, B, count);
		}
		
		return A + "/" + B;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = 1;
		long B = 1;
		long num = sc.nextLong();
		
		System.out.println(fraction(A, B, num));
		
		sc.close();
	}
}