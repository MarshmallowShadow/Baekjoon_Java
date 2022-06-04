package agroup.bj001977_perfectsquare;

/* 1977��: ���������� (https://www.acmicpc.net/problem/1977)

M�� N�� �־��� �� M�̻� N������ �ڿ��� �� ������������ ���� ��� ��� �� ���� ���ϰ� �� �� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� ������������ 64, 81, 100 �̷��� �� 3���� �����Ƿ�
�� ���� 245�� �ǰ� �� �� �ּڰ��� 64�� �ȴ�.

�Է�: ù° �ٿ� M��, ��° �ٿ� N�� �־�����. M�� N�� 10000������ �ڿ����̸� M�� N���� ���ų� �۴�.

���: M�̻� N������ �ڿ��� �� ������������ ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�.
	��, M�̻� N������ �ڿ��� �� ������������ ���� ���� ù° �ٿ� -1�� ����Ѵ�.


*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int min = -1;
		
		for(int i=1; i<=100; i++) {
			int sq = (int)Math.pow(i, 2);
			
			if(sq >= M && sq <=N) {
				sum += sq;
				if(min == -1) {
					min = sq;
				}
			}
			
			if(sq>=N) {
				break;
			}
		}
		
		if(min != -1) {
			System.out.println(sum);
		}
		System.out.println(min);
	}
}
