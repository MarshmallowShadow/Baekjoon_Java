package bj003003_chesspieces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] pieces = new int[6];
        
        for(int i=0; i<6; i++) {
            pieces[i] = sc.nextInt();
            
            if(i == 0 || i == 1) {
                pieces[i] = 1 - pieces[i];
            } else if(i == 5) {
                pieces[i] = 8 - pieces[i];
            } else {
                pieces[i] = 2 - pieces[i];
            }
            
            System.out.print(pieces[i] + " ");
        }
        
        sc.close();
    }
}
