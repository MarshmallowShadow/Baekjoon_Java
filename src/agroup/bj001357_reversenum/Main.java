package agroup.bj001357_reversenum;

/* 1357번: 뒤집힌 덧셈 (https://www.acmicpc.net/problem/1357)


어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다.
Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 예를 들어, X=123일 때, Rev(X) = 321이다.
그리고, X=100일 때, Rev(X) = 1이다.

두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오


입력: 첫째 줄에 수 X와 Y가 주어진다. X와 Y는 1,000보다 작거나 같은 자연수이다.

출력: 첫째 줄에 문제의 정답을 출력한다.


*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder x = new StringBuilder();
		StringBuilder y = new StringBuilder();
		
		x.append(sc.next()).reverse();
		y.append(sc.next()).reverse();
		
		int revX = Integer.parseInt(x.toString());
		int revY = Integer.parseInt(y.toString());
		
		int sum = revX + revY;
		
		StringBuilder revSum = new StringBuilder();
		revSum.append(Integer.toString(sum)).reverse();
		
		int finalSum = Integer.parseInt(revSum.toString());
		
		System.out.println(finalSum);
		
		sc.close();
	}
}
