package bj002884_alarmclock;
import java.util.*;

public class Main4 {
    public static void print(int a, int b) {
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H;
        int M;
        
        while(true) {
            H = sc.nextInt();
            M = sc.nextInt();
            
        	if(H >= 0 && H < 24 && M >= 0 && M < 60) {
                M -= 45;
                if(M < 0) {
                    H -= 1;
                    M += 60;
                    if(H < 0) {
                        H += 24;
                        print(H, M);
                        break;
                    }
                    else {
                        print(H, M);
                        break;
                    }
                }
                else {
                    print(H, M);
                    break;
                }
            }
            else continue;
        }
        
        sc.close();
    }
}
