package bj018870_coordinatecompress;
import java.io.*;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[][] num = new int[N][3];
		
		for(int i=0; i<N; i++) {
			num[i][0] = Integer.parseInt(s[i]);
			num[i][1] = i;
			num[i][2] = 0;
		}
		
		mergeSort(num, 0, 0, num.length-1);
		
		int counter = 0;
		
		for(int i=0; i<N; i++) {
			if(i == 0) {
				continue;
			} else if(num[i][0] == num[i-1][0]) {
				num[i][2] = counter;
			} else {
				counter++;
				num[i][2] = counter;
			}
		}
		
		mergeSort(num, 1, 0, num.length-1);
		
		for(int i=0; i<N; i++) {
			bw.write(num[i][2] + " ");
		}
		
		bw.flush();
	}
	
    public static void merge(int[][] num, int c, int l, int m, int r) {
    	int left = m - l + 1;
    	int right = r - m;
    	
    	int i;
    	int j;
    	
    	int[][] L = new int[left][3];
    	int[][] R = new int[right][3];
    	
    	
    	for(i=0; i<left; i++) {
    		L[i][0] = num[l + i][0];
    		L[i][1] = num[l + i][1];
    		L[i][2] = num[l + i][2];
    	}
    	for(j=0; j<right; j++) {
    		R[j][0] = num[m + 1 + j][0];
    		R[j][1] = num[m + 1 + j][1];
    		R[j][2] = num[m + 1 + j][2];
    	}
    	
    	i = 0;
    	j = 0;
    	
    	int k = l;
    	
    	while(i < left && j < right) {
    		if(L[i][c] <= R[j][c]) {
    			num[k][0] = L[i][0];
    			num[k][1] = L[i][1];
    			num[k][2] = L[i][2];
    			i++;
    		} else {
    			num[k][0] = R[j][0];
    			num[k][1] = R[j][1];
    			num[k][2] = R[j][2];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<left) {
    		num[k][0] = L[i][0];
			num[k][1] = L[i][1];
			num[k][2] = L[i][2];
    		i++;
    		k++;
    	}
    	while(j<right) {
    		num[k][0] = R[j][0];
			num[k][1] = R[j][1];
			num[k][2] = R[j][2];
    		j++;
    		k++;
    	}
    }
    
    public static void mergeSort(int[][] num, int c, int l, int r) {
    	if(l < r) {
    		int m = l + (r-l)/2;
    		
    		mergeSort(num, c, l, m);
    		mergeSort(num, c, m+1, r);
    		
    		merge(num, c, l, m, r);
    	}
    }
}
