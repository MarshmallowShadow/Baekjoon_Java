package bj001120_string;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int len = a.length();
		int min = len;
		
		for(int i=len; i<=b.length(); i++) {
			String subB = b.substring(i-len, i);
			int diff = len;
			for(int j=0; j<len; j++) {
				if(subB.charAt(j) == a.charAt(j)) {
					diff--;
				}
			}
			if(diff < min) {
				min = diff;
			}
		}
		
		System.out.println(min);
		sc.close();
	}
}
