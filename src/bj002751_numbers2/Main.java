package bj002751_numbers2;
import java.io.*;
import java.util.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		TreeSet<Integer> arrange = new TreeSet<>();
		int T = Integer.parseInt(br.readLine());
		int num;
		
		for(int i=0; i<T; i++) {
			num = Integer.parseInt(br.readLine());
			arrange.add(num);
		}
		
		Iterator<Integer> it = arrange.iterator();
		while(it.hasNext()) {
			bw.write(it.next().toString() + "\n");
		}
		
		bw.flush();
	}
}
