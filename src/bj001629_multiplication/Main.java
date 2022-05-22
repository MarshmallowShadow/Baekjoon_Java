package bj001629_multiplication;

/* 1629번: 곱셈

자연수 A를 B번 곱한 수를 알고 싶다. 단 구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지를 구하는 프로그램을 작성하시오.

입력: 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 모두 2,147,483,647 이하의 자연수이다.

출력: 첫째 줄에 A를 B번 곱한 수를 C로 나눈 나머지를 출력한다.

*/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		long A = Long.parseLong(s[0]);
		long B = Long.parseLong(s[1]);
		long C = Long.parseLong(s[2]);
		
		long mod = 1;
		
		A = A % C;
		
		if(A == 0) {
			mod = 0;
		} else {
			while(B > 0) {
				if(B%2 != 0) {
					mod = (mod * A) % C;
				}
				
				B /= 2;
				A = (A * A) % C;
			}
		}
		
		
		bw.write(Long.toString(mod));
		bw.flush();
	}
}