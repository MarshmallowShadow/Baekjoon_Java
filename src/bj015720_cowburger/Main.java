package bj015720_cowburger;

/*15720��: ī����� (https://www.acmicpc.net/problem/15720)

�����̴� �̹��� ī����� �˹ٻ����� ������ �Ǿ���. �׳�� ī����Ÿ� ��ҿ� �̿��ϸ鼭 ����� �ǹ��� �Ѱ����� �־���.

    "ī����ſ��� �� ��Ʈ �޴��� ���� ������ �������� �ʴ°�?"

���� �������� ���̵��� ī����ſ� ��Ʈ ������ �����ϰ��� �Ѵ�. ��Ʈ �޴��� ���� 1��, ���̵� �޴� 1��, ���� 1���� ���� �� ���
������ ��ǰ�� ���ؼ� 10%�� ��Ʈ ������ �����ϴ� ������� ����ȴ�.

������ ī����� ���ִ� POS���� ����Ʈ��� �����Ǿ� ��Ʈ ���ο� ���� ������ �߰��� ���� ������.
���� ����Ʈ�����кο� ���� ���� �����̴� ������ ��� ���� ���α׷��� �������� �Ѵ�.
�����̸� ���� POS�⿡ �� ��Ʈ ���ο� ���� ���α׷��� �ۼ��غ���.

�Է�: ù° �ٿ��� �ֹ��� ������ ���� B, ���̵� �޴��� ���� C, ������ ���� D�� ������ ���̿� �ΰ� ������� �־�����. (1 �� B, C, D �� 1,000)
	��° �ٿ��� �� ������ ������ ������ ���̿� �ΰ� �־�����.
	��° �ٿ��� �� ���̵� �޴��� ������ ������ ���̿� �ΰ� �־�����.
	��° �ٿ��� �� ������ ������ ������ ���̿� �ΰ� �־�����.
	�� �޴��� ������ 100�� ����̸�, 10000���� ���� �ʴ´�.

���: ù° �ٿ��� ��Ʈ ������ ����Ǳ� �� ������ ����Ѵ�.
	��° �ٿ��� ��Ʈ ������ ����� ���� �ּ� ������ ����Ѵ�.


*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> burger = new ArrayList<>();
		List<Integer> side = new ArrayList<>();
		List<Integer> drink = new ArrayList<>();
		
		int min = 1000;
		
		int[] n = new int[3];
		
		for(int i=0; i<3; i++) {
			n[i] = sc.nextInt();
			if(n[i] < min) {
				min = n[i];
			}
		}
		
		int sum = 0;
		
		for(int i=0; i<n[0]; i++) {
			burger.add(sc.nextInt());
			sum += burger.get(i);
		}
		Collections.sort(burger);
		for(int i=0; i<n[1]; i++) {
			side.add(sc.nextInt());
			sum += side.get(i);
		}
		Collections.sort(side);
		for(int i=0; i<n[2]; i++) {
			drink.add(sc.nextInt());
			sum += drink.get(i);
		}
		Collections.sort(drink);
		
		System.out.println(sum);
		sum = 0;
		
		for(int i=0; i<n[0]; i++) {
			if(i >= n[0] - min) {
				sum += (int)(burger.get(i) * 0.9);
			} else {
				sum += burger.get(i);
			}
			
		}
		for(int i=0; i<n[1]; i++) {
			if(i >= n[1] - min) {
				sum += (int)(side.get(i) * 0.9);
			} else {
				sum += side.get(i);
			}
		}
		for(int i=0; i<n[2]; i++) {
			if(i >= n[2] - min) {
				sum += (int)(drink.get(i) * 0.9);
			} else {
				sum += drink.get(i);
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
