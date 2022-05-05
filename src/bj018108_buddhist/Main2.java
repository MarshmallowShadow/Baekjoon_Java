package bj018108_buddhist;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		
		while(true) {
			y = sc.nextInt();
			
			if(y>=1000 && y<=3000) {
				System.out.println(y - 543);
				break;
			}
		}
		 sc.close();
	}
}