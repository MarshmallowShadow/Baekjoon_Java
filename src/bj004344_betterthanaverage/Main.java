package bj004344_betterthanaverage;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
	private static final DecimalFormat df = new DecimalFormat("0.000");
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i;
		int j;
		double sum;
		double avg;
		int count;
		double percent;
		
		int C = Integer.parseInt(br.readLine());
		String S[];
		double A[];
		
		for(i=0; i<C; i++) {
			sum = 0;
			
			S = br.readLine().split(" ");
			A = new double[S.length];
			
			for(j=0; j<S.length; j++) {
				A[j] = Double.parseDouble(S[j]);
				if(j != 0) sum += A[j];
			}
			
			avg = sum / A[0];
			
			count = 0;
			
			for(j=1; j<S.length; j++) {
				if(A[j] > avg) count++;
			}
			
			percent = (count / A[0]) * 100.0;
			
			bw.write(df.format(percent) + "%\n");
		}
		
		bw.flush();
	}
}
