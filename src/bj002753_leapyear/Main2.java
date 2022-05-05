package bj002753_leapyear;
import java.util.*;

public class Main2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        
        A = sc.nextInt();
        
        if((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
        
        sc.close();
    }
}