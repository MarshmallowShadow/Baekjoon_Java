package bj001712_profitmark;
import java.util.*;

public class Nain {
	
	static long profitMark(long A, long B, long C) {
		int num = 0;
		
		while(true) {
			if(C <= B) {
				num = -1;
				break;
			}
			else if(A + B * num < C * num) break;
			else num++;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		
		long num = profitMark(A, B, C);
		
		System.out.println(num);
		
		sc.close();
	}
}