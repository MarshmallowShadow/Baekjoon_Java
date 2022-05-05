package bj002908_sangsoo;
import java.util.*;

public class Main {
	//제귀함수 연습
	static int tenPow(int power, int num) {
		if(power==0) {
			return num;
		}
		int tens = tenPow(power-1, num*10);
		return tens;
	}
	
	static int reverse(Integer num) {
		String s = num.toString();
		
		int newNum = 0;
		
		for(int i=0; i < s.length(); i++) {
			newNum += tenPow(i, (Character.getNumericValue(s.charAt(i))));
		}
		
		return newNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		n1 = reverse(n1);
		int n2 = sc.nextInt();
		n2 = reverse(n2);
		
		if(n1 > n2) System.out.println(n1);
		else System.out.println(n2);
		
		sc.close();
	}
}
