package bj016926_arrayturning;

/* 16926번: 배열 돌리기 1

크기가 N×M인 배열이 있을 때, 배열을 돌려보려고 한다. 배열은 다음과 같이 반시계 방향으로 돌려야 한다.

A[1][1] ← A[1][2] ← A[1][3] ← A[1][4] ← A[1][5]
   ↓                                       ↑
A[2][1]   A[2][2] ← A[2][3] ← A[2][4]   A[2][5]
   ↓         ↓                   ↑         ↑
A[3][1]   A[3][2] → A[3][3] → A[3][4]   A[3][5]
   ↓                                       ↑
A[4][1] → A[4][2] → A[4][3] → A[4][4] → A[4][5]

예를 들어, 아래와 같은 배열을 2번 회전시키면 다음과 같이 변하게 된다.

1 2 3 4       2 3 4 8       3 4 8 6
5 6 7 8       1 7 7 6       2 7 8 2
9 8 7 6   →   5 6 8 2   →   1 7 6 3
5 4 3 2       9 5 4 3       5 9 5 4
 <시작>         <회전1>        <회전2>

배열과 정수 R이 주어졌을 때, 배열을 R번 회전시킨 결과를 구해보자.

입력: 첫째 줄에 배열의 크기 N, M과 수행해야 하는 회전의 수 R이 주어진다.
	둘째 줄부터 N개의 줄에 배열 A의 원소 Aij가 주어진다.

출력: 입력으로 주어진 배열을 R번 회전시킨 결과를 출력한다.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();

		Integer[][] A = new Integer[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		//Grouping Rotation Groups
		List<Deque<Integer>> rotGroup = new ArrayList<>();
		for (int i = 0, j = M - 1, k = 0, l = N - 1; i <= j && k <= l; i++, j--, k++, l--) {
			rotGroup.add(new LinkedList<>());
			//Top
			for (int m = j; m > i; m--) rotGroup.get(rotGroup.size() - 1).add(A[k][m]);
			//Left
			for (int m = k; m < l; m++) rotGroup.get(rotGroup.size() - 1).add(A[m][i]);
			//Bottom
			for (int m = i; m < j; m++) rotGroup.get(rotGroup.size() - 1).add(A[l][m]);
			//Right
			for (int m = l; m > k; m--) rotGroup.get(rotGroup.size() - 1).add(A[m][j]);
		}

		//For each iteration, add then pop stack
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < rotGroup.size(); j++) {
				rotGroup.get(j).addFirst(rotGroup.get(j).pollLast());
			}
		}

		//Reassign 2D array A for output
		for (int i = 0, j = M - 1, k = 0, l = N - 1, n = 0; n < rotGroup.size(); i++, j--, k++, l--, n++) {
			//Top
			for (int m = j; m > i; m--) A[k][m] = rotGroup.get(n).pop();
			//Left
			for (int m = k; m < l; m++) A[m][i] = rotGroup.get(n).pop();
			//Bottom
			for (int m = i; m < j; m++) A[l][m] = rotGroup.get(n).pop();
			//Right
			for (int m = l; m > k; m--) A[m][j] = rotGroup.get(n).pop();
		}

		//Print output
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(A[i][j]);
				if (j == M - 1) {
					System.out.println();
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
