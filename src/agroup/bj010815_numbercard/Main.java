package agroup.bj010815_numbercard;

/* 10815��: ���� ī�� (https://www.acmicpc.net/problem/10815)
	
	���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. ����̴� ���� ī�� N���� ������ �ִ�.
	���� M���� �־����� ��, �� ���� �����ִ� ���� ī�带 ����̰� ������ �ִ��� �ƴ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�: ù° �ٿ� ����̰� ������ �ִ� ���� ī���� ���� N(1 �� N �� 500,000)�� �־�����. ��° �ٿ��� ���� ī�忡 �����ִ� ������ �־�����.
		���� ī�忡 �����ִ� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����. �� ���� ī�忡 ���� ���� �����ִ� ���� ����.

		��° �ٿ��� M(1 �� M �� 500,000)�� �־�����. ��° �ٿ��� ����̰� ������ �ִ� ���� ī������ �ƴ����� ���ؾ� �� M���� ������ �־�����,
		�� ���� �������� ���еǾ��� �ִ�. �� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����
	
	����: ù° �ٿ� �Է����� �־��� M���� ���� ���ؼ�, �� ���� ���� ���� ī�带 ����̰� ������ ������ 1��, �ƴϸ� 0�� �������� ������ ����Ѵ�.

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
		//sort array of ���
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
			
			sort(sg, m+1, r);
			sort(sg, l, m);
			
			merge(sg, m, l ,r);
		}
	}
	
	public static void merge(int[] sg, int m, int l, int r) {
		int left = m - l + 1;
		int right = r - m;
		
		int[] L = new int[left];
		int[] R = new int[right];
		
		for(int i=0; i<left; i++) {
			L[i] = sg[l+i];
		}
		for(int j=0; j<right; j++) {
			R[j] = sg[m+1+j];
		}
		
		int i=0;
		int j=0;
		int k = l;
		
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
