package twelve.gcm_1934;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int gcm;
		int num1;
		int num2;
		
		int j;
		int k;
		
		for(int i=0; i<N; i++) {
			gcm = 0;
			j=1;
			k=1;
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			while(true) {
				if(num1*j == num2*k) {
					gcm = num1*j;
					System.out.println(gcm);
					break;
				} else if(num1*j > num2*k) {
					k++;
				} else if(num1*j < num2*k) {
					j++;
				}
			}
		}
		
		sc.close();
	}
}