package two.quadrant_14681;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        
        while(true) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x>0 && y>0) {
                System.out.println("1");
                break;
            }
            
            if(x<0 && y>0) {
                System.out.println("2");
                break;
            }
            
            if(x<0 && y<0) {
                System.out.println("3");
                break;
            }
            
            if(x>0 && y<0) {
                System.out.println("4");
                break;
            }
            
            else continue;
        }
        
        sc.close();
    }
}
