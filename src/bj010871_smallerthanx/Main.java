package bj010871_smallerthanx;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int N = sc.nextInt();
        int X = sc.nextInt();
        int A;
        int[] B = new int[N];
        
        for(i=0; i<N; i++){
            A = sc.nextInt();
        	B[i] = A;
        }
        
        
        for(i=0; i<N; i++) {
            if(B[i] < X) {
            	System.out.print(B[i]);
            	System.out.print(" ");
            }
        }
        
        sc.close();
    }
}