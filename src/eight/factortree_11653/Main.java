package eight.factortree_11653;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Long N = Long.parseLong(br.readLine());
		
		if (N > 1) {
			if(N%2 == 0) bw.write(2 + "\n");
			for(Long i=3L; i<=N; i+=2) {
				if(N%i == 0) {
					bw.write(i.toString() + "\n");
				}
			}
		}
		bw.flush();
	}
}

