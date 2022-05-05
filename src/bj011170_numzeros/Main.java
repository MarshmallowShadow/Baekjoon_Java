package bj011170_numzeros;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int M;
		int count;
		
		for(int i=0; i<T; i++) {
			N = sc.nextInt();
			M = sc.nextInt();
			count = 0;
			int temp;
			
			for(int j=N; j<=M; j++) {
				temp = j;
				if(j == 0) {
					count++;
				}
				
				while(temp > 0) {
					if(temp%10 == 0) {
						count++;
					}
					temp /= 10;
				}
			}
			System.out.println(count);
		}
		
		sc.close();
	}
}
