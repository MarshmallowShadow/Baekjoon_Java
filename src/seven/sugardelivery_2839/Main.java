package seven.sugardelivery_2839;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		int temp = N;
		
		for(int i=0; i<=N/3; i++) {
			temp = N;
			count = i;
			
			temp -= 3 * i;
			
			while(temp>=5) {
				temp -= 5;
				count ++;
				
				if(temp == 0) break;
			}
			if(temp == 0) break;
		}
		
		if(temp == 0) System.out.println(count);
		else System.out.println(-1);
		
		sc.close();
	}
}
