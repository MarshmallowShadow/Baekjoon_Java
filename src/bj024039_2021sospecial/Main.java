package bj024039_2021sospecial;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int a = 2;
		int b = 3;
		boolean notSpecial = true;
		
		while(notSpecial) {
			if(a * b > N) {
				notSpecial = false;
				break;
			}
			
			a = b;
			b += 2;
			
			boolean prime = false;
			while (!prime) {
				prime = true;
				for(int i=2; i<b; i++) {
					if(b%i == 0) {
						prime = false;
						break;
					}
				}
				if(!prime) {
					b += 2;
				}
			}
		}
		
		bw.write(Integer.toString(a * b));
		bw.flush();
	}
}
