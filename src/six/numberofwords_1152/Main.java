package six.numberofwords_1152;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int length = s.split(" ").length;
		if(length == 0) {
			System.out.println(length);
		}
		else {
			String[] words = s.split(" ");
			for(int i=0; i<words.length; i++) {
				if(words[i].equals("")) length--;
			}
			System.out.println(length);
		}
	}
}
