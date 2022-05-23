package bj002580_sudoku;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] board = new int[9][9];
		
		for(int i=0; i<9; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0; j<9; j++) {
				board[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		board = solve(board, 0, 0);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				bw.write(Integer.toString(board[i][j]));
				if(j<8) {
					bw.write(" ");
				} else {
					bw.newLine();
				}
			}
		}
		
		bw.flush();
	}
	
	public static int[][] solve(int[][] board, int y, int x) {
		int[][] b = board;
		
		int i = y;
		int j = x;
		
		while(i<9) {
			while(j<9) {
				if(b[i][j] == 0) {
					int k = 1;
					while(b[i][j] == 0 && k <= 9) {
						b[i][j] = k;
						boolean check = checkDuplicate(b, i, j);
						if(!check) {
							b = solve(b, i, j);
						} else {
							b[i][j] = 0;
						}
						k++;
					}
					
					if(b[i][j] == 0) {
						b[y][x] = 0;
						return b;
					}
				}
				j++;
			}
			
			j = 0;
			i++;
		}
		
		return b;
	}
	
	public static boolean checkDuplicate(int[][] board, int y, int x) {
		for(int i=0; i<8; i++) {
			if(board[y][i] == 0) {
				continue;
			} else {
				for(int j=i+1; j<9; j++) {
					if(board[y][i] == board[y][j]) {
						return true;
					}
				}
			}
		}
		
		for(int i=0; i<8; i++) {
			if(board[i][x] == 0) {
				continue;
			} else {
				for(int j=i+1; j<9; j++) {
					if(board[i][x] == board[j][x]) {
						return true;
					}
				}
			}
		}
		
		int posY = (y/3) * 3;
		int posX = (x/3) * 3;
		
		
		for(int i = posY; i<posY+3; i++) {
			for(int j = posX; j<posX+3; j++) {
				if(board[i][j] == 0) {
					continue;
				} else {
					int k = i;
					int l = j+1;
					while(k<posY+3) {
						while(l<posX+3) {
							if(board[i][j] == board[k][l]) {
								return true;
							}
							l++;
						}
						l=posX;
						k++;
					}
				}
			}
		}
		
		return false;
	}
}
