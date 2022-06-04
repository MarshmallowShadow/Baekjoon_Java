package agroup.bj004289_rpstour;

/* 4289¹ø: Rock-Paper-Scissors Tournament (https://www.acmicpc.net/problem/4289)

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
1 ¡Â n ¡Â 100 1 ¡Â k ¡Â 100 as defined above. For each game, a line follows containing
p1, m1, p2, m2. 1 ¡Â p1 ¡Â n and 1 ¡Â p2 ¡Â n are distinct integers identifying two players;
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
			int n = sc.nextInt();
			
			if(n == 0) {
				break;
			}
			
			int k = sc.nextInt();
			sc.nextLine();
			
			double[] wins = new double[n];
			double[] total = new double[n];
			
			int games = k*n*(n-1)/2;
			
			for(int j=0; j<games; j++) {
				int p1 = sc.nextInt();
				String m1 = sc.next();
				int p2 = sc.nextInt();
				String m2 = sc.next();
				sc.nextLine();
				
				int winner = rps(p1, m1, p2, m2);
				
				if(winner != -1) {
					wins[(int)winner-1]++;
					
					total[p1-1]++;
					total[p2-1]++;
				}
			}
			
			for(int i=0; i<n; i++) {
				if((int)total[i] == 0) {
					System.out.println("-");
					continue;
				}
				double rate = wins[i]/total[i];
				System.out.format("%.3f", rate);
				System.out.println();
			}
			
			System.out.println();
		}
		
		sc.close();
	}
	
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
		} else {
			return -1;
		}
	}
}
