package eight.goldbachconjecture_9020;
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
		int T = Integer.parseInt(br.readLine());
		int n;
		int k;
		Integer diff;
		boolean[] prime;
		
		
		for(k=0; k<T; k++) {
			n = Integer.parseInt(br.readLine());
			prime = new boolean[n+1];
			
			for(int i=0; i<prime.length; i++) {
				prime[i] = true;
			}
			
			findPrime(n, prime);
			
			for(Integer j=n/2; j>=2; j--) {
				if(prime[j] == true && prime[n-j] == true) {
					diff = n-j;
					bw.write(j.toString() + " " + diff.toString() + "\n");
					break;
				}
			}
		}
		
		bw.flush();
	}
}
