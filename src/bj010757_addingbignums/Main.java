package bj010757_addingbignums;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S[] = br.readLine().split(" ");
		String A = S[0];
		String B = S[1];
		String C = "";
		Integer add1;
		Integer add2;
		int sum = 0;
		int raise = 0;
		
		while(A.length() < B.length()) {
			A = "0" + A;
		}
		while(B.length() < A.length()) {
			B = "0" + B;
		}
		
		
		for(int i=A.length()-1; i>=0; i--) {
			add1 = Character.getNumericValue(A.charAt(i));
			add2 = Character.getNumericValue(B.charAt(i));
			
			sum = (add1 + add2 + raise) % 10;
			
			raise = (add1 + add2 + raise) / 10;
			
			C = sum + C;
		}
		
		if(raise > 0) C = raise + C;
		
		bw.write(C);
		bw.flush();
		
	}
}
