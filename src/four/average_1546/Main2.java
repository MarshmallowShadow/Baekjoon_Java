package four.average_1546;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	TreeSet<Double> ts = new TreeSet<>();
    	int i;
    	double sum = 0;
    	
    	int N = sc.nextInt();
    	double A[] = new double[N];
    	
    	for(i=0; i<N; i++) {
    		A[i] = sc.nextDouble();
    		ts.add(A[i]);
    		sum += A[i];
    	}
    	
    	System.out.println((sum/N) * (100/ts.last()));
        
        sc.close();
    }
}