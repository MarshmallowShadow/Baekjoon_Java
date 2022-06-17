package agroup.bj010709_weathercaster;

/* 10709번: 기상캐스터 (https://www.acmicpc.net/problem/10709)


JOI시는 남북방향이 H 킬로미터, 동서방향이 W 킬로미터인 직사각형 모양이다. JOI시는 가로와 세로의 길이가 1킬로미터인 H × W 개의 작은 구역들로 나뉘어 있다.
북쪽으로부터 i 번째, 서쪽으로부터 j 번째에 있는 구역을 (i, j) 로 표시한다.

각 구역의 하늘에는 구름이 있을 수도, 없을 수도 있다. 모든 구름은 1분이 지날 때마다 1킬로미터씩 동쪽으로 이동한다.
오늘은 날씨가 정말 좋기 때문에 JOI시의 외부에서 구름이 이동해 오는 경우는 없다.

지금 각 구역의 하늘에 구름이 있는지 없는지를 알고 있다. 기상청에서 일하고 있는 여러분은 각 구역에 대해서 지금부터 몇 분뒤 처음으로 하늘에 구름이 오는지를 예측하는 일을 맡았다.

각 구역에 대해서 지금부터 몇 분뒤 처음으로 하늘에 구름이 오는지를 구하여라.


입력: 입력은 1 + H 행으로 주어진다.

	첫 번째 행에는 정수 H, W (1 ≦ H ≦ 100, 1 ≦ W ≦ 100) 가 공백을 사이에 주고 주어진다. 이것은 JOI시가 H × W 개의 작은 구역으로 나뉘어 있다는 것을 의미한다.

	이어진 H 개의 행의 i번째 행 (1 ≦ i ≦ H) 에는 W문자의 문자열이 주어진다. W 개의 문자 중 j번째 문자 (1 ≦ j ≦ W) 는, 구역 (i, j) 에 지금 구름이 떠 있는지 아닌지를
	나타낸다. 구름이 있는 경우에는 영어 소문자 'c' 가, 구름이 없는 경우에는 문자 '.' 가 주어진다.

출력: 출력은 H 행으로, 각 행에는 공백으로 구분된 W 개의 정수를 출력한다. 출력의 i 번째 행 j 번째 정수 (1 ≦ i ≦ H, 1 ≦ j ≦ W) 는,
	지금부터 몇 분후에 처음으로 구역 (i, j) 에 구름이 뜨는지를 표시한다. 단, 처음부터 구역 (i, j) 에 구름이 떠 있었던 경우에는 0을,
	몇 분이 지나도 구름이 뜨지 않을 경우에는 -1을 출력한다.

*/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int H = Integer.parseInt(s[0]);
		int W = Integer.parseInt(s[1]);
		String[] cloud = new String[H];
		
		for(int i=0; i<H; i++) {
			cloud[i] = br.readLine();
		}
		
		for(int i=0; i<H; i++) {
			int count = -1;
			for(int j=0; j<W; j++) {
				if(cloud[i].charAt(j) == 'c') {
					count = 0;
				} else if(cloud[i].charAt(j) == '.' && count > -1) {
					count++;
				}
				
				bw.write(Integer.toString(count));
				
				if(j != W-1) {
					bw.write(" ");
				}
			}
			
			bw.newLine();
		}
		
		bw.flush();
	}
}
