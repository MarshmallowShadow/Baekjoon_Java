package bj002438_drawingstars;
import java.util.*;

public class Nain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++) System.out.print("*");
            System.out.println("");
        }
    }
}