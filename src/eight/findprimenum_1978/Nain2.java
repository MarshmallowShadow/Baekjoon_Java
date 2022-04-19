package eight.findprimenum_1978;
import java.util.*;

public class Nain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int prime = N;
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			
			if(A[i] == 1) {
				prime--;
				continue;
			}
			if(A[i] > 2 && A[i] % 2 != 0) {
				for(int j=3; j<A[i]; j+=2) {
					if(A[i] % j == 0) {
						prime--;
						break;
					}
				}
			}
		}
		
		System.out.println(prime);
		
		sc.close();
	}
}
