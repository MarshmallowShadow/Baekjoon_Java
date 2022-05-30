package agroup.bj016395_pascaltriangle;

/* 016395��: �Ľ�Į�� �ﰢ�� (https://www.acmicpc.net/problem/16395)

�Ľ�Į�� �ﰢ���� ���װ���� �ﰢ�� ���·� �迭�� ���ε�, ���� �Ľ�Į(1623-1662)�� ���� �̸� �ٿ�����.

�ܼ��� ���·�, �Ľ�Į�� �ﰢ���� ������ ���� ������� ���� �� �ִ�.

    N��° �࿡�� N���� ���� �ִ�.
    ù ��° ���� 1�̴�.
    �� ��° �����, �� ���� �� ���� ���� 1�̰�, ������ ���� ���� �ٷ� �� ���� ������ �� ���� ���̴�.

���� ���, n=3�̸� 3��° ���� 2��° ���� �� ���� ������ �� �� (1�� 1)�� ���ؼ� �����. 

n=6�� ��, �Ľ�Į �ﰢ���� 6��° ���� 10�� 5��° ���� ������ �� ��(4�� 6)�� ���ؼ� ���Ѵ�. 

���� n�� k�� �־����� �� �Ľ�Į�� �ﰢ���� �ִ� n��° �࿡�� k��° ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  �̶�, �� ���� ���װ�� C(n-1,k-1)�ӿ� �����Ͻÿ�.


�Է�: ù° �ٿ� ���� n�� k�� ��ĭ�� ���̿� �ΰ� ���ʷ� �־�����. �� ��, 1 �� k �� n �� 30�� �����Ѵ�.

���: ù° �ٿ� n��° �࿡ �ִ� k��° ���� ����Ѵ�.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()-1;
		int k = sc.nextInt()-1;
		
		int C = (int)(factorial(n) / (factorial(k) * factorial(n-k)));
		
		System.out.println(C);
		
		sc.close();
	}
	
	public static double factorial(int n) {
		if(n == 0) return 1;
		
		double f = n * factorial(n-1);
		return f;
	}
}
