package bj.soda_5032;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();
		
		int count = 0;
		
		while(e+f >= c) {
			e += f;
			f = 0;
			count += (e/c);
			f = e/c + e%c;
			e = 0;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
