package bj.whoiswinner_20154;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] letters = new int[26];
		setScores(letters);
		
		String word = sc.next();
		int sum = 0;
		
		for(int i=0; i<word.length(); i++) {
			sum += letters[word.charAt(i) - 65];
		}
		
		if(sum%2 != 0) {
			System.out.println("I'm a winner!");
		} else {
			System.out.println("You're the winner?");
		}
		
		sc.close();
	}
	
	public static void setScores(int[] letters) {
		letters[0] = 3;
		letters[1] = 2;
		letters[2] = 1;
		letters[3] = 2;
		letters[4] = 3;
		letters[5] = 3;
		letters[6] = 3;
		letters[7] = 3;
		letters[8] = 1;
		letters[9] = 1;
		letters[10] = 3;
		letters[11] = 1;
		letters[12] = 3;
		letters[13] = 3;
		letters[14] = 1;
		letters[15] = 2;
		letters[16] = 2;
		letters[17] = 2;
		letters[18] = 1;
		letters[19] = 2;
		letters[20] = 1;
		letters[21] = 1;
		letters[22] = 2;
		letters[23] = 2;
		letters[24] = 2;
		letters[25] = 1;
	}
}
