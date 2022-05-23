package bj002580_sudoku;
import java.util.*;

public class Nain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		board = solve(board, 0, 0);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(board[i][j]);
				if(j<8) {
					System.out.print(" ");
				} else {
					System.out.println();
				}
			}
		}
		
		sc.close();
	}
	
	public static int[][] solve(int[][] board, int y, int x) {
		for(int i=y; i<9; i++) {
			for(int j=x; j<9; j++) {
				if(board[i][j] == 0) {
					int k = 1;
					while(board[i][j] == 0 && k <= 9) {
						board[i][j] = k;
						boolean check = checkDuplicate(board, i, j);
						if(!check) {
							board = solve(board, i, j);
						} else {
							board[i][j] = 0;
							k++;
						}
					}
					
					if(board[i][j] == 0) {
						board[y][x] = 0;
						return board;
					}
				}
			}
		}
		
		return board;
	}
	
	public static boolean checkDuplicate(int[][] board, int y, int x) {
		for(int i=1; i<=9; i++) {
			boolean exists = false;
			
			for(int j=0; j<9; j++) {
				if(board[y][j] == i) {
					if(!exists) {
						exists = true;
					} else {
						return true;
					}
				}
			}
		}
		
		for(int i=1; i<=9; i++) {
			boolean exists = false;
			
			for(int j=0; j<9; j++) {
				if(board[j][x] == i) {
					if(!exists) {
						exists = true;
					} else {
						return true;
					}
				}
			}
		}
		
		int posX;
		int posY;
		
		if(x >= 0 && x <= 2 && y >= 0 && y <= 2) {
			posX = 0;
			posY = 0;
		} else if(x >= 3 && x <= 5 && y >= 0 && y <= 2) {
			posX = 3;
			posY = 0;
		} else if(x >= 6 && x <= 8 && y >= 0 && y <= 2) {
			posX = 6;
			posY = 0;
		} else if(x >= 0 && x <= 2 && y >= 0 && y <= 2) {
			posX = 0;
			posY = 3;
		} else if(x >= 3 && x <= 5 && y >= 0 && y <= 2) {
			posX = 3;
			posY = 3;
		} else if(x >= 6 && x <= 8 && y >= 0 && y <= 2) {
			posX = 6;
			posY = 3;
		} else if(x >= 0 && x <= 2 && y >= 0 && y <= 2) {
			posX = 0;
			posY = 6;
		} else if(x >= 3 && x <= 5 && y >= 0 && y <= 2) {
			posX = 3;
			posY = 6;
		} else {
			posX = 6;
			posY = 6;
		}
		
		for(int i=1; i<=9; i++) {
			boolean exists = false;
			
			for(int j=posX; j<posX+3; j++) {
				for(int k=posY; k<posY+3; k++) {
					if(board[k][j] == i) {
						if(!exists) {
							exists = true;
						} else {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
}
