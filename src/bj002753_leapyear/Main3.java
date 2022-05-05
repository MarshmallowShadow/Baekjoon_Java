package bj002753_leapyear;
import java.util.*;

public class Main3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        
        while(true) {
            A = sc.nextInt();
            if(A >= 1 && A <= 4000) {
                if((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0)) {
                    System.out.println("1");
                    break;
                }
                else {
                    System.out.println("0");
                    break;
                }
            }
            else continue;
        }
        
        sc.close();
    }
}
