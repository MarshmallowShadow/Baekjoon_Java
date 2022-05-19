package agroup.bj001834_quotientremainder;

/* 1834��: �������� ���� ���� ��

N���� �������� �� �������� ���� ���� ��� �ڿ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� N=3�� ��, �������� ���� ��� ���� �ڿ����� 4�� 8 �� ���� �����Ƿ�, �� ���� 12�̴�.

�Է�:ù° �ٿ� 2,000,000 ������ �ڿ��� N�� �־�����.
���: ù �ٿ� ���ϰ��� �ϴ� ���� ����Ѵ�.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long sum = 0;
		
		for(int i=1; i<n; i++) {
			sum += (n*i) + i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
