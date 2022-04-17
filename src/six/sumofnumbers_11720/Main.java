package six.sumofnumbers_11720;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String n = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += Character.getNumericValue(n.charAt(i));
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
