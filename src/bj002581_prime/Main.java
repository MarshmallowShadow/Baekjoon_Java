package bj002581_prime;
import java.util.*;

public class Main {
	static boolean checkPrime(int num){
		if(num == 2) return true;
		else if(num > 2 && num % 2 != 0) {
			for(int j=3; j<num; j+=2) {
				if(num % j == 0) {
					return false;
				}
			}
		}
		else return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int prime = -1;
		
		
		for(int i=M; i<=N; i++) {
			if(checkPrime(i)) {
				prime = i;
				break;
			}
		}
		
		if(prime == -1) {
			System.out.println(prime);
		} else {
			for(int i=M; i<=N; i++) {
				if(checkPrime(i)) {
					sum += i;
				}
			}
			System.out.println(sum);
			System.out.println(prime);
		}
		
		sc.close();
	}
}
