package practice.recursive;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		Integer num = Integer.parseInt(br.readLine());
		
		printDigits(num);
		
		bw.flush();
		
	}
		
	public static void printDigits(Integer num) throws IOException {
		if(num/10 == 0) {
			bw.write(num.toString() + "\n");
			return;
		} else {
			printDigits(num/10);
			
			Integer digit = num%10;
			bw.write(digit.toString() + "\n");
		}
		
	}
}
