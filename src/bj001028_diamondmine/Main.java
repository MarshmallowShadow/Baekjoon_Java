package bj001028_diamondmine;

/* 1028번: 다이아몬드 광산

다이아몬드 광산은 0과 1로 이루어진 R행*C열 크기의 배열이다.

다이아몬드는 1로 이루어진 정사각형의 경계선을 45도 회전시킨 모양이다. 크기가 1, 2, 3인 다이아몬드 모양은 다음과 같이 생겼다.

size 1:    size 2:    size 3:
                         1
              1         1 1
   1         1 1       1   1
              1         1 1
                         1

다이아몬드 광산에서 가장 큰 다이아몬드의 크기를 출력하는 프로그램을 작성하시오.


입력: 첫째 줄에 R과 C가 주어진다. R과 C는 750보다 작거나 같은 자연수이다. 둘째 줄부터 R개의 줄에는 다이아몬드 광산의 모양이 주어진다.

출력: 첫째 줄에 다이아몬드 광산에서 가장 큰 다이아몬드의 크기를 출력한다. 만약 다이아몬드가 없을 때는 0을 출력한다.


*/

import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input1 = br.readLine().split(" ");
		int R = Integer.parseInt(input1[0]);
		int C = Integer.parseInt(input1[1]);
		
		int maxSize = Math.min(R, C);
		maxSize = (maxSize + 1) / 2;
		
		String[][] input2 = new String[R][C];
		int[][] mine = new int[R][C];
		for(int i=0; i<R; i++) {
			input2[i] = br.readLine().split("");
			for(int j=0; j<C; j++) {
				mine[i][j] = Integer.parseInt(input2[i][j]);
			}
		}
		
		boolean foundDiamond = false;
		
		for(; maxSize>0; maxSize--) {
			for(int i=0; i < R-(((maxSize - 1) * 2)); i++) {
				for(int j=maxSize-1; j<=C-maxSize; j++) {
					if(mine[i][j] == 1) {
						int[] pos = {i, j};
						foundDiamond = drawDiamond(maxSize, pos, mine);
					}
					if(foundDiamond) {
						System.out.println(maxSize);
						return;
					}
				}
			}
		}
		
		System.out.println(maxSize);
		return;
	}
	
	public static boolean drawDiamond(int size, int[] pos, int[][] mine) {
		boolean complete = true;
		
		int dirX = 1;
		for(int y = pos[0], x1 = pos[1], x2 = pos[1];
				y < pos [0] + (size * 2) - 1;
				x1 += (dirX * -1), x2 += dirX, y++) {
			if(mine[y][x1] != 1 || mine[y][x2] != 1) {
				complete = false;
				return complete;
			}
			if(x1 <= pos[1] - (size-1) || x2 >= pos[1] + (size-1)) {
				dirX *= -1;
			}
		}
		return complete;
	}
}