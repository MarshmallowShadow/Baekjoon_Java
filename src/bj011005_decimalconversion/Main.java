package bj011005_decimalconversion;

/* 11005번: 진법 변환

10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35


입력: 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

출력: 첫째 줄에 10진법 수 N을 B진법으로 출력한다.


*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int base = sc.nextInt();
		
		String newNum = "";
		
		//if num is 0, print 0 
		if(dec == 0) {
			newNum = "0";
		}
		
		while(dec > 0) {
			//get remainder
			int d = dec % base;
			
			//determine whether to add number or letter
			if(d <= 9) {
				newNum = d + newNum;
			} else {
				//ASCII code for 'A' is 65
				char c = (char)(55 + d);
				newNum = c + newNum;
			}
			
			//divide number by base
			dec /= base;
		}
		
		System.out.print(newNum);
		sc.close();
	}
}
