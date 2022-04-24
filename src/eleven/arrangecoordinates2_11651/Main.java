package eleven.arrangecoordinates2_11651;
import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		
		for(int i=0; i<N; i++) {
			words[i] = br.readLine();
		}
		
		mergeSortLength(words, 0, words.length-1);
		
		int start = 0;
		int end = 0;
		for(int i=0; i<N; i++) {
			if(i==0) {
				start = i;
				end = i;
			} else if(words[i].length() != words[i-1].length()) {
				if(start != end) {
					mergeSort(words, start, end);
				}
				start = i;
				end = i;
			} else {
				end++;
			}
		}
		if(start != end) {
			mergeSort(words, start, end);
		}
		
		for(int i=0; i<N; i++) {
			if(i == 0) {
				System.out.println(words[i]);
			} else if(words[i].equals(words[i-1])) {
				continue;
			} else {
				System.out.println(words[i]);
			}
		}
	}
	
	public static void mergeLength(String[] num, int l, int m, int r) {
    	int left = m - l + 1;
    	int right = r - m;
    	
    	int i;
    	int j;
    	
    	String[] L = new String[left];
    	String[] R = new String[right];
    	
    	
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
    		if(L[i].length() <= R[j].length()) {
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
    
    public static void mergeSortLength(String[] num, int l, int r) {
    	int m;
    	if(l < r) {
    		m = l + (r-l)/2;
    		
    		mergeSortLength(num, l, m);
    		mergeSortLength(num, m+1, r);
    		
    		mergeLength(num, l, m, r);
    	}
    }
    
    public static void merge(String[] num, int l, int m, int r) {
    	int left = m - l + 1;
    	int right = r - m;
    	
    	int i;
    	int j;
    	
    	String[] L = new String[left];
    	String[] R = new String[right];
    	
    	
    	for(i=0; i<left; i++) {
    		L[i] = num[l + i];
    	}
    	for(j=0; j<right; j++) {
    		R[j] = num[m + 1 + j];
    	}
    	
    	i = 0;
    	j = 0;
    	int charIndex;
    	
    	int k = l;
    	
    	while(i < left && j < right) {
    		charIndex = 0;
    		if(L[i].equals(R[j])) {
    			num[k] = L[i];
    			i++;
    			k++;
    		} else {
    			while(charIndex<L[i].length() && charIndex<R[j].length()) {
        			if(L[i].charAt(charIndex) < R[j].charAt(charIndex)) {
            			num[k] = L[i];
            			i++;
            			k++;
            			break;
            		} else if(L[i].charAt(charIndex) > R[j].charAt(charIndex)) {
            			num[k] = R[j];
            			j++;
            			k++;
            			break;
            		} else {
            			charIndex++;
            			continue;
            		}
        		}
    		}
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
    
    public static void mergeSort(String[] num, int l, int r) {
    	int m;
    	if(l < r) {
    		m = l + (r-l)/2;
    		
    		mergeSort(num, l, m);
    		mergeSort(num, m+1, r);
    		
    		merge(num, l, m, r);
    	}
    }
}
