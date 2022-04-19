package seven.snail_2869;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		Long A = Long.parseLong(s[0]);
		Long B = Long.parseLong(s[1]);
		Long V = Long.parseLong(s[2]);
		Long x = (V - B) / (A - B);
		if((V - B) % (A - B) > 0) x++;
		
		
		bw.write(x.toString());
		bw.flush();
	}
}
