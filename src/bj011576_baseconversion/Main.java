package bj011576_baseconversion;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s1 = br.readLine().split(" ");
		int s2 = Integer.parseInt(br.readLine());
		String[] s3 = br.readLine().split(" ");
		
		int[] digit = new int[s2];
		
		int a = Integer.parseInt(s1[0]);
		int b = Integer.parseInt(s1[1]);
		
		for(int i=0; i<s3.length; i++) {
			digit[i] = Integer.parseInt(s3[i]);
		}
		
		int total = 0;
		
		for(int i=0; i<digit.length; i++) {
			total += (int)(digit[i] * Math.pow(a, s2-1-i));
		}
		
		ArrayList<Integer> n = new ArrayList<>();
		
		while(total >= 1) {
			n.add(0, total%b);
			total /= b;
		}
		
		for(int i=0; i<n.size(); i++) {
			bw.write(Integer.toString(n.get(i)));
			
			if(i != n.size() - 1) {
				bw.write(" ");
			}
		}
		
		bw.flush();
	}
}