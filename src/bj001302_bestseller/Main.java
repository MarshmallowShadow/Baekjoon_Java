package bj001302_bestseller;

/* 1302��: ����Ʈ����

�������� ž������ �����̴�. �������� ���뿡�� ����� �ϴ� �����̴�. �������� �׳� �ٹ��� ���� �Ŀ�,
���� �Ǹ��� å�� ������ ���鼭 ���� ���� �ȸ� å�� ������ ĥ�ǿ� ����� �ϵ� ���� �ϰ� �ִ�.

���� �Ϸ� ���� �ȸ� å�� ������ �Է����� ������ ��, ���� ���� �ȸ� å�� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�: ù° �ٿ� ���� �Ϸ� ���� �ȸ� å�� ���� N�� �־�����. �� ���� 1,000���� �۰ų� ���� �ڿ����̴�.
	��°���� N���� �ٿ� å�� ������ �Է����� ���´�.
	å�� ������ ���̴� 50���� �۰ų� ����, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���: ù° �ٿ� ���� ���� �ȸ� å�� ������ ����Ѵ�. ���� ���� ���� �ȸ� å�� ���� ���� ��쿡�� ���� ������ ���� �ռ��� ������ ����Ѵ�.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> books = new TreeMap<>();
		
		int N = sc.nextInt();
		
		String best = "";
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			if(books.containsKey(s)) {
				books.put(s, books.get(s) + 1);
			} else {
				books.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> i: books.entrySet()) {
			if(!books.containsKey(best) || books.get(best) < books.get(i.getKey())) {
				best = i.getKey();
			}
		}
		
		System.out.println(best);
		
		sc.close();
	}
}
