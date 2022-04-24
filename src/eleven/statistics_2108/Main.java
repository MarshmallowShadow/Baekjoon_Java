package eleven.statistics_2108;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		
		int num;
		double sum = 0;
		int maxCount = 0;
		int count = 0;
		boolean isSecond = false;
		
		Integer mean;
		Integer median;
		Integer mode;
		Integer range;
		
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(br.readLine());
			numArr[i] = num;
			sum += numArr[i];
		}
		
		mergeSort(numArr, 0, numArr.length-1);
		
		mean = (int)Math.round(sum / N);
		median = numArr[N/2];
		mode = numArr[0];
		range = numArr[N-1] - numArr[0];
		
		for(int i=0; i<numArr.length; i++) {
			if(i == 0) {
				count++;
			} else if(numArr[i] == numArr[i-1]) {
				count ++;
			} else {
				count = 1;
			}
			
			if(count > maxCount) {
				mode = numArr[i];
				maxCount = count;
				isSecond = false;
			} else if(count == maxCount && isSecond == false) {
				mode = numArr[i];
				maxCount = count;
				isSecond = true;
			}
		}
		
		bw.write(mean.toString() + "\n" + median.toString() 
				+ "\n" + mode.toString() + "\n" + range.toString());
		
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
    	int m;
    	if(l < r) {
    		m = l + (r-l)/2;
    		
    		mergeSort(num, l, m);
    		mergeSort(num, m+1, r);
    		
    		merge(num, l, m, r);
    	}
    }
}
