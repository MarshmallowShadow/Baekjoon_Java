package agroup.bj0005107_secretsanta;

/* 5107��: ���϶�
	
	N���� ������� �ִ�. �̵��� ���� �ٸ� �� ���� �̸��� ���� ������ �޾Ƽ�, �� ������� ���� ������ ��Ǭ��.
	�̶� �ڱ� �ڽ��� �̸��� ���� ���� ������, ������ ���� ����� ���� �ڽ��� ����������� �� �� ����.

	�׷��� �̷� ���϶� Ȱ���� �ϴ� �� �� ���� �������� ���� �����̴� ���⼭ "���϶� ü��"�̶�� ������ �߰��ߴ�!
	�����̰� ���쿡�� ������ ��Ǯ��, ���찡 �����̿��� ������ ��Ǯ��, �����̰� ȣ���̿��� ������ ��Ǯ��...
	�̷��� �ϴ� ���� ������ �������� ó�� ������ ��Ǭ �����̿��� ������ ��Ǯ�� �Ǹ���� ���̴�.
	�̷��� ������ ��Ǫ�� ���� ���� �ݵ�� �����! �� ���� �׳� 2���� ���� �ְ�, �ƿ� N�� ��ΰ� ���Ե� ���� �ִ�.

	�츮�� �� ���� N���� ����� ���̿��� �̷��� ���� ���� �� ���� �߻��ϴ����� �˾Ƴ��� ���̴�. ������ ���� ���� �̷���� �ִ�.

	�Է�: �� �׽�Ʈ ���̽��� ù ��° �ٿ��� ����� ��� N�� �־�����(3 <= N <=20). ���� N = 0�̸� �Է��� ���� �ǹ��ϸ� �� �̻��� �Է��� ����.

		�� �׽�Ʈ ���̽��� �� ��° �ٺ��� N���� �ٿ� ���� �� ����� �̸��� �־�����. �� �ٿ� ���� �������� ������ ��Ǫ������ �־�����.
		ù ��° �̸��� �� ��° �̸��� ���� �ش� ���̽� ��ü�� ���� �ߺ����� ������, �� �ٿ� ���� �̸��� �� �� �������� �ʴ´�. �̸��� ���̴� 10�ڸ� ���� �ʴ´�.
	
	���: �� �׽�Ʈ ���̽�����, �� �ٿ� �ش� ���̽��� ��ȣ(1���� ����)�� ���� ���� ������ ������ �ΰ� ����Ѵ�.
	
*/

import java.util.*;


//HashMap
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		
		while(true) {
			int N = sc.nextInt();
			sc.nextLine();
			
			if(N == 0) {
				break;
			}
			
			HashMap<String, String> person = new HashMap<>();
			for(int i=0; i<N; i++) {
				person.put(sc.next(), sc.next());
			}
			
			int chainNum = 0;
			
			while(person.size() > 0) {
				chain(person, person.get(person.keySet().toArray()[0]));
				chainNum++;
			}
			
			System.out.println(t + " " + chainNum);
			
			t++;
		}
		
		sc.close();
	}
	
	public static void chain(HashMap<String, String> person, String cName) {
		if(!cName.equals(person.keySet().toArray()[0])) {
			chain(person, person.get(cName));
		}
		person.remove(cName);
	}
}



/*
//2���� �迭
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		
		while(true) {
			int N = sc.nextInt();
			sc.nextLine();
			
			if(N == 0) {
				break;
			}
			
			String[][] person = new String[N][2];
			int chainNum = 0;
			
			for(int i=0; i<N; i++) {
				person[i] = sc.nextLine().split(" ");
			}
			
			for(int i=0; i<N; i++) {
				if(!person[i][0].equals("")) {
					chain(person, person[i][0], person[i][1]);
					chainNum++;
				}
			}
			
			System.out.println(t + " " + chainNum);
			
			t++;
		}
		
		sc.close();
	}
	
	public static void chain(String[][] person, String sName, String cName) {
		for(int i=0; i<person.length; i++) {
			if(person[i][0].equals(cName)) {
				if(!person[i][1].equals(sName)) {
					chain(person, sName, person[i][1]);
				}
				person[i][0] = "";
				return;
			}
		}
	}
}
*/
