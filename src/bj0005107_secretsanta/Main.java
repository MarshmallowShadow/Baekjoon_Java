package bj0005107_secretsanta;

/* 5107번: 마니또 (https://www.acmicpc.net/problem/5107)
	
	N명의 사람들이 있다. 이들은 각자 다른 한 명의 이름이 적힌 쪽지를 받아서, 그 사람에게 몰래 선행을 베푼다.
	이때 자기 자신의 이름을 받을 수는 없으며, 선행을 받은 사람은 누가 자신을 도와줬는지도 알 수 없다.

	그런데 이런 마니또 활동을 하던 중 할 짓이 지지리도 없던 세종이는 여기서 "마니또 체인"이라는 개념을 발견했다!
	세종이가 동우에게 선행을 베풀고, 동우가 재혁이에게 선행을 베풀고, 재혁이가 호용이에게 선행을 베풀고...
	이렇게 하다 보면 언젠가 누군가는 처음 선행을 베푼 세종이에게 선행을 베풀게 되리라는 것이다.
	이렇게 선행을 베푸는 연결 고리가 반드시 생긴다! 이 고리는 그냥 2명일 수도 있고, 아예 N명 모두가 포함될 수도 있다.

	우리가 할 일은 N명의 사람들 사이에서 이러한 연결 고리가 몇 개나 발생하는지를 알아내는 것이다. 문제는 여러 개로 이루어져 있다.

	입력: 각 테스트 케이스의 첫 번째 줄에는 사람의 명수 N이 주어진다(3 <= N <=20). 만약 N = 0이면 입력의 끝을 의미하며 더 이상의 입력은 없다.

		각 테스트 케이스의 두 번째 줄부터 N개의 줄에 거쳐 두 사람의 이름이 주어진다. 각 줄에 누가 누구에게 선행을 베푸는지가 주어진다.
		첫 번째 이름과 두 번째 이름은 각각 해당 케이스 전체에 걸쳐 중복되지 않으며, 한 줄에 같은 이름이 두 번 등장하지 않는다. 이름의 길이는 10자를 넘지 않는다.
	
	출력: 각 테스트 케이스마다, 한 줄에 해당 케이스의 번호(1부터 시작)와 연결 고리의 개수를 공백을 두고 출력한다.
	
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
//2차원 배열
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
