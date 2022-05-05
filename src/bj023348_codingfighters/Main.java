package bj023348_codingfighters;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] multi = new int[3];
		int[] scores = new int[3];
		int maxScore = 0;
		int totalScore = 0;
		
		for(int i=0; i<3; i++) {
			multi[i] = sc.nextInt();
		}
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			totalScore = 0;
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					scores[k] = sc.nextInt();
					scores[k] *= multi[k];
					totalScore += scores[k];
				}
			}
			if(maxScore < totalScore) {
				maxScore = totalScore;
			}
		}
		
		System.out.println(maxScore);
		
		sc.close();
	}
}
