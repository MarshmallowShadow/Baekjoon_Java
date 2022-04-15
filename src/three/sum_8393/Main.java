package three.sum_8393;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = 0;
        
        for(int i=1; i<=A; i++) B += i;
        
        System.out.println(B);
        
        sc.close();
    }
}
