package agroup.bj014494_whatisdynamic;

/* 14494번: 다이나믹이 뭐에요?

안녕하세요~ 저는 오늘 다이나믹 프로그래밍(동적 계획법)을 설명하기 위해 등장한 욱제예요! 다이나믹은 이름이 엄청 거창하지만 사실 이름에 비해 개념은 간단하답니다.
다이나믹의 기본 아이디어는 바로 이전에 계산한 값을 사용해서 (= 이미 계산된 값을 사용해서, 어려운 말로 메모이제이션 한다고 해요) 반복되는 똑같은 연산 횟수를 줄이는 거예요.

물론 다차원 배열로도 가능해요! 오른쪽, 아래쪽으로만 움직일 수 있을 때, D[1][1]에서 D[x][y]까지 도달하는 경우의 수를 구하는 문제는 일일히 모든 경우를 다 계산할 필요 없이,
D[i][j] = (i, j)에 도달하는 누적 경우의 수 = D[i-1][j] + D[i][j-1]를 세워서 해결할 수도 있죠.

어때요? 다이나믹 어렵지 않죠? 이제 문제를 풀어볼게요!

“→, ↓, ↘의 세 방향만 사용해서 한 번에 한 칸씩 이동할 때, 왼쪽 위 (1, 1)에서 출발하여 오른쪽 아래 (n, m)에 도착하는 경우의 수를 구하여라.”

시작!

입력: n과 m이 주어진다. (1 ≤ n, m ≤ 1,000)

출력: (1, 1)에서 (n, m)에 도달하는 경우의 수를 구하여라. 단, 경우의 수가 엄청 커질 수 있으므로 경우의 수를 1,000,000,007(=10^9+7)로 나눈 나머지를 출력한다.


*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max;
		int min;
		
		if(m>n) {
			max = m;
			min = n;
		} else {
			max = n;
			min = m;
		}
		
		long[][] map = new long[min][max];
		map[0][0] = 1;
		
		final int divide = 1000000007;
		
		for(int i=0; i<max; i++) {
			map[0][i] = 1;
		}
		for(int i=0; i<min; i++) {
			map[i][0] = 1;
		}
		
		for(int i=1; i<min; i++) {
			for(int j=i; j<max; j++) {
				map[i][j] = (map[i-1][j-1] + map[i-1][j] + map[i][j-1]) % divide;
				if(j < min) {
					map[j][i] = map[i][j];
				}
			}
		}
		
		System.out.println(map[min-1][max-1]);
		
		sc.close();
	}
}
