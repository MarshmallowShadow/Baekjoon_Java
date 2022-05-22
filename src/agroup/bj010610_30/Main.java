package agroup.bj010610_30;

/* 10610��: 30
��� ��, �̸��ڴ� �쿬�� ��Ÿ����� ��� N�� ���Ҵ�. �̸��ڴ� 30�̶� ���� �����ϱ� ������,
�״� ��Ÿ����� ã�� ���� ���Ե� ���ڵ��� ���� 30�� ����� �Ǵ� ���� ū ���� ����� �;��Ѵ�.

�̸��ڸ� ���� �װ� ����� �;��ϴ� ���� ����ϴ� ���α׷��� �ۼ��϶�.

�з�: N�� �Է¹޴´�. N�� �ִ� 10^5���� ���ڷ� �����Ǿ� ������, 0���� �������� �ʴ´�.
���: �̸��ڰ� ����� �;��ϴ� ���� �����Ѵٸ� �� ���� ����϶�. �� ���� �������� �ʴ´ٸ�, -1�� ����϶�.
*/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		
		int sum = 0;
		
		int[] digits = new int[10];
		
		for(int i=0; i<num.length(); i++) {
			int d = num.charAt(i) - 48;
			
			sum += d;
			
			digits[d]++;
		}
		
		if(digits[0] <= 0 || sum % 3 != 0) {
			bw.write(Integer.toString(-1));
		} else {
			for(int i=9; i>=0; i--) {
				for(int j=0; j<digits[i]; j++) {
					bw.write(Integer.toString(i));
				}
			}
		}
		
		bw.flush();
	}
}
