package bj001629_multiplication;

/* 1629��: ����

�ڿ��� A�� B�� ���� ���� �˰� �ʹ�. �� ���Ϸ��� ���� �ſ� Ŀ�� �� �����Ƿ� �̸� C�� ���� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�: ù° �ٿ� A, B, C�� �� ĭ�� ���̿� �ΰ� ������� �־�����. A, B, C�� ��� 2,147,483,647 ������ �ڿ����̴�.

���: ù° �ٿ� A�� B�� ���� ���� C�� ���� �������� ����Ѵ�.

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