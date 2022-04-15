package four.numberofnumbers_2577;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int i;
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	
    	Integer D = A * B * C;
    	int digits = D.toString().length();
    	int[] E = new int[10];
    	
    	for(i=0; i<digits; i++) {
    		E[D % 10]++;
    		D /= 10;
    	}
    	
    	
    	for(i = 0; i<10; i++) System.out.println(E[i]);
        
        sc.close();
    }
}
