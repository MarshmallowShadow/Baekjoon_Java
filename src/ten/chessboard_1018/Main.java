package ten.chessboard_1018;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		String[] input = br.readLine().split(" ");
		int y = Integer.parseInt(input[0]);
		Integer countW = 0;
		Integer countB = 0;
		Integer small = 32;
		
		String[] board = new String[y];
		String[] perfectW = new String[8];
		String[] perfectB = new String[8];
		
		for(int i=0; i<8; i++) {
			if(i%2 == 0) {
				perfectW[i] = "WBWBWBWB";
				perfectB[i] = "BWBWBWBW";
			} else {
				perfectW[i] = "BWBWBWBW";
				perfectB[i] = "WBWBWBWB";
			}
		}
		
		for(int i=0; i<board.length; i++) {
			board[i] = br.readLine();
		}
		
		for(int i=0; i<board.length-7; i++) {
			for(int j=0; j<board[i].length()-7; j++) {
				countB = 0;
				countW = 0;
				
				for(int k=0; k<8; k++) {
					for(int l=0; l<8; l++) {
						if(board[i+k].charAt(j+l) != perfectB[k].charAt(l)) {
							countB++;
						}
						if(board[i+k].charAt(j+l) != perfectW[k].charAt(l)) {
							countW++;
						}
					}
				}
				
				if(countB < small) small = countB;
				if(countW < small) small = countW;
			}
		}
		
		bw.write(small.toString());
		bw.flush();
	}
}
