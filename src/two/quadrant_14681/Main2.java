package two.quadrant_14681;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        
        x = sc.nextInt();
        y = sc.nextInt();

        if(x>0 && y>0) System.out.println("1");
        if(x<0 && y>0) System.out.println("2");
        if(x<0 && y<0) System.out.println("3");
        if(x>0 && y<0) System.out.println("4");
        
        sc.close();
    }
}