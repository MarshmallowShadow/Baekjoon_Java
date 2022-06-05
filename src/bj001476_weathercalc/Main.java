package bj001476_weathercalc;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int years = 1;
		
		while(E!=1 || S !=1 || M!=1) {
			E--;
			S--;
			M--;
			years++;
			
			if(E<1) {
				E = 15;
			}
			if(S<1){
				S = 28;
			}
			if(M<1) {
				M = 19;
			}
		}
		
		System.out.println(years);
		sc.close();
	}
}
