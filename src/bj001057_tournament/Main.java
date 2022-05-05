package bj001057_tournament;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int players = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();
		
		int round = 0;
		
		while(players != 1 && kim != lim) {
			players -= players / 2;
			kim -= kim / 2;
			lim -= lim / 2;
			round++;
		}
		
		if(players == 1 && kim != lim) {
			round = -1;
		}
		
		System.out.println(round);
		
		sc.close();
	}
}
