package three.addingcycle_1110;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int N = sc.nextInt();
        int N2 = N;
        int ones;
        int tens;
        
        do{
            tens = N / 10;
            ones = N % 10;
            N = (ones * 10) + ((ones + tens) % 10);
            c++;
        }while(N != N2);
        
        System.out.println(c);
        
        sc.close();
    }
}