package bj002884_alarmclock;
import java.util.*;

public class Main2 {
    public static void print(int a, int b) {
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        B -= 45;
        if(B < 0) {
            A -= 1;
            B += 60;
            if(A < 0) {
                A += 24;
                print(A, B);
            }
            else print(A, B);
        }
        else print(A, B);
        
        sc.close();
    }
}