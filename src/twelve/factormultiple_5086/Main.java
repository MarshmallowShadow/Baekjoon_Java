package twelve.factormultiple_5086;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num1 == 0 && num2 == 0) {
				break;
			} else if(num2%num1 == 0) {
				System.out.println("factor");
			} else if(num1%num2 == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
		
		sc.close();
	}
}
