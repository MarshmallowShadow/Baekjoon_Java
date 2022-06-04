package agroup.bj014929_guichan;

/* 14929¹ø: ±ÍÂú¾Æ (SIBAL) (https://www.acmicpc.net/problem/14929)

±ÍÂú¾Æ ´ÔÀÌ »çÀÌÆ® µé¾î°¡¼­ È®ÀÎÇØ

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
