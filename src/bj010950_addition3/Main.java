package bj010950_addition3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A;
        int B;
        
        for(int i=0; i<T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A + B);
        }
        
        sc.close();
    }
}