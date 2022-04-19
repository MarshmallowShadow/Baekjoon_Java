package seven.housing_2775;
import java.util.*;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n;
		int k;
		
		for(int i=0; i<T; i++) {
			k = sc.nextInt()+2;
			n = sc.nextInt();
			
			int[] bottomFloor = new int[n];
			int[] topFloor = new int[n];
			
			
			for(int y=0; y<=k; y++) {
				bottomFloor = topFloor;
				topFloor = new int[n];
				
				for(int x=0; x<n; x++) {
					if(y==0) topFloor[x] = 1;
					else {
						for(int c=0; c<=x; c++) {
							topFloor[x] += bottomFloor[c];
						}
					}
				}
			}
			
			System.out.println(bottomFloor[n-1]);
		}
		
		
		sc.close();
	}

}