package thirteen.bridge_1010;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A;
		int B;
		double C = 1;
		
		for(int i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A >= B) {
				C = combination(A, B);
			} else {
				C = combination(B, A);
			}
			
			System.out.println((int)(Math.round(C)));
		}
		
		sc.close();
	}
	
	public static double combination(double N, double K) {
		double C;
		C = factorial(N) / (factorial(K) * factorial(N-K));
		return C;
	}
	
	public static double factorial(double num) {
		if(num == 0) {
			return 1;
		}
		double recurse = factorial(num-1);
		double f = num * recurse;
		
		return f;
	}
}
