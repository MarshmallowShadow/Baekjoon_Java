package agroup.bj001292_easyproblem;

/* 1292�� ���� Ǫ�� ����

��ȣ�� ���⿡ �ʵ��б��� �����Ѵ�. �׷��� ��ȣ ��Ӵϴ� ���� ���� �н��� ���� ���� Ǫ�� ������ ��ȣ���� �־���.
�� ������ ������ ����. 1�� �� ��, 2�� �� ��, 3�� �� ��, �̷� ������ 1 2 2 3 3 3 4 4 4 4 5 ..
�̷��� ������ ����� ��� ������ ������ �ָ� �� ������ ���� ���ϴ� ���̴�.
������ ��ȣ�� ���� �� ����� ������ Ǫ���� �ٻڱ⿡ �츮�� ��ȣ�� ��������.

�Է�: ù° �ٿ� ������ ���۰� ���� ��Ÿ���� ���� A, B(1 �� A �� B �� 1,000)�� �־�����.
	 ��, �������� A��° ���ں��� B��° ���ڱ��� ���� ���ϸ� �ȴ�.
���: ù �ٿ� ������ ���ϴ� ������ ���� ����Ѵ�.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] nums = new int[1000];
		
		int num = 1;
		int count = 0;
		
		for(int i=0; i<1000; i++) {
			nums[i] = num;
			count++;
			
			if(count == num) {
				count = 0;
				num++;
			}
		}
		
		int sum = 0;
		
		for(int i=a-1; i<b; i++) {
			sum += nums[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
