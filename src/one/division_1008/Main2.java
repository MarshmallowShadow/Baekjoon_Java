package one.division_1008;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
        double C;
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A>0 && A<10 && B>0 && B<10) {
				C = (double)A / (double)B;
                System.out.println(C);
				break;
			}
		}
		 sc.close();
	}
}
