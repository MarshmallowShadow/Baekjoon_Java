package bj015720_cowburger;

/*15720번: 카우버거 (https://www.acmicpc.net/problem/15720)

윤진이는 이번에 카우버거 알바생으로 뽑히게 되었다. 그녀는 카우버거를 평소에 이용하면서 들었던 의문점 한가지가 있었다.

    "카우버거에는 왜 세트 메뉴에 대한 할인이 존재하지 않는가?"

따라서 윤진이의 아이디어로 카우버거에 세트 할인을 도입하고자 한다. 세트 메뉴는 버거 1개, 사이드 메뉴 1개, 음료 1개를 선택 할 경우
각각의 제품에 대해서 10%의 세트 할인을 적용하는 방식으로 진행된다.

하지만 카우버거 점주는 POS기의 소프트웨어가 오래되어 세트 할인에 대한 내용을 추가할 수가 없었다.
따라서 소프트웨어학부에 재학 중인 윤진이는 전공을 살려 직접 프로그램을 만들어보려고 한다.
윤진이를 도와 POS기에 들어갈 세트 할인에 대한 프로그램을 작성해보자.

입력: 첫째 줄에는 주문한 버거의 개수 B, 사이드 메뉴의 개수 C, 음료의 개수 D가 공백을 사이에 두고 순서대로 주어진다. (1 ≤ B, C, D ≤ 1,000)
	둘째 줄에는 각 버거의 가격이 공백을 사이에 두고 주어진다.
	셋째 줄에는 각 사이드 메뉴의 가격이 공백을 사이에 두고 주어진다.
	넷째 줄에는 각 음료의 가격이 공백을 사이에 두고 주어진다.
	각 메뉴의 가격은 100의 배수이며, 10000원을 넘지 않는다.

출력: 첫째 줄에는 세트 할인이 적용되기 전 가격을 출력한다.
	둘째 줄에는 세트 할인이 적용된 후의 최소 가격을 출력한다.


*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> burger = new ArrayList<>();
		List<Integer> side = new ArrayList<>();
		List<Integer> drink = new ArrayList<>();
		
		int min = 1000;
		
		int[] n = new int[3];
		
		for(int i=0; i<3; i++) {
			n[i] = sc.nextInt();
			if(n[i] < min) {
				min = n[i];
			}
		}
		
		int sum = 0;
		
		for(int i=0; i<n[0]; i++) {
			burger.add(sc.nextInt());
			sum += burger.get(i);
		}
		Collections.sort(burger);
		for(int i=0; i<n[1]; i++) {
			side.add(sc.nextInt());
			sum += side.get(i);
		}
		Collections.sort(side);
		for(int i=0; i<n[2]; i++) {
			drink.add(sc.nextInt());
			sum += drink.get(i);
		}
		Collections.sort(drink);
		
		System.out.println(sum);
		sum = 0;
		
		for(int i=0; i<n[0]; i++) {
			if(i >= n[0] - min) {
				sum += (int)(burger.get(i) * 0.9);
			} else {
				sum += burger.get(i);
			}
			
		}
		for(int i=0; i<n[1]; i++) {
			if(i >= n[1] - min) {
				sum += (int)(side.get(i) * 0.9);
			} else {
				sum += side.get(i);
			}
		}
		for(int i=0; i<n[2]; i++) {
			if(i >= n[2] - min) {
				sum += (int)(drink.get(i) * 0.9);
			} else {
				sum += drink.get(i);
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
