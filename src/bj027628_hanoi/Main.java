package bj027628_hanoi;
import java.io.*;

public class Main {
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int disk = Integer.parseInt(br.readLine());
		Integer count;
		
		count = (int)Math.pow(2,disk) - 1;
		bw.write(count.toString() + "\n");
		bw.flush();
		
		hanoi(count, disk, "1", "3", "2");
		bw.flush();
	}
	
	public static void hanoi(int count, int disk, String A, String B, String C)
		throws IOException {
		
		if(disk == 1) {
			bw.write(A + " " + B + "\n");
			return;
		}
		
		hanoi(count, disk-1, A, C, B);
		bw.write(A + " " + B + "\n");
		hanoi(count, disk-1, C, B, A);
	}
}
