package eight.taxicabgeometry_3053;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		
		double cArea = Math.PI * Math.pow(radius, 2);
		double tArea = Math.pow(2*radius, 2) / 2;
		
		System.out.println(cArea);
		System.out.println(tArea);
		
		sc.close();
	}
}
