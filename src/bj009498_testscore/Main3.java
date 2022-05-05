package bj009498_testscore;
import java.util.*;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score;
        
        while(true){
            score = sc.nextInt();
            if(score >= 90 && score <= 100) {
                System.out.println("A");
                break;
            }
            if(score >= 80 && score <= 89) {
                System.out.println("B");
                break;
            }
            if(score >= 70 && score <= 79) {
                System.out.println("C");
                break;
            }
            if(score >= 60 && score <= 69) {
                System.out.println("D");
                break;
            }
            if(score >= 0 && score <= 59) {
                System.out.println("F");
                break;
            }
            else continue;
        }
        sc.close();
    }
}
