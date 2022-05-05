package bj001712_profitmark;
import java.util.*;

public class Main {
	
	static long profitMark(long A, long B, long C) {
		long num = 0;
		
		if(C <= B) num = -1;
		else num = (A / (C - B)) + 1;
		
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
