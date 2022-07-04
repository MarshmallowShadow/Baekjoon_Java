package agroup.bj010973;

/* 10973번: 이전 순열 (https://www.acmicpc.net/problem/10973)

1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 바로 이전에 오는 순열을 구하는 프로그램을 작성하시오.

사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.

N = 3인 경우에 사전순으로 순열을 나열하면 다음과 같다.

    1, 2, 3
    1, 3, 2
    2, 1, 3
    2, 3, 1
    3, 1, 2
    3, 2, 1


입력: 첫째 줄에 N(1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄에 순열이 주어진다.

출력: 첫째 줄에 입력으로 주어진 순열의 이전에 오는 순열을 출력한다. 만약, 사전순으로 가장 처음에 오는 순열인 경우에는 -1을 출력한다.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int pos=0;
		
		for(int i=num.length-1; i>=0; i--) {
			if(i==0) {
				pos = -1;
				break;
			}
			if(num[i] < num[i-1]) {
				pos = i-1;
				break;
			}
		}
		
		if(pos == -1) {
			System.out.println("-1");
		}
		else {
			sort(num, pos);
			for(int i=0; i<num.length; i++) {
				System.out.print(num[i]);
				if(i != num.length-1) {
					System.out.print(" ");
				}
			}
		}
		
		sc.close();
	}
	
	public static void sort(int[] num, int pos) {
		int maxPos = pos + 1;
		for(int i=pos+2; i<num.length; i++) {
			if(num[i] > num[maxPos] && num[i] < num[pos]) {
				maxPos = i;
			}
		}
		
		posSwitch(num, pos, maxPos);
		
		for(int i=pos+1, j=num.length-1; i <= j; i++, j--) {
			posSwitch(num, i, j);
		}
	}
	
	public static void posSwitch(int[] num, int pos1, int pos2) {
		int temp = num[pos1];
		num[pos1] = num[pos2];
		num[pos2] = temp;
	}
}
