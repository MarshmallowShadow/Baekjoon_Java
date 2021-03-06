package bj010815_numbercard;

/* 10815번: 숫자 카드 (https://www.acmicpc.net/problem/10815)
	
	숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
	정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
	
	입력: 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
		숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.

		셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며,
		이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
	
	춯혁: 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.

*/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] s1 = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		String[] s2 = br.readLine().split(" ");
		
		int[] sg = new int[N];
		
		//convert to int
		for(int i=0; i<N; i++) {
			sg[i] = Integer.parseInt(s1[i]);
		}
		//sort array of 상근
		sort(sg, 0, sg.length - 1);
		
		//loop to start search for each index in s2
		for(int i=0; i<M; i++) {
			//convert string in s1[i] to int
			int c = Integer.parseInt(s2[i]);
			
			//check if it exists
			if(search(c, sg)) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			
			//write a space EXCEPT when i is the last index
			if(i != M-1) {
				bw.write(" ");
			}
		}
		
		//print output to console
		bw.flush();
	}
	
	//binary search
	public static boolean search(int n, int[] sg) {
		int i=sg.length/2;
		int l=-1;
		int r=sg.length;
		
		while(i>l && i<r) {
			if(n == sg[i]) {
				return true;
			} else if(n < sg[i]) {
				r = i;
				i -= (r - l) / 2;
			} else {
				l = i;
				i += (r - l) / 2;
			}
		}
		
		return false;
	}
	
	//merge sort
	public static void sort(int[] sg, int l, int r) {
		if(l < r) {
			int m = l + (r-l) / 2;
			
			//right
			sort(sg, m+1, r);
			//left
			sort(sg, l, m);
			
			//merge
			merge(sg, m, l ,r);
		}
	}
	
	public static void merge(int[] sg, int m, int l, int r) {
		int left = m - l + 1;
		int right = r - m;
		
		int[] L = new int[left];
		int[] R = new int[right];
		
		//temporary storage
		for(int i=0; i<left; i++) {
			L[i] = sg[l+i];
		}
		for(int j=0; j<right; j++) {
			R[j] = sg[m+1+j];
		}
		
		int i=0;
		int j=0;
		int k = l;
		
		//comparing values at each index
		while(i<left && j<right) {
			if(L[i] <= R[j]) {
				sg[k] = L[i];
				i++;
			} else {
				sg[k] = R[j];
				j++;
			}
			k++;
		}
		//insert leftovers
		while(i<left) {
			sg[k] = L[i];
			i++;
			k++;
		}
		while(j<right) {
			sg[k] = R[j];
			j++;
			k++;
		}
	}
}
