package bj002231_sumdigit;
import java.io.*;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int parent = Integer.parseInt(br.readLine());
		int num;
		Integer small = 0;
		
		for(int i=1; i<parent; i++) {
			num = i + addDigits(i);
			if(num == parent) {
				small = i;
				break;
			}
		}
		
		bw.write(small.toString());
		bw.flush();
	}
	
	public static int addDigits(int num) {
		if(num/10 == 0) {
			return num;
		}
		
		int sum = num%10 + addDigits(num/10);
		
		return sum;
	}
}
