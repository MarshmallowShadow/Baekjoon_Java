package bj002884_alarmclock;
import java.util.*;

public class Main {
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
        }
        if(A < 0) A += 24;
        System.out.println(A + " " + B);
        
        sc.close();
    }
}
