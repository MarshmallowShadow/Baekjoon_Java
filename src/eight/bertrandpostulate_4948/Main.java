package eight.bertrandpostulate_4948;
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
		int i;
		int n;
		int n2;
		boolean[] prime;
		Integer count;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			else {
				n2 = n*2;
				prime = new boolean[n2+1];
				
				for(i=0; i<prime.length; i++) {
					prime[i] = true;
				}
				
				findPrime(n2, prime);
				
				count = 0;
				
				for(i=n+1; i<prime.length; i++) {
					if (prime[i] == true) count++; 
				}
				
				bw.write(count.toString() + "\n");
			}
		}
		
		bw.flush();
	}
}
