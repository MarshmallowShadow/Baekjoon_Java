package eight.turret_1002;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double x1;
		double y1;
		double r1;
		double x2;
		double y2;
		double r2;
		
		double distance;
		double rDistance;
		
		int point;
		
		for(int i=0; i<T; i++) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			r1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			r2 = sc.nextDouble();
			
			distance = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
			rDistance = Math.pow(r1+r2, 2);
			
			if(x1 == x2 && y1 == y2 && r1 == r2) point = -1;
			else if(distance == rDistance || r2 == Math.pow(distance, 0.5) + r1
					|| r1 == Math.pow(distance, 0.5) + r2) point = 1;
			else if(distance > rDistance || r2 > Math.pow(distance, 0.5) + r1
					|| r1 > Math.pow(distance, 0.5) + r2) point = 0;
			else point = 2;
			
			System.out.println(point);
		}
		
		sc.close();
	}
}
