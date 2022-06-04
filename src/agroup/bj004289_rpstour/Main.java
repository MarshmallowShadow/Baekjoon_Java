package agroup.bj004289_rpstour;

/* 4289번: Rock-Paper-Scissors Tournament (https://www.acmicpc.net/problem/4289)

Rock-Paper-Scissors is game for two players, A and B, who each choose, independently of the other,
one of rock, paper, or scissors. A player chosing paper wins over a player chosing rock;
a player chosing scissors wins over a player chosing paper;
a player chosing rock wins over a player chosing scissors.
A player chosing the same thing as the other player neither wins nor loses.

A tournament has been organized in which each of n players plays k rock-scissors-paper games
with each of the other players - k*n*(n-1)/2 games in total.
Your job is to compute the win average for each player, defined as w / (w + l)
where w is the number of games won, and l is the number of games lost, by the player.


Input:
Input consists of several test cases. The first line of input for each case contains
1 ≤ n ≤ 100 1 ≤ k ≤ 100 as defined above. For each game, a line follows containing
p1, m1, p2, m2. 1 ≤ p1 ≤ n and 1 ≤ p2 ≤ n are distinct integers identifying two players;
m1 and m2 are their respective moves ("rock", "scissors", or "paper"). A line containing 0
follows the last test case.

Output:
Output one line each for player 1, player 2, and so on, through player n,
giving the player's win average rounded to three decimal places. If the win average is undefined,
output "-". Output an empty line between cases.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt(); //선수
			
			//0으로 반복문 끊김
			if(n == 0) {
				break;
			}
			
			int k = sc.nextInt(); //각 게임
			sc.nextLine();
			
			double[] wins = new double[n];
			double[] total = new double[n];
			
			int games = k*n*(n-1)/2; //총 진행되는 게임
			
			for(int j=0; j<games; j++) {
				int p1 = sc.nextInt(); //선수1 번호
				String m1 = sc.next(); //선수1 입력
				int p2 = sc.nextInt(); //선수2 번호
				String m2 = sc.next(); //선수2 입력
				sc.nextLine();
				
				int winner = rps(p1, m1, p2, m2); //어느 전수가 이기는가
				
				//무승부 아니면
				if(winner != -1) {
					wins[(int)winner-1]++;
					
					//승패가 가릴 경우에만 총 진행항 게임 횟수에 추가
					total[p1-1]++;
					total[p2-1]++;
				}
			}
			
			//선수들 승률 출력
			for(int i=0; i<n; i++) {
				//선수가 그냥 무승부만 있을 경우엔 "-" 출력
				if((int)total[i] == 0) {
					System.out.println("-");
					continue;
				}
				
				//아니면 3반올림으로 출력
				double rate = wins[i]/total[i];
				System.out.format("%.3f", rate); //반올림
				System.out.println();
			}
			
			//"Output an empty line between cases."
			System.out.println();
		}
		
		sc.close();
	}
	
	//가위바위보
	public static int rps(int p1, String m1, int p2, String m2) {
		if(m1.equals("rock") && m2.equals("scissors")) {
			return p1;
		} else if(m1.equals("paper") && m2.equals("rock")) {
			return p1;
		} else if(m1.equals("scissors") && m2.equals("paper")) {
			return p1;
		} else if(m2.equals("rock") && m1.equals("scissors")) {
			return p2;
		} else if(m2.equals("paper") && m1.equals("rock")) {
			return p2;
		} else if(m2.equals("scissors") && m1.equals("paper")) {
			return p2;
		} else { //무승부면 -1
			return -1;
		}
	}
}
