package two.alarmclock_2884;
import java.util.*;

public class Main3 {
    public static void print(int a, int b) {
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H;
        int M;
        
            H = sc.nextInt();
            M = sc.nextInt();
            M -= 45;
            if(M < 0) {
                H -= 1;
                M += 60;
                if(H < 0) {
                     H += 24;
                     print(H, M);
                 }
                 else {
                     print(H, M);
                 }
            }
            else {
                 print(H, M);
            }
        sc.close();
    }
}