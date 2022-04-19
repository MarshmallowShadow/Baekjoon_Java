package seven.findfraction_1193;
import java.util.*;

public class Nain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 1;
		int B = 1;
		int num = sc.nextInt();
		
		
		while(num > 1) {
			if(A==1) {
				B++;
				num--;
				if(num > 1) {
					while(B > 1) {
						B--;
						A++;
						num--;
					}
				}
			}
			else {
				A++;
				num--;
				if(num > 1) {
					while(A > 1) {
						A--;
						B++;
						num--;
					}
				}
			}
		}
		
		System.out.println(A + "/" + B);
		
		sc.close();
	}
}
