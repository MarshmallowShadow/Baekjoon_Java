package bj001014_nocheatingsmall;

/*

최백준은 서강대학교에서 “컨닝의 기술”이라는 과목을 가르치고 있다. 이 과목은 상당히 까다롭기로 정평이 나있기 때문에, 몇몇 학생들은 시험을 보는 도중에 다른 사람의 답지를 베끼려 한다.
시험은 N행, M열 크기의 직사각형 교실에서 이루어진다. 교실은 1×1 크기의 단위 정사각형으로 이루어져 있는데, 각 단위 정사각형은 자리 하나를 의미한다.
최백준은 컨닝을 방지하기 위해서 다음과 같은 전략을 세웠다. 모든 학생은 자신의 왼쪽, 오른쪽, 왼쪽 대각선 위, 오른쪽 대각선 위, 이렇게 총 네 자리에 앉아있는 친구의 답지를 항상 베낀다고 가정한다.
따라서, 자리 배치는 모든 학생이 컨닝을 할 수 없도록 배치되어야 한다.

위와 같이 컨닝이 불가능하도록 자리를 배치 하려는 최백준의 행동에 분노한 일부 학생들이 교실의 책상을 부숴버렸기 때문에, 일부 자리에는 학생이 앉을 수 없다.

최백준은 교실의 모양이 주어졌을 때, 이 곳에서 아무도 컨닝을 할 수 없도록 학생을 배치하였을 경우에 교실에 배치할 수 있는 최대 학생 수가 몇 명인지 궁금해졌다.
최백준을 위해 이를 구하는 프로그램을 작성하라.

입력: 입력의 첫 줄에는 테스트케이스의 개수 C가 주어진다. 각각의 테스트 케이스는 아래와 같이 두 부분으로 이루어진다.
	첫 번째 부분에서는 교실의 세로길이 N과 가로길이 M이 한 줄에 주어진다. (1 ≤ M ≤ 10, 1 ≤ N ≤ 10)
	두 번째 부분에서는 정확하게 N줄이 주어진다. 그리고 각 줄은 M개의 문자로 이루어져있다. 모든 문자는 ‘.’(앉을 수 있는 자리) 또는 ‘x’(앉을 수 없는 자리, 소문자)로 구성된다.

출력: 각각의 테스트 케이스에 대해 그 교실에서 시험을 볼 수 있는 최대 학생의 수를 출력한다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(input.nextToken());
			int M = Integer.parseInt(input.nextToken());
			int[][] seats = new int[N][M];
			for(int j=0; j<N; j++) {
				String row = br.readLine();
				for(int k=0; k<M; k++) {
					if(row.charAt(k) == '.') {
						seats[j][k] = 1;
					}
				}
			}
			
			//BFS
			int maxCount = 0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(seats[j][k] > 0) {
						List<List<String>> count = new ArrayList<>();
						count.add(new ArrayList<>());
						
						count.get(0).add(j + "," + k);
						seats[j][k] = 0;
						
						match(j, k, 0, seats, count);
						
						int[] dp = new int[count.size()];
						int dpCount = 0;
						
						for(int l=0; l<dp.length; l++) {
							//TEST ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE ERASE 
							//System.out.println(count.get(l));
							
							dp[l] = count.get(l).size();
							
							if (l==2) {
								dp[l] += dp[l-2];
							} else if(l > 2) {
								dp[l] += (dp[l-3] > dp[l-2]) ? dp[l-3] : dp[l-2];
							}
							
							if(dpCount < dp[l]) dpCount = dp[l];
						}
						
						maxCount += dpCount;
					}
				}
			}
			
			
			System.out.println(maxCount);
		}
		
		br.close();
	}
	
	//Find All Matching Pairs
	static void match( int posY, int posX, int group, int[][] seats, List<List<String>> count) {
		if(posX < 0 || posY < 0 || posX >= seats[0].length || posY >= seats.length) return;
		
		List<List<Integer>> posList = new ArrayList<>();
		
		for(int i=-1; i<=1; i++) {
			if(posX + 1 < seats[0].length && posY + i >= 0 && posY + i < seats.length) {
				if(seats[posY+i][posX+1] != 0) {
					posList.add(new ArrayList<>());
					posList.get(posList.size()-1).add(posY+i);
					posList.get(posList.size()-1).add(posX+1);
					
					if(count.size() == group + 1) count.add(new ArrayList<>());
					String pos = (posY+i) + "," + (posX+1);
					count.get(group + 1).add(pos);
					seats[posY+i][posX+1] = 0;
				}
			}
			
			if(posX - 1 >= 0 && posY + i >= 0 && posY + i < seats.length) {
				if(seats[posY+i][posX-1] != 0) {
					posList.add(new ArrayList<>());
					posList.get(posList.size()-1).add(posY+i);
					posList.get(posList.size()-1).add(posX-1);
					
					if(count.size() == group + 1) count.add(new ArrayList<>());
					String pos = (posY+i) + "," + (posX-1);
					count.get(group + 1).add(pos);
					seats[posY + i][posX - 1] = 0;
				}
			}
		}
		
		for(int i=0; i<posList.size(); i++) {
			match(posList.get(i).get(0), posList.get(i).get(1), group+1, seats, count);
		}
	}
}

/*

1
5 5
x...x
...x.
x..xx
.xx.x
..x.x
Answer: 8

1
5 8
.X...X..
..X.....
X.......
.X......
..X.....
Answer: 18

1
10 10
.X.X...X..
.X..X.....
X.X.......
.X.X......
X...X.....
.X.X...X..
.X..X.....
X.X.......
.X.X......
X...X.....
Answer: 42

1
5 10
.X.X...X..
.X..X.....
X.X.......
.X.X......
X...X.....
Answer: 21

1
5 7
X...X..
.X.....
.......
X......
.X.....
Answer: 17

1
3 3
xx.
xxx
x.x
Answer: 2


<<<<<INPUT>>>>>
17
2 3
...
...
2 3
x.x
xxx
2 3
x.x
x.x
10 10
....x.....
..........
..........
..x.......
..........
x...x.x...
.........x
...x......
........x.
.x...x....
10 10
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
3 3
xx.
xxx
x.x
3 5
..x..
..x..
.xxx.
1 6
..x...
10 10
.x.x...x..
.x..x.....
x.x.......
.x.x......
x...x.....
.x.x...x..
.x..x.....
x.x.......
.x.x......
x...x.....
5 10
.x.x...x..
.x..x.....
x.x.......
.x.x......
x...x.....
5 8
.x...x..
..x.....
x.......
.x......
..x.....
5 7
x...x..
.x.....
.......
x......
.x.....
4 3
x.x
x..
.x.
.xx
3 4
.x.x
.xx.
x.x.
5 4
x.x.
.x.x
x.x.
x..x
..xx
10 10
.x.x...x..
.x..x.....
x.xx..x...
.x.x....x.
x...x.x...
.x.x...x..
.x..x...x.
x.x.......
.x.x......
x.........
10 10
xxxxxxxxxx
..........
..........
xxxxxxxxxx
..........
xxxxxxxxxx
.........x
...x......
........x.
xxxxxxxxxx

<<OUTPUT>>
4
1
2
46
0
2
6
3
42
21
18
17
4
4
6
42
29

<<CRITICAL ERROR>>
1
6 4
x.x.
x...
x.x.
.x.x
...x
xx.x
Answer: 7
*/