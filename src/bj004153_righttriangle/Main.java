package bj004153_righttriangle;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			else if(a > b && a > c) {
				if(Math.pow(a,2) == Math.pow(b, 2) + Math.pow(c, 2))
					System.out.println("right");
				else System.out.println("wrong");
			} else if(b > a && b > c) {
				if(Math.pow(b,2) == Math.pow(a, 2) + Math.pow(c, 2))
					System.out.println("right");
				else System.out.println("wrong");
			} else if(c > b && c > a) {
				if(Math.pow(c,2) == Math.pow(b, 2) + Math.pow(a, 2))
					System.out.println("right");
				else System.out.println("wrong");
			} else System.out.println("wrong");
		}
		
		sc.close();
	}
}
