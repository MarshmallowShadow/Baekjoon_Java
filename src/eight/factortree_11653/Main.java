package eight.factortree_11653;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Long N = Long.parseLong(br.readLine());
		
		if (N > 1) {
			for(Long i=2L; i<=N; i++) {
				while(N%i == 0) {
					bw.write(i.toString() + "\n");
					N /= i;
				}
			}
		}
		bw.flush();
	}
}

