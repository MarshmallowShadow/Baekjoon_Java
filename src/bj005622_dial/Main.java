package bj005622_dial;
import java.util.*;

public class Main {
	static int timer(char c) {
		if(c <= 'C') return 3;
		else if(c <= 'F') return 4;
		else if(c <= 'I') return 5;
		else if(c <= 'L') return 6;
		else if(c <= 'O') return 7;
		else if(c <= 'S') return 8;
		else if(c <= 'V') return 9;
		else if(c <= 'Z') return 10;
		else return 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sec = 0;
		
		for(int i=0; i<s.length(); i++) {
			sec += timer(s.charAt(i));
		}
		
		System.out.println(sec);
		
		sc.close();
	}
}
