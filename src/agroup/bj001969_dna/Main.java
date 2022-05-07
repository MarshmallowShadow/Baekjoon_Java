package agroup.bj001969_dna;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		String[] dna = new String[N];
		
		TreeMap<Character, Integer> neuc = new TreeMap<>();
		
		String newdna = "";
		int hamming = 0;
		
		for(int i=0; i<N; i++) {
			dna[i] = br.readLine();
		}
		
		for(int j=0; j<M; j++) {
			neuc.put('A', 0);
			neuc.put('C', 0);
			neuc.put('G', 0);
			neuc.put('T', 0);
			
			for(int i=0; i<N; i++) {
				neuc.put(dna[i].charAt(j), neuc.get(dna[i].charAt(j)) + 1);
			}
			
			char highest = 'A';
			
			for(char key: neuc.keySet()) {
				if(key == 'A') continue;
				else {
					if(neuc.get(key) > neuc.get(highest)) highest = key;
				}
			}
			
			newdna += highest;
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++) {
				if(dna[i].charAt(j) != newdna.charAt(j)) hamming++;
			}
		}
		
		bw.write(newdna + "\n" + Integer.toString(hamming));
		bw.flush();
	}
}
