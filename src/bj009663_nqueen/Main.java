package bj009663_nqueen;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] board = new int[N];
		
		double num = findPos(board, 0);
		
		bw.write(Integer.toString((int)num));
		bw.flush();
	}
	
	public static double findPos(int[] board, int index) {
		if(index == board.length) {
			return 1;
		}
		
		double count = 0;
		boolean inRange;
		
		for(int i=0; i<board.length; i++) {
			if(index==0) {
				board[index] = i;
				count += findPos(board, index+1);
			} else {
				inRange = false;
				
				for(int j=0; j<index; j++) {
					if(i == board[j] || i == board[j]-(index-j) 
							|| i == board[j]+(index-j)) {
						inRange = true;
						break;
					}
				}
				
				if(!inRange) {
					board[index] = i;
					count += findPos(board, index+1);
				}
			}
		}
		
		return count;
	}
}
