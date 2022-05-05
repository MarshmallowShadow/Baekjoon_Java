package bj010951_addition4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        
        while(true) {
        	try {
                A = sc.nextInt();
                B = sc.nextInt();
                System.out.println(A+B);
            } catch(Exception e){
            	break;
            }
        }
        
        sc.close();
    }
}