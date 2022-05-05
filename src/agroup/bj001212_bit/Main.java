package agroup.bj001212_bit;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String octal = br.readLine();
		
		String[] oct = {"000", "001", "010", "011", "100", "101", "110", "111", "0", "1", "10", "11"};
		
		for(int i=0; i<octal.length(); i++) {
			if(i==0 && Character.getNumericValue(octal.charAt(i))<4) {
				bw.write(oct[Character.getNumericValue(octal.charAt(i))+8]);
				continue;
			}
			bw.write(oct[Character.getNumericValue(octal.charAt(i))]);
		}
		
		bw.flush();
	}
}
