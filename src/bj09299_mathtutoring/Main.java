package bj09299_mathtutoring;

/* 9299번: Math Tutoring

You are helping a friend with the rule for taking the derivative of a polynomial,
but he just can’t seem to get it! You’ve gone over many examples, and finally 
you decide to just write a program to compute the derivatives for him.
For example, the derivative of 2x3 − x + 3 is 6x2 − 1. Likewise,
the derivatave of 3x4 + 2x3 + 7x2 + 5x + 7 is 12x3 + 6x2 + 14x + 5.

Given a polynomial, provide the derivative. We are only using polynomials of the form presented here.

Input: The first line of input is the number of test cases that follow.
	Each input case appears on a single line, and will start with a single integer, n (1 ≤ n ≤ 100),
	which is the highest exponent of the polynomial. n + 1 values will follow, which are the coefficients
	of the terms xn down to x0 = 1, respectively. All coefficients will be integers between -1000 and 1000,
	inclusive. The highest exponent will always be positive. All numbers will be separated by a single space.

Output: For each case, output the line “Case x:” where x is the case number, on a single line.
	The output polynomial is to be formatted in the same manner as the input: the first value
	being the highest polynomial, and the successive values being the coefficients for the individual terms.
	Each output case should be on one line, with the values separated by one space.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= x; i++) {
			int n = sc.nextInt();
			System.out.print("Case " + i + ": " + (n-1) + " ");
			for(; n>=0; n--) {
				if(n == 0) {
					sc.nextLine();
					System.out.println();
					break;
				}
				
				int a = sc.nextInt();
				System.out.print(a*n + " ");
			}
		}
		
		sc.close();
	}
}
