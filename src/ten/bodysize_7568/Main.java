package ten.bodysize_7568;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[][] body = new int[N][2];
		String[] input = new String[2];
		Integer[] rank = new Integer[N];
		
		for(int i=0; i<N; i++) {
			input = br.readLine().split(" ");
			for(int j=0; j<2; j++) {
				body[i][j] = Integer.parseInt(input[j]);
			}
			rank[i] = 1;
		}
		
		sortRank(body, rank);
		
		for(int i=0; i<N; i++) {
			bw.write(rank[i].toString() + " ");
		}
		
		bw.flush();
	}
	
	public static void sortRank(int[][] body, Integer[] rank) {
		for(int i=0; i<rank.length; i++) {
			for(int j=0; j<i; j++) {
				if((body[i][0] < body[j][0] && body[i][1] < body[j][1])
						|| (body[i][0] < body[j][0] && body[i][1] < body[j][1])) {
					rank[i]++;
				}
				else if((body[i][0] > body[j][0] && body[i][1] > body[j][1])
						|| (body[i][0] > body[j][0] && body[i][1] > body[j][1])) {
					rank[j]++;
				}
			}
		}
	}
	
}