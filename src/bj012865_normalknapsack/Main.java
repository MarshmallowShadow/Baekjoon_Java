package bj012865_normalknapsack;

/* 12865번: 평범한 배낭

이 문제는 아주 평범한 배낭에 관한 문제이다.

한 달 후면 국가의 부름을 받게 되는 준서는 여행을 가려고 한다. 세상과의 단절을 슬퍼하며 최대한 즐기기 위한 여행이기 때문에, 가지고 다닐 배낭 또한 최대한 가치 있게 싸려고 한다.

준서가 여행에 필요하다고 생각하는 N개의 물건이 있다. 각 물건은 무게 W와 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다.
아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다.
준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.

입력: 첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
	두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
	입력으로 주어지는 모든 수는 정수이다.
	
출력: 한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.


*/

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(input1.nextToken()); //number of items
		int K = Integer.parseInt(input1.nextToken()); //maximum capacity
		
		int[][] inventory = new int[N+1][2];
		
		int[][] dpTable = new int[N+1][K+1];
		
		for(int i=1; i<=N; i++) {
			StringTokenizer input2 = new StringTokenizer(br.readLine());
			inventory[i][0] = Integer.parseInt(input2.nextToken()); //weight
			inventory[i][1] = Integer.parseInt(input2.nextToken()); //value
		}
		
		for(int i=1; i<=N; i++) { //loop through all items
			for(int j=1; j<=K; j++) { //loop through all possible capacity
				int prevVal = dpTable[i-1][j]; //Value of previous item
				int currVal = 0;
				if(inventory[i][0] <= j) {
					currVal = inventory[i][1] + dpTable[i-1][j-inventory[i][0]]; //weight of current item + max weight of the remaining capacity after subtracting weight of that item
				}
				
				dpTable[i][j] = Math.max(prevVal, currVal);
			}
		}
		
		System.out.println(dpTable[N][K]);
	}
}
