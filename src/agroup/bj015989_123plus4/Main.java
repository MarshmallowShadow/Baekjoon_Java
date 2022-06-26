package agroup.bj015989_123plus4;

/* 15989번: 1, 2, 3 더하기 4

정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 4가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다. 합을 이루고 있는 수의 순서만 다른 것은 같은 것으로 친다.

    1+1+1+1
    2+1+1 (1+1+2, 1+2+1)
    2+2
    1+3 (3+1)

정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.


입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 10,000보다 작거나 같다.

출력: 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			int count = 0;
			
			for(int j=0; j<=n/3; j++) {
				count += ((n - j*3) / 2) + 1;
			}
			
			System.out.println(count);
		}
		
		sc.close();
	}
}
