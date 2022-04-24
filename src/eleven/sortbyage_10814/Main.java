package eleven.sortbyage_10814;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] person = new String[N][2];
		
		for(int i=0; i<N; i++) {
			person[i][0] = sc.next();
			person[i][1] = sc.next();
		}
		
		mergeSortAge(person, 0, person.length-1);
		
		for(int i=0; i<N; i++) {
			System.out.println(person[i][0] + " " + person[i][1]);
		}
		sc.close();
	}

	public static void mergeAge(String[][] person, int l, int m, int r) {
    	int left = m - l + 1;
    	int right = r - m;
    	
    	int i;
    	int j;
    	
    	String[][] L = new String[left][2];
    	String[][] R = new String[right][2];
    	
    	
    	for(i=0; i<left; i++) {
    		L[i][0] = person[l + i][0];
    		L[i][1] = person[l + i][1];
    	}
    	for(j=0; j<right; j++) {
    		R[j][0] = person[m + 1 + j][0];
    		R[j][1] = person[m + 1 + j][1];
    	}
    	
    	i = 0;
    	j = 0;
    	
    	int k = l;
    	
    	while(i < left && j < right) {
    		if(Integer.parseInt(L[i][0]) <= Integer.parseInt(R[j][0])) {
    			person[k][0] = L[i][0];
    			person[k][1] = L[i][1];
    			i++;
    		} else {
    			person[k][0] = R[j][0];
    			person[k][1] = R[j][1];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<left) {
    		person[k][0] = L[i][0];
    		person[k][1] = L[i][1];
    		i++;
    		k++;
    	}
    	while(j<right) {
    		person[k][0] = R[j][0];
			person[k][1] = R[j][1];
    		j++;
    		k++;
    	}
    }
    
    public static void mergeSortAge(String[][] person, int l, int r) {
    	int m;
    	if(l < r) {
    		m = l + (r-l)/2;
    		
    		mergeSortAge(person, l, m);
    		mergeSortAge(person, m+1, r);
    		
    		mergeAge(person, l, m, r);
    	}
    }

}
