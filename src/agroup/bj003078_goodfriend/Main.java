package agroup.bj003078_goodfriend;

/* 좋은 친구 (https://www.acmicpc.net/problem/3078)

상근이는 환갑을 바라보던 나이에 수능 시험을 다시보고 교대에 입학했고, 초등학교 선생님으로 취직했다.

    상근: 요즘 애들은 친구를 사귀지 않나봐. 내가 앞에서 보고 있으면, 친구가 있는 학생이 별로 없는 것 같아.
    ??: 오빠! 오빠는 말콤의 친구와 성적이라는 책 안 읽어 봤어? 이 책에는 성적과 친구가 무슨 관계가 있는지 나와.
    	요즘 애들은 친구를 사귀기 전에 먼저 그 친구의 반 등수를 살펴봐. 말콤은 이 연구를 하기 위해서 6년동안 초등학교에서 선생님으로 위장 했었지.
		하지만, 6년이라는 시간을 초등학교에서 보냈지만, 그 사람은 결국 결론을 얻지 못했어.
    상근: 근데?
    ??: 말콤이 어느 날 자신이 초등학생이 되어 학교를 활보하는 꿈을 꾸었어. 근데 잠을 깨고 나니 내가 꿈을 꾸고 초등학생이 된건지,
    	아니면 초등학생이 꿈을 꾸고 지금의 내가 되어있는지를 모르겠는거야. 그래서 말콤은 상식적인 사고 방식에 큰 의문을 가졌지.
    	그 때 말콤은 깨달았던거야. 초등학교 친구는 부질없구나. 그제서야 알게된거야. 모든 학생은 자신과 반 등수의 차이가 K를 넘으면 친구가 아니라는거.
    상근: 아? 근데 K는 어떻게 구해?
    ??: K는 문제에서 주어지지. 근데, 더 중요한 사실이 있어. 친구와 좋은 친구의 차이야. 말콤이 친구와 성적을 쓰고
    	2년 뒤에 낸 책인 좋은 친구라는 책에는 좋은 친구는 이름의 길이가 같아야 된다는 말이 나와.
    상근: 아! 그럼 난 오늘 집에 가서 우리 반에 좋은 친구가 몇 쌍이나 있는지 구해봐야 겠어!

상근이네 반의 N명 학생들의 이름이 성적순으로 주어졌을 때, 좋은 친구가 몇 쌍이나 있는지 구하는 프로그램을 작성하시오. 좋은 친구는 등수의 차이가 K보다 작거나 같으면서 이름의 길이가 같은 친구이다.


입력: 첫째 줄에 N과 K가 주어진다. (3 ≤ N ≤ 300,000, 1 ≤ K ≤ N) 다음 N개 줄에는 상근이네 반 학생의 이름이 성적순으로 주어진다.
	이름은 알파벳 대문자로 이루어져 있고, 2글자 ~ 20글자이다.

출력: 첫째 줄에 좋은 친구가 몇 쌍이 있는지 출력한다.

*/

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		Queue<Integer>[] students = new Queue[21];
		long friends = 0;
		
		for(int i=0; i<21; i++) {
			students[i] = new LinkedList<>();
		}
		
		for(int i=0; i<N; i++) {
			int len = br.readLine().length();
			if(students[len].isEmpty()) {
				students[len].offer(i);
			} else {
				while(students[len].peek() < i-K) {
					students[len].poll();
					if(students[len].isEmpty()) {
						break;
					}
				}
				friends += students[len].size();
				students[len].offer(i);
			}
		}
		
		bw.write(Long.toString(friends));
		bw.flush();
	}
}
