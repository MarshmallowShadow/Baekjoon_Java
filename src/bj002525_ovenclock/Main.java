package bj002525_ovenclock;
import java.util.*;

public class Main {
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
        
        if(A >= 24) A -= 24;
        
        System.out.println(A + " " + B);
        
        sc.close();
    }    
}
