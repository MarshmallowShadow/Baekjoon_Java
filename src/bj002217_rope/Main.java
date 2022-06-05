package bj002217_rope;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] r = new int[N];
		
		for(int i=0; i<N; i++) {
			r[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(r, 0, r.length - 1);
		
		int P = 0;
		
		for(int i=0; i<N; i++) {
			if(i > 0) {
				if(r[i] == r[i-1]) {
					continue;
				}
			}
			
			int lo = i;
			
			int Pr = r[i] * (N-lo);
			
			if(Pr > P) {
				P = Pr;
			}
		}
		
		bw.write(Integer.toString(P));
		bw.flush();
	}
	
	public static void merge(int[] num, int l, int m, int r) {
    	int left = m - l + 1;
    	int right = r - m;
    	
    	int i;
    	int j;
    	
    	int[] L = new int[left];
    	int[] R = new int[right];
    	
    	
    	for(i=0; i<left; i++) {
    		L[i] = num[l + i];
    	}
    	for(j=0; j<right; j++) {
    		R[j] = num[m + 1 + j];
    	}
    	
    	i = 0;
    	j = 0;
    	
    	int k = l;
    	
    	while(i < left && j < right) {
    		if(L[i] <= R[j]) {
    			num[k] = L[i];
    			i++;
    		} else {
    			num[k] = R[j];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<left) {
    		num[k] = L[i];
    		i++;
    		k++;
    	}
    	while(j<right) {
    		num[k] = R[j];
    		j++;
    		k++;
    	}
    }
    
    public static void mergeSort(int[] num, int l, int r) {
    	if(l < r) {
    		int m = l + (r-l)/2;
    		
    		mergeSort(num, l, m);
    		mergeSort(num, m+1, r);
    		
    		merge(num, l, m, r);
    	}
    }
}
