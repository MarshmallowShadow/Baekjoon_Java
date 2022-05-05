package bj002231_sumdigit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int parent = Integer.parseInt(br.readLine());
		Integer num = 0;
		
		for(int i=1; i<parent; i++) {
			if(i + addDigits(i) == parent) {
				num = i;
				break;
			}
		}
		
		bw.write(num.toString());
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
