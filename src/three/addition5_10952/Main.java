package three.addition5_10952;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        
        while(true){
            A = sc.nextInt();
            B = sc.nextInt();
            if((A+B) == 0) break;
            else System.out.println(A+B);
        }
        
        sc.close();
    }
}
