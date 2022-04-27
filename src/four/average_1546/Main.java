package four.average_1546;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double high = 0;
    	int i;
    	double sum = 0;
    	
    	int N = sc.nextInt();
    	double A[] = new double[N];
    	
    	for(i=0; i<N; i++) {
    		A[i] = sc.nextDouble();
    		if(A[i] > high) high = A[i];
    		sum += A[i];
    	}
    	
    	System.out.println((sum/N) * (100/high));
    	
    	sc.close();
    }
}
