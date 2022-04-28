package fourteen.nm3_15651;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws IOException {
		String[] s = br.readLine().split(" ");
		int M = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		int[] num = new int[N];
		
		printCombo(0, num, M, N);
		
		bw.flush();
	}
	
	public static void printCombo(int count, int num[], int M, int N) throws IOException {
		if(count == N) {
			for(int i=0; i<N; i++) {
				bw.write(num[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		for(int i=1; i<=M; i++) {
			num[count] = i;
			
			printCombo(count+1, num, M, N);
		}
	}
}