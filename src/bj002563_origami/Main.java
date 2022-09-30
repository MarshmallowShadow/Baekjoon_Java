package bj002563_origami;

/* 2563번: 색종이
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 
정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 
또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

입력: 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 
	색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 
	두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 
	색종이가 도화지 밖으로 나가는 경우는 없다

출력: 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] O = new int[100][100];
		Integer area = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String[] p = br.readLine().split(" ");
			int x = Integer.parseInt(p[0]);
			int y = Integer.parseInt(p[1]);
			
			for(int j=y; j<y+10; j++) {
				for(int k=x; k<x+10; k++) {
					O[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				area += O[j][i];
			}
		}
		
		bw.write(area.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
