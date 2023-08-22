package bj014501_resignation;


/* 14501번: 퇴사
상담원으로 일하고 있는 백준이는 퇴사를 하려고 한다.
오늘부터 N+1일째 되는 날 퇴사를 하기 위해서, 남은 N일 동안 최대한 많은 상담을 하려고 한다.
백준이는 비서에게 최대한 많은 상담을 잡으라고 부탁을 했고, 비서는 하루에 하나씩 서로 다른 사람의 상담을 잡아놓았다.
각각의 상담은 상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi로 이루어져 있다.

상담을 적절히 했을 때, 백준이가 얻을 수 있는 최대 수익을 구하는 프로그램을 작성하시오.

입력: 첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다.
	둘째 줄부터 N개의 줄에 Ti와 Pi가 공백으로 구분되어서 주어지며, 1일부터 N일까지 순서대로 주어진다. (1 ≤ Ti ≤ 5, 1 ≤ Pi ≤ 1,000)

출력: 첫째 줄에 백준이가 얻을 수 있는 최대 이익을 출력한다.

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] days = new int[N+1];
		int[] pay = new int[N+1];
		int[] profit = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			days[i] = sc.nextInt()-1;
			pay[i] = sc.nextInt();
		}
		
		for(int i=1; i<=N; i++) { //days
			profit[i] = profit[i-1];
			for(int j=1; j<=N; j++) { //each appointment
				if(j+days[j] == i) {
					if(profit[i] < pay[j] + profit[i-days[j]-1]) {
						profit[i] = pay[j] + profit[i-days[j]-1];
					}
				}
			}
		}
		
		System.out.println(profit[N]);
		sc.close();
	}
}
