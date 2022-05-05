package bj001037_factor;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int factor[] = new int[N];
		int smallF = 0;
		int bigF = 0;
		int num;
		
		for(int i=0; i<N; i++) {
			factor[i] = sc.nextInt();
			if(i == 0) {
				smallF = factor[i];
				bigF = factor[i];
			} else if(factor[i] < smallF) {
				smallF = factor[i];
			} else if(factor[i] > bigF) {
				bigF = factor[i];
			}
		}
		
		num = smallF * bigF;
		
		System.out.println(num);
		
		sc.close();
		
	}
}
