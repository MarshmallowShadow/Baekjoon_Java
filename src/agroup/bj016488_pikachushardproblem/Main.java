package agroup.bj016488_pikachushardproblem;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		double H = Math.pow(N, 2) - Math.pow(K*0.5, 2);
		
		double x = 0;
		
		for(double i=0; i<K; i++) {
			double C = Math.pow((K*0.5) - i, 2) + H;
			
			x += C + (i * (K - i));
		}
		
		System.out.println((long)x);
		
		sc.close();
	}
}
