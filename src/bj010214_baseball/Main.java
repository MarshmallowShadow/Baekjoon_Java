package bj010214_baseball;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y;
		int K;
		
		for(int i=0; i<N; i++) {
			Y = 0;
			K = 0;
			for(int j=0; j<9; j++) {
				Y += sc.nextInt();
				K += sc.nextInt();
			}
			if(Y > K) {
				System.out.println("Yonsei");
			} else if(K > Y) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
		}
		
		sc.close();
	}
}
