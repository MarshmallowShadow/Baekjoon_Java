package thirteen.ring_3036;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		int A = 1;
		int B = 1;
		
		for(int i=1; i<N; i++) {
			for(int j=num[0]; j>=1; j--) {
				if(num[i]%j == 0 && num[0]%j == 0) {
					A = num[0]/j;
					B = num[i]/j;
					break;
				}
			}
			
			System.out.println(A + "/" + B);
		}
		
		sc.close();
	}
}
