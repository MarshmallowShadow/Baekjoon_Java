package thirteen.inspection_2981;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int minVal = 1000000000;
		int maxVal = 0;
		int range;
		boolean isFactor = true;
		
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(num[i] > maxVal) {
				maxVal = num[i];
			}
			if(num[i] < minVal) {
				minVal = num[i];
			}
		}
		
		range = maxVal - minVal;
		ArrayList<Integer> factors = new ArrayList<>();
		
		for(int i = 2; i<=(range/2); i++) {
			if(range%i == 0) {
				factors.add(i);
			}
		}
		factors.add(range);
		
		int remainder;
		for(int j=0; j<factors.size(); j++) {
			isFactor = true;
			remainder = num[0]%factors.get(j);
			for(int i=1; i<N; i++) {
				if(num[i]%factors.get(j) != remainder) {
					isFactor = false;
					break;
				}
			}
			if(isFactor) {
				bw.write(factors.get(j).toString() + " ");
			}
		}
		
		bw.flush();
	}
}
