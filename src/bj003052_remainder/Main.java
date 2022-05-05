package bj003052_remainder;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int i;
    	int A[] = new int[10];
    	TreeSet<Integer> ts = new TreeSet<>();
    	
    	for(i=0; i<10; i++) {
    		A[i] = sc.nextInt();
    		ts.add(A[i] % 42);
    	}
    	
    	System.out.println(ts.size());
        
        sc.close();
    }
}