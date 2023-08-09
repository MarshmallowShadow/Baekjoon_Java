package bj0010986_factortotal;

/* 10986번: 나머지 합

수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.


입력: 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 10^6, 2 ≤ M ≤ 10^3)
	둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 10^9)

출력: 첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

*/

import java.util.*;
import java.io.*;

public class Nain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int M = Integer.parseInt(input1[1]);
		long[] num = new long[N];
		for(int i=0; i<N; i++) {
			num[i] = Long.parseLong(input2[i]);
		}
		
		long count = 0;
		List<long[]> group = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			long sum = 0;
			for(int j=i; j<N; j++) {
				sum += num[j];
				if(sum % M == 0) {
					boolean grouped = false;
					for(int k=0; k<group.size(); k++) {
						if(group.get(k)[1] == i-1) {
							grouped = true;
							group.get(k)[1] = j;
							group.get(k)[2]++;
							count += group.get(k)[2];
							break;
						}
					}
					if(!grouped) {
						group.add(new long[] {i, j, 1});
						count++;
					}
					break;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
