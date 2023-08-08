package bj0010986_factortotal;

/* 10986번: 나머지 합

수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.


입력: 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 10^6, 2 ≤ M ≤ 10^3)
	둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 10^9)

출력: 첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] prefSum = new int[N];
		int[] remainder = new int[M];
		long count = 0;
		for(int i=0; i<N; i++) {
			prefSum[i] = sc.nextInt();
			if(i!=0) {
				prefSum[i] += prefSum[i-1];
			}
			
			prefSum[i] %= M;
			
			if(prefSum[i] == 0) {
				count++;
			}
			
			remainder[prefSum[i]]++;
			count += (remainder[prefSum[i]]-1);
		}
		
		System.out.println(count);
		sc.close();
	}
}
