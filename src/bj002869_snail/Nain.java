package bj002869_snail;
import java.io.*;

public class Nain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		Long A = Long.parseLong(s[0]);
		Long B = Long.parseLong(s[1]);
		Long V = Long.parseLong(s[2]);
		Long x = (V / (A - B)) - B;
		if(x*(A-B) + A < V) x += B + 1;
		
		
		bw.write(x.toString());
		bw.flush();
	}
}
