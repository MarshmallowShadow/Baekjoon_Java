package bj010809_alphabetsearch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		char c;
		
		for(int i='a'; i<='z'; i++) {
			c = (char)i;
			
			System.out.print(s.indexOf(c) + " ");
		}
		
		sc.close();
	}
}
