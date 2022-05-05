package bj002798_blackjack;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		Integer high = -1;
		int sum;
		
		String[] input2 = br.readLine().split(" ");
		int[] card = new int[N];
		
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(input2[i]);
		}
		
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					sum = card[i] + card[j] + card[k];
					if(sum > high && sum <= M) {
						high = sum;
					}
				}
			}
		}
		
		bw.write(high.toString());
		bw.flush();
	}
}
