package bj002675_repeatstring;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int c;
		String s;
		
		for(int i=0; i<T; i++) {
			c = sc.nextInt();
			s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<c; k++) {
					System.out.print(s.charAt(j));
				}
			}
			
			System.out.println("");
		}
		
		sc.close();
	}
}

