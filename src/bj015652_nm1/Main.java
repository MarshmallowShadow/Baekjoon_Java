package bj015652_nm1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] num = new int[N];
		
		printCombo(0, num, M, N);
		
		sc.close();
	}
	
	public static boolean checkSmall(int num[], int range) {
		for(int i=0; i<range; i++) {
			if(num[range] < num[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void printCombo(int count, int num[], int M, int N) {
		if(count == N) {
			for(int i=0; i<N; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1; i<=M; i++) {
			num[count] = i;
			
			if(count>0) {
				if(checkSmall(num, count)) {
					continue;
				}
			}
			
			printCombo(count+1, num, M, N);
		}
	}
}
