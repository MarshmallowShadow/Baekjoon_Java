package bj015649_nm;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String s[] = br.readLine().split(" ");
		int M = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		
		int[] num = new int[N];
		
		printNums(0, M, N, num);
	}
	
	public static boolean checkRepeat(int[] num, int size) {
		for(int i=0; i<size; i++) {
			if(num[size] == num[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void printNums(int count, int M, int N, int[]num) throws IOException {
		if(count == N) {
			for(int i=0; i<N; i++) {
				bw.write(num[i] + " ");
			}
			bw.write("\n");
			bw.flush();
			return;
		}
		
		for(int i=1; i<=M; i++) {
			num[count] = i;
			
			if(count>0) {
				if(checkRepeat(num, count)){
					continue;
				}
			}
			
			printNums(count+1, M, N, num);
		}
	}
}
