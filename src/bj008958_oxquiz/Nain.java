package bj008958_oxquiz;
import java.util.*;

public class Nain {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int count;
    	String A;
    	
    	for(int i=0; i<N; i++) {
    		count = 0;
    		A = sc.next();
    		for(int j=0; j<A.length(); j++) {
    			if (A.charAt(j) == 'O') count++;
    		}
    		System.out.println(count);
    	}
    	
    	sc.close();
    }
}