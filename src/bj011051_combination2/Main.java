package bj011051_combination2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int[] N1 = new int[N-K];
		int i;
		
		for(i=0; i<N1.length; i++) {
			N1[i] = K + i + 1;
		}
		
		cDivide(N1, N-K);
		
		double C = 1;
		for(i=0; i<N1.length; i++) {
			C *= N1[i];
			C %= 10007;
		}
		
		System.out.println((int)C);
	}
	
	public static void cDivide(int[] N1, int range) {
		int temp;
		for(int j=2; j<=range; j++) {
			temp = j;
			for(int k=2; k<=j; k++) {
				while(temp%k == 0) {
					divide(N1, k);
					temp /= k;
				}
			}
		}
	}
	
	public static void divide(int[] N1, int j) {
		for(int i=0; i<N1.length; i++) {
			if(N1[i]%j == 0) {
				N1[i] /= j;
				break;
			}
		}
	}
}
