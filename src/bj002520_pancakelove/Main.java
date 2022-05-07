package bj002520_pancakelove;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] ingr;
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			ingr = new double[9];
			
			for(int j=0; j<9; j++) {
				ingr[j] = sc.nextDouble();
			}
			
			double max = 0;
			int total = 0;
			
			max = ingr[0]/8;
			
			if(ingr[1]/8 < max) {
				max = (ingr[1]/8);
			}
			if(ingr[2]/4 < max) {
				max = (ingr[2]/4);
			}
			if(ingr[3] < max) {
				max = (ingr[3]);
			}
			if(ingr[4]/9 < max) {
				max = (ingr[4]/9);
			}
			
			max = max * 16;
			
			while(ingr[5] >= 1.0 && max >= 1.0) {
				total++;
				max--;
				ingr[5] --;
			}
			while(ingr[6] >= 30.0 && max >= 1.0) {
				total++;
				max--;
				ingr[6] -= 30;
			}
			while(ingr[7] >= 25.0 && max >= 1.0) {
				total++;
				max--;
				ingr[7] -= 25;
			}
			while(ingr[8] >= 10.0 && max >= 1.0) {
				total++;
				max--;
				ingr[8] -= 10;
			}
			
			System.out.println(total);
		}
		
		sc.close();
	}
}
