package bj018512_jumpjump;

/* 18512번: 점프점프 (https://www.acmicpc.net/problem/18512)


두 학생 A와 B가 일직선상의 트랙에서 같은 방향으로 멀리뛰기를 하고 있다. A는 한 번에 X 미터를, B는 한 번에 Y 미터를 뛴다.
두 학생의 시작 지점과 X, Y에 대한 정보가 주어졌을 때, 두 학생이 공통적으로 지나게 되는 지점 중에서 시작 지점으로부터 가장 가까운 지점을
찾는 프로그램을 작성하시오.

예를 들어 한 번에 10미터를 뛰는 A는 30의 지점에서 멀리뛰기를 시작하고, 한 번에 12미터를 뛰는 B는 8의 지점에서 시작한다고 가정하자.
A가 5번의 멀리뛰기를 하고, B가 6번의 멀리뛰기를 하면 두 사람은 80의 지점을 공통으로 지나게 되며,
이는 두 학생의 시작 지점에서 가장 가까운 지점이다.

입력: 첫째 줄에 두 사람이 한 번에 멀리뛰기를 하는 거리 X, Y와 시작 지점의 위치 값 P1, P2가
	각각 공백을 기준으로 구분되어 자연수로 주어진다. (1 ≤ X, Y, P1, P2 ≤ 100)

출력: 첫째 줄에 두 학생이 공통적으로 지나는 지점 중에서 가장 가까운 지점을 출력한다.
	단, 두 학생이 공통적으로 지나는 지점이 없다면 -1을 출력한다.


*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int px = sc.nextInt();
		int py = sc.nextInt();
		
		while(px != py && px < 10000 && py < 10000) {
			if(px < py) {
				px += x;
			} else if(px > py) {
				py += y;
			}
		}
		if(px > 10000 || py >10000) {
			System.out.println(-1);
		} else {
			System.out.println(px);
		}
		
		sc.close();
	}
}
