package bj001929_findprime;
import java.io.*;

public class Main {
	static void findPrime(int max ,boolean prime[]){
		int i;
		int j;
		prime[0] = false;
		prime[1] = false;
		
		for(i = 2; i<prime.length; i++) {
			if(prime[i] == true) {
				for(j = i*2; j<prime.length; j+=i) {
					prime[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		
		int M = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		boolean[] prime = new boolean[N+1];
		Integer i;
		
		for(i=0; i<prime.length; i++) {
			prime[i] = true;
		}
		
		findPrime(N, prime);
		
		for(i=M; i<prime.length; i++) {
			if (prime[i] == true) bw.write(i.toString() + "\n");
		}
		
		bw.flush();
	}
}
