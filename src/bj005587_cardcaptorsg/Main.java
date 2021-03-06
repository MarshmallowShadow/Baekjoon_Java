package bj005587_cardcaptorsg;

/* 5587번: 카드 캡터 상근이

다음과 같은 카드게임이 BOJ 학교에서 유행하고 있다.

    1에서 2n까지의 정수가 쓰여진 총 2n개의 카드를 사용한다.
    카드를 2명이 n장씩 나눠가진다.
    다음 규칙에 따라 교대로 카드를 1장씩 낸다.
        놓여진 카드가 없다면 원하는 카드를 낼 수 있다.
        놓여진 카드가 있다면 마지막에 나온 카드보다 큰 숫자가 적힌 카드를 낼 수 있다.
        낼 카드가 없는 경우 상대의 차례가 된다. 이때, 자리에 나와있는 카드는 없어진다.
    게임은 카드가 아무 것도 놓여있지 않은 상태에서 시작한다.
    둘 중 한 명이라도 카드를 모두 사용하면 게임이 종료된다.
    게임 종료시 상대방이 가지고 있는 카드의 수를 점수로 획득한다.

상근이와 근상이는 이 게임에서 맞붙게 됐다. 게임은 상근이의 차례에서 시작하며,
두 사람은 각자 낼 수 있는 카드 중 반드시 가장 작은 숫자가 적힌 카드를 내기로 하였다. 
카드 캡터인 상근이는 게임의 결과를 미리 예상해서 질 것 같은 게임은 피하려고 한다. 
배부되는 카드가 주어졌을 때, 상근이와 근상이의 점수를 출력하는 프로그램을 작성하자.

입력: 1번째 줄에는 n이 주어진다. (1 ≤ n ≤ 100)
	 이후 n개의 줄에 상근이에게 주어지는 각 카드에 적힌 수가 주어진다. 즉, 1~2n중 나머지 카드는 근상이에게 주어진다.

출력: 1번째 줄에 상근이의 점수를 출력하고, 2번째 줄에 근상이의 점수를 출력한다.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] sg = new int[n];
		
		int[] deck = new int[n*2];
		
		for(int j=0; j<n*2; j++) {
			deck[j] = j+1;
		}
		
		for(int i=0; i<n; i++) {
			sg[i] = sc.nextInt();
			for(int j=0; j<n*2; j++) {
				if(deck[j] == sg[i]) {
					deck[j] = 0;
					break;
				}
			}
		}
		
		sort(sg);
		
		int[] gs = new int[n];
		
		int index = 0;
		
		for(int j=0; j<n*2; j++) {
			if(deck[j] > 0) {
				gs[index] = deck[j];
				index++;
			}
		}
		
		int sgHand = n;
		int gsHand = n;
		
		int top = 0;
		
		boolean myTurn = true;
		
		while(sgHand > 0 && gsHand > 0) {
			boolean played = false;
			if(myTurn) {
				for(int i=0; i<n; i++) {
					if(sg[i] > top) {
						top = sg[i];
						sg[i] = 0;
						sgHand--;
						played = true;
						break;
					}
				}
				if(!played) {
					top = 0;
				}
				myTurn = false;
			} else {
				for(int i=0; i<n; i++) {
					if(gs[i] > top) {
						top = gs[i];
						gs[i] = 0;
						gsHand--;
						played = true;
						break;
					}
				}
				if(!played) {
					top = 0;
				}
				myTurn = true;
			}
		}
		
		int pSG = gsHand;
		int pGS = sgHand;
		
		System.out.println(pSG);
		System.out.println(pGS);
		
		sc.close();
	}
	
	public static void sort(int[] num) {
		for(int i=0; i<num.length; i++) {
			int low = lowest(num, i);
			int temp = num[low];
			num[low] = num[i];
			num[i] = temp;
		}
	}
	
	public static int lowest(int[] num, int range) {
		int lowest = range;
		
		for(int i=range+1; i<num.length;  i++) {
			if(num[lowest] > num[i]) {
				lowest = i;
			}
		}
		
		return lowest;
	}
}
