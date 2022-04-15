package four.maxvalue_2562;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = 9;
    	int i;
    	int[] A = new int[a];
    	int[] B = new int[2];
    	
    	for(i=0; i<9; i++) {
    		A[i] = sc.nextInt();
    		if(A[i] > B[0]) {
    			B[0] = A[i];
    			B[1] = i+1;
    		}
    	}
    	
    	System.out.println(B[0]);
    	System.out.println(B[1]);
        
        sc.close();
    }
}
