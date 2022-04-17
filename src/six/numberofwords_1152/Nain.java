package six.numberofwords_1152;
import java.io.*;

public class Nain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		if(s[0].equals(""))
			System.out.println(s.length - 1);
		else System.out.println(s.length);
	}
}
