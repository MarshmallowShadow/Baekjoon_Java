package agroup.bj002110_routerinstall;

/* 2110번: 공유기 설치 (https://www.acmicpc.net/problem/2110)


도현이의 집 N개가 수직선 위에 있다. 각각의 집의 좌표는 x1, ..., xN이고, 집 여러개가 같은 좌표를 가지는 일은 없다.

도현이는 언제 어디서나 와이파이를 즐기기 위해서 집에 공유기 C개를 설치하려고 한다. 최대한 많은 곳에서 와이파이를 사용하려고 하기 때문에, 
한 집에는 공유기를 하나만 설치할 수 있고, 가장 인접한 두 공유기 사이의 거리를 가능한 크게 하여 설치하려고 한다.

C개의 공유기를 N개의 집에 적당히 설치해서, 가장 인접한 두 공유기 사이의 거리를 최대로 하는 프로그램을 작성하시오.


입력: 첫째 줄에 집의 개수 N (2 ≤ N ≤ 200,000)과 공유기의 개수 C (2 ≤ C ≤ N)이 하나 이상의 빈 칸을 사이에 두고 주어진다.
	둘째 줄부터 N개의 줄에는 집의 좌표를 나타내는 xi (0 ≤ xi ≤ 1,000,000,000)가 한 줄에 하나씩 주어진다.

출력: 첫째 줄에 가장 인접한 두 공유기 사이의 최대 거리를 출력한다.

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int C = Integer.parseInt(s[1]);
		
		int[] house = new int[N];
		
		for(int i=0; i<N; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(house);
		
		//매개변수 탐색: 조건용 이분 탐색??
		int min = 0;
		int max = house[N-1] - house[0] + 1;
		int result = 0;
		
		
		while(max-1 > min) {
			int mid = (max + min) / 2;
			int startLoc = house[0]; //시작 위치
			int routers = 1; //라우터를 첫번째 자리에 설치
			
			//조건 맞게 라우터를 설치하는 시뮬레이션
			for(int i=1; i<N; i++) {
				//라우터의 거리가 mid보다 크거나 같으면 설치한다
				if(house[i] - startLoc >= mid) {
					routers++; //라우터 설치
					startLoc = house[i]; //라우터 거리 위치 현위치로 설정
				}
			}
			
			//설치한 라우터 갯수대로 비교해서 max/min값 조절
			if(routers >= C) {
				min = mid;
				if(result < mid) {
					result = mid;
				}
			} else {
				max = mid;
				if(result >= max) {
					break;
				}
			}
		}
		
		
		bw.write(Integer.toString(result));
		bw.flush();
	}
}
