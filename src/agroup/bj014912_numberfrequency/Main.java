package agroup.bj014912_numberfrequency;

/*14912��: ���� �󵵼�

1���� n���� ���ʴ�� �� ������ �� Ư�� ����(digit)�� �󵵼��� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, n = 11 �̰� ���� 1�� �󵵼��� ���϶�� �ϸ�, 1 2 3 4 5 6 7 8 9 10 11 ���� ����
1�� 1���� �� ��, 10���� �� ��, 11���� �� �� ��Ÿ���Ƿ� 1�� �󵵼��� �� 4 �̴�.

�Է�: �ڿ��� n (1 �� n �� 100,000)�� �� �ڸ� ���� d(0~9)�� ù° �ٿ� �־�����.

���: ù° �ٿ� �󵵼��� ����Ѵ�.
*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			int temp = i;
			while(temp > 0) {
				if(temp % 10 == d) count++;
				temp /= 10;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
