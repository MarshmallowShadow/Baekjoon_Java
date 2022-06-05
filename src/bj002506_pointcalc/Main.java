package bj002506_pointcalc;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int point = 0;
		int consec = 0;
		
		for(int i=0; i<N; i++) {
			int p = sc.nextInt();
			
			if(p == 0) consec = 0;
			else {
				consec++;
				point += consec;
			}
		}
		
		System.out.println(point);
		
		sc.close();
	}
}
