package thirteen.lcdgcm_2609;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcd = 0;
		int gcm = 0;
		
		int i;
		if(num1 < num2) {
			i = num1;
		} else {
			i = num2;
		}
		
		while(i>0) {
			if(num1%i == 0 && num2%i == 0) {
				lcd = i;
				break;
			} else {
				i--;
			}
		}
		
		int j = 1;
		int k = 1;
		while(true) {
			if(num1*j == num2*k) {
				gcm = num1*j;
				break;
			} else if(num1*j > num2*k) {
				k++;
			} else if(num1*j < num2*k) {
				j++;
			}
		}
		
		System.out.println(lcd);
		System.out.println(gcm);
		
		sc.close();
	}
}
