package three.fastaddition_15552;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = bf.readLine();
		int T = Integer.parseInt(S);
		int A;
		int B;
		
		for(int i=0; i<T; i++) {
			S = bf.readLine();
			String s[] = S.split(" ");
			A = Integer.parseInt(s[0]);
			B = Integer.parseInt(s[1]);
			
			bw.write(A + B + "\n");
		}
		bw.flush();
		bw.close();
	}
}
