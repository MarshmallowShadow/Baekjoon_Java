package agroup.bj005587_cardcaptorsg;

/* 5587��: ī�� ĸ�� �����

������ ���� ī������� BOJ �б����� �����ϰ� �ִ�.

    1���� 2n������ ������ ������ �� 2n���� ī�带 ����Ѵ�.
    ī�带 2���� n�徿 ����������.
    ���� ��Ģ�� ���� ����� ī�带 1�徿 ����.
        ������ ī�尡 ���ٸ� ���ϴ� ī�带 �� �� �ִ�.
        ������ ī�尡 �ִٸ� �������� ���� ī�庸�� ū ���ڰ� ���� ī�带 �� �� �ִ�.
        �� ī�尡 ���� ��� ����� ���ʰ� �ȴ�. �̶�, �ڸ��� �����ִ� ī��� ��������.
    ������ ī�尡 �ƹ� �͵� �������� ���� ���¿��� �����Ѵ�.
    �� �� �� ���̶� ī�带 ��� ����ϸ� ������ ����ȴ�.
    ���� ����� ������ ������ �ִ� ī���� ���� ������ ȹ���Ѵ�.

����̿� �ٻ��̴� �� ���ӿ��� �ºٰ� �ƴ�. ������ ������� ���ʿ��� �����ϸ�,
�� ����� ���� �� �� �ִ� ī�� �� �ݵ�� ���� ���� ���ڰ� ���� ī�带 ����� �Ͽ���. 
ī�� ĸ���� ����̴� ������ ����� �̸� �����ؼ� �� �� ���� ������ ���Ϸ��� �Ѵ�. 
��εǴ� ī�尡 �־����� ��, ����̿� �ٻ����� ������ ����ϴ� ���α׷��� �ۼ�����.

�Է�: 1��° �ٿ��� n�� �־�����. (1 �� n �� 100)
	 ���� n���� �ٿ� ����̿��� �־����� �� ī�忡 ���� ���� �־�����. ��, 1~2n�� ������ ī��� �ٻ��̿��� �־�����.

���: 1��° �ٿ� ������� ������ ����ϰ�, 2��° �ٿ� �ٻ����� ������ ����Ѵ�.

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
