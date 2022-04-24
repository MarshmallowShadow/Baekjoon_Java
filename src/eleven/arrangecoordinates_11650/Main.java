package eleven.arrangecoordinates_11650;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] point = new int[N][2];
		
		for(int i=0; i<N; i++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}
		
		mergeSort(point, 0, 0, point.length-1);
		
		int start = 0;
		int end = 0;
		for(int i=0; i<N; i++) {
			if(i==0) {
				start = i;
				end = i;
			} else if(point[i][0] != point[i-1][0]) {
				if(start != end) {
					mergeSort(point, 1, start, end);
				}
				start = i;
				end = i;
			} else {
				end++;
			}
		}
		if(start != end) {
			mergeSort(point, 1, start, end);
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(point[i][0] + " " + point[i][1]);
		}
		sc.close();
	}
	
	public static void merge(int[][] num, int c, int l, int m, int r) {
    	int left = m - l + 1;
    	int right = r - m;
    	
    	int i;
    	int j;
    	
    	int[][] L = new int[left][2];
    	int[][] R = new int[right][2];
    	
    	
    	for(i=0; i<left; i++) {
    		L[i][0] = num[l + i][0];
    		L[i][1] = num[l + i][1];
    	}
    	for(j=0; j<right; j++) {
    		R[j][0] = num[m + 1 + j][0];
    		R[j][1] = num[m + 1 + j][1];
    	}
    	
    	i = 0;
    	j = 0;
    	
    	int k = l;
    	
    	while(i < left && j < right) {
    		if(L[i][c] <= R[j][c]) {
    			num[k][0] = L[i][0];
    			num[k][1] = L[i][1];
    			i++;
    		} else {
    			num[k][0] = R[j][0];
    			num[k][1] = R[j][1];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<left) {
    		num[k][0] = L[i][0];
    		num[k][1] = L[i][1];
    		i++;
    		k++;
    	}
    	while(j<right) {
    		num[k][0] = R[j][0];
			num[k][1] = R[j][1];
    		j++;
    		k++;
    	}
    }
    
    public static void mergeSort(int[][] num, int c, int l, int r) {
    	int m;
    	if(l < r) {
    		m = l + (r-l)/2;
    		
    		mergeSort(num, c, l, m);
    		mergeSort(num, c, m+1, r);
    		
    		merge(num, c, l, m, r);
    	}
    }
}
