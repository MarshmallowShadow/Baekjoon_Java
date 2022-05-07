package bj002578_bingo;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		
		for(int k=0; k<25; k++) {
			int num = sc.nextInt();
			boolean marked = false;
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(board[i][j] == num) {
						board[i][j] = 0;
						count++;
						marked = true;
						break;
					}
					if(marked) break;
				}
			}
			
			int bingo = checkBingo(board);
			if(bingo>=3) break;
		}
		
		System.out.println(count);
		sc.close();
	}
	
	public static int checkBingo(int[][] board) {
		int count = 0;
		
		for(int i=0; i<5; i++) {
			if(board[i][0] == 0 && board[i][1] == 0 && board[i][2] == 0
					&& board[i][3] == 0 && board[i][4] == 0) count++;
		}
		for(int i=0; i<5; i++) {
			if(board[0][i] == 0 && board[1][i] == 0 && board[2][i] == 0
					&& board[3][i] == 0 && board[4][i] == 0) count++;
		}
		if(board[0][0] == 0 && board[1][1] == 0 && board[2][2] == 0
				&& board[3][3] == 0 && board[4][4] == 0) count++;
		if(board[0][4] == 0 && board[1][3] == 0 && board[2][2] == 0
				&& board[3][1] == 0 && board[4][0] == 0) count++;
		
		return count;
	}
}
