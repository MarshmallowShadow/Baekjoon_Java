package bj014929_guichan;

/* 14929��: ������ (SIBAL) (https://www.acmicpc.net/problem/14929)

������ ���� ����Ʈ ���� Ȯ����

*/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		
		int[] x = new int[n];
		long sum = 0;
		long sigma = 0;
		
		for(int i=0; i<n; i++) {
			x[i] = Integer.parseInt(s[i]);
		}
		
		for(int i=0; i<n; i++) {
			sum += x[i];
		}
		
		for(int j=n-1; j>=0; j--) {
			sum -= x[j];
			sigma += x[j] * sum;
		}
		
		bw.write(Long.toString(sigma));
		bw.flush();
	}
}
