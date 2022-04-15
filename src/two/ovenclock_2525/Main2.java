package two.ovenclock_2525;
import java.util.*;

public class Main2 {
    public static void print(int a, int b) {
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        A = A + (C / 60);
        B = B + C % 60;
        
        if(B >= 60) {
            A += 1;
            B -= 60;
        }
        if(A >= 24) {
            A -= 24;
        }
        print(A, B);
        
        sc.close();
    }    
}
