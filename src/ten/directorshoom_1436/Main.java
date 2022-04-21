package ten.directorshoom_1436;

import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int seriesNum = Integer.parseInt(br.readLine());
		Integer count = 1;
		Integer num = 666;
		
		while(seriesNum > count) {
			num++;
			
			for(int i=num; i>=666; i/=10) {
				if(i%1000 == 666) {
					count++;
					break;
				}
			}
		}
		
		
		bw.write(num.toString());
		bw.flush();
		
	}
}
