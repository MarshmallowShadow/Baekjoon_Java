package twelve.combination_11050;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long K = sc.nextInt();
		
		long C = factorial(N) / (factorial(K) * factorial(N - K));
		
		System.out.println(C);
		
		sc.close();
	}
	
	public static long factorial(long num) {
		if(num == 0) {
			return 1;
		}
		long recurse = factorial(num-1);
		long f = num * recurse;
		
		return f;
	}
}
