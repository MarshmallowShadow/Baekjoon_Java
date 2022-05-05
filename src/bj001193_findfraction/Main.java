package bj001193_findfraction;
import java.util.Scanner;

public class Main {
	static String fraction(long A, long B, long num) {
		long count = num - 1;
		while(count > 0) {
			if(A == 1 && count > 0) {
				B++;
				count--;
				if(count > 0 && count < B) {
					A += count;
					B -= count;
					break;
				} else if (count > 0 && count >= B) {
					A = B;
					count = count - B + 1;
					B = 1;
				}
			}
			if(B == 1 && count > 0) {
				A++;
				count--;
				if(count > 0 && count < A) {
					B += count;
					A -= count;
					break;
				} else if (count > 0 && count >= A) {
					B = A;
					count = count - A + 1;
					A = 1;
				}
			}
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
