package bj001676_zerosinfactorial;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fives = 5;
		int zeros = 0;
		
		for(int i=1; i<=N; i++) {
			fives = 5;
			while(i%fives == 0) {
				zeros++;
				fives *= 5;
			}
		}
		
		System.out.println(zeros);
		
		sc.close();
	}
}
