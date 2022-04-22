package eleven.numbers3_10989;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int num;
		num = Integer.parseInt(br.readLine());
		
		int[] n = new int[num];
		
		for(int i=0; i<num; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		int counter[] = countingSort(n);
		
		for(Integer i=0; i<counter.length; i++) {
			for(int j=0; j<counter[i]; j++) {
				bw.write(i.toString() + "\n");
			}
		}
		
		bw.flush();
	}
	
	static int[] countingSort(int[] n) {
		int[] counter = new int[10001];
		for(int i=0; i<10001; i++) {
			counter[i] = 0;
		}
		
		for(int i=0; i<n.length; i++) {
			counter[n[i]]++;
		}
		
		return counter;
	}
}
