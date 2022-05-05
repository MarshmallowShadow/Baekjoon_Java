package bj008958_oxquiz;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int i;
    	int j;
    	int k;
    	int count;
    	String A;
    	
    	for(i=0; i<N; i++) {
    		count = 0;
    		A = sc.next();
    		for(j=0; j<A.length(); j++) {
    			if (A.charAt(j) == 'O') {
    				k = 0;
					while(A.charAt(j-k) == 'O') {
						count++;
						k++;
						if((j-k)<0) break;
					}
				}
			}
    		System.out.println(count);
		}
        
        sc.close();
	}
}
