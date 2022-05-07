package agroup.bj002947_sticks;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sticks = new int[5];
		
		for(int i=0; i<5; i++) {
			sticks[i] = sc.nextInt();
		}
		
		while(true) {
			if(sticks[0]<=sticks[1] && sticks[1]<=sticks[2] && 
					sticks[2]<=sticks[3] && sticks[3]<=sticks[4]) {
				break;
			}
			
			for(int i=0; i<4; i++) {
				if(sticks[i] > sticks[i+1]) {
					int temp = sticks[i];
					sticks[i] = sticks[i+1];
					sticks[i+1] = temp;
					
					for(int j=0; j<5; j++) {
						System.out.print(sticks[j]);
						if(j<4) System.out.print(" ");
					}
					System.out.println();
				}
			}
		}
		
		sc.close();
	}
}
