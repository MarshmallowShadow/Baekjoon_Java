package nine.recursivestars_2447;
import java.io.*;

public class Main {
	static String[][] pattern;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		pattern = new String[N][N];
		
		stars(N, 0, 0, "*", " ");
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				bw.write(pattern[i][j]);
			}
			bw.write("\n");
		}
		
		bw.flush();
	}
	
	public static void stars(int N, int x, int y, String s, String space){
		int i;
		int j;
		
		if(N == 3) {
			for(i=y; i<y+3; i++) {
				for(j=x; j<x+3; j++) {
					if(i-y==1 && j-x==1) pattern[i][j] = space;
					else pattern[i][j] = s;
				}
			}
			return;
		} else {
			for(i=y; i<y+N; i+=N/3) {
				for(j=x; j<x+N; j+=N/3) {
					if(i-y==N/3 && j-x==N/3) stars(N/3, j, i, space, space);
					else stars(N/3, j, i, s, space);
				}
			}
		}
	}
}
