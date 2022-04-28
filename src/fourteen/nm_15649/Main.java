package fourteen.nm_15649;
import java.io.*;
import java.util.*;

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
			if(num[size-1] == num[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void printNums(int count, int M, int N, int[]num) throws IOException {
		if(count>N-1) {
			for(int i=0; i<N; i++) {
				bw.write(num[i] + " ");
			}
			bw.write("\n");
			bw.flush();
			return;
		}
		
		for(int i=1; i<=M; i++) {
			for(int j=0; j<N; j++) {
				if(j>1) {
					if(!checkRepeat(num, i)){
						return;
					}
				}
				
				num[count] = i;
				printNums(count+1, M, N, num);
			}
		}
	}
}
