package bj006603_lotto;

/* 6603번: 로또 (https://www.acmicpc.net/problem/6603)

독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.

로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중 k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고
번호를 선택하는 것이다.

예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28가지이다.
([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])

집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.


입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있다. 첫 번째 수는 k (6 < k < 13)이고,
	다음 k개 수는 집합 S에 포함되는 수이다. S의 원소는 오름차순으로 주어진다.

	입력의 마지막 줄에는 0이 하나 주어진다. 

출력: 각 테스트 케이스마다 수를 고르는 모든 방법을 출력한다. 이때, 사전 순으로 출력한다.
	각 테스트 케이스 사이에는 빈 줄을 하나 출력한다.

*/

import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		while(true) {
			String[] s = br.readLine().split(" ");
			int k = Integer.parseInt(s[0]);
			
			if(k == 0) {
				break;
			}
			
			int[] S = new int[k];
			int[] lotto = new int[6];
			
			for(int i=1; i<k+1; i++) {
				S[i-1] = Integer.parseInt(s[i]);
			}
			
			printLotto(S, lotto);
			bw.newLine();
			bw.flush();
		}
	}
	
	public static void printLotto(int[] S, int[] lotto) throws IOException {
		//재귀 끊는 최종 조건 (성공했을 경우): 로또 번호가 다 채워지면은 출력
		if(lotto[5] != 0) {
			for(int i=0; i<6; i++) {
				bw.write(Integer.toString(lotto[i]));
				if(i != 5) {
					bw.write(" ");
				}
			}
			bw.newLine();
			lotto[5] = 0;
			return;
		}
		
		for(int j=0; j<6; j++) {
			//로또 전호가 0 아니면 넘어감
			if(lotto[j] != 0) {
				continue;
			}
			
			//로또 번호 0인 경우 그 자리에 S값 전부 투입
			for(int l=0; l<S.length; l++) {
				//첫번째 자리면은 자동 투입
				if(j==0) {
					lotto[j] = S[l];
					printLotto(S, lotto);
				}
				//전 번호 자리가 S보다 작으면 현제 자리에 S값 투입
				else if(lotto[j-1] < S[l]) {
					lotto[j] = S[l];
					printLotto(S, lotto);
				}
			}
			
			//j자리 초기화하고 1단계 뒤로
			lotto[j] = 0;
			return;
		}
	}
}
