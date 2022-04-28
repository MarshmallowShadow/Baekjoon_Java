package thirteen.zerosincombination_2004;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int CTwos;
		int CFives;
		int CZeros;
		
		CTwos = twos(N) - twos(K) - twos(N-K);
		
		CFives = fives(N) - fives(K) - fives(N-K);
		
		if(CTwos <= 0 || CFives <= 0) {
			CZeros = 0;
		} else if(CFives <= CTwos) {
			CZeros = CFives;
		} else {
			CZeros = CTwos;
		}
		
		System.out.println(CZeros);
		
		sc.close();
	}
	
	public static int fives(int num) {
		if(num < 5) {
			return 0;
		}
		
		int recurse = fives(num/5);
		
		int fives = num/5 + recurse;
		
		return fives;
	}
	
	public static int twos(int num) {
		if(num < 2) {
			return 0;
		}
		
		int recurse = twos(num/2);
		int twos = num/2 + recurse;
		
		return twos;
	}
}

