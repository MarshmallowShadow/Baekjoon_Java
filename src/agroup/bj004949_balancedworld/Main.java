package agroup.bj004949_balancedworld;

/* 4949��: �������� ����
����� ������ �� �����־�� �Ѵ�. ��� ��, ���� ��� �׸��� ���� ��ȣ�� ������ ��ȣó�� ���̴�.

�������� �ӹ��� � ���ڿ��� �־����� ��, ��ȣ���� ������ �� ������ �ִ��� �Ǵ��ϴ� ���α׷��� ¥�� ���̴�.

���ڿ��� ���ԵǴ� ��ȣ�� �Ұ�ȣ("()") �� ���ȣ("[]")�� 2�����̰�, ���ڿ��� ������ �̷�� ������ �Ʒ��� ����.

    ��� ���� �Ұ�ȣ("(")�� ������ �Ұ�ȣ(")")�͸� ¦�� �̷�� �Ѵ�.
    ��� ���� ���ȣ("[")�� ������ ���ȣ("]")�͸� ¦�� �̷�� �Ѵ�.
    ��� ������ ��ȣ���� �ڽŰ� ¦�� �̷� �� �ִ� ���� ��ȣ�� �����Ѵ�.
    ��� ��ȣ���� ¦�� 1:1 ��Ī�� �����ϴ�. ��, ��ȣ �ϳ��� �� �̻��� ��ȣ�� ¦�������� �ʴ´�.
    ¦�� �̷�� �� ��ȣ�� ���� ��, �� ���̿� �ִ� ���ڿ��� ������ ������ �Ѵ�.

�����̸� ���� ���ڿ��� �־����� �� �������� ���ڿ����� �ƴ����� �Ǵ��غ���.


�Է�: �ϳ� �Ǵ� �����ٿ� ���ļ� ���ڿ��� �־�����. �� ���ڿ��� ���� ���ĺ�, ����, �Ұ�ȣ("( )"),
	���ȣ("[ ]")������ �̷���� ������, ���̴� 100���ں��� �۰ų� ����. �� ���� ��ħǥ(".")�� ������.
	�Է��� ������������ �� �������� �� �ϳ�(".")�� ���´�.

���: �� �ٸ��� �ش� ���ڿ��� ������ �̷�� ������ "yes"��, �ƴϸ� "no"�� ����Ѵ�.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = sc.nextLine();
			
			if(line.equals(".")) {
				break;
			}
			
			List<Character> br = new ArrayList<>();
			
			for(int i=0; i<line.length(); i++) {
				if(line.charAt(i) == '(' || line.charAt(i) == '[' || line.charAt(i) == ']' || line.charAt(i) == ')') {
					br.add(line.charAt(i));
				}
			}
			
			int i = 0;
			
			if(br.size() % 2 == 0) {
				while(i<br.size()) {
					if(br.get(i) == '(') {
						i++;
						if(i >= br.size()) {
							break;
						}
						
						if(br.get(i) == ')') {
							i--;
							br.remove(i);
							br.remove(i);
							if(i>0) i--;
						} else if(br.get(i) == ']') {
							break;
						}
					} else if(br.get(i) == '[') {
						i++;
						if(i >= br.size()) {
							break;
						}
						
						if(br.get(i) == ']') {
							i--;
							br.remove(i);
							br.remove(i);
							if(i>0) i--;
						} else if(br.get(i) == ')') {
							break;
						}
					} else {
						break;
					}
				}
			}
			
			if(br.size() == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		sc.close();
	}
}
