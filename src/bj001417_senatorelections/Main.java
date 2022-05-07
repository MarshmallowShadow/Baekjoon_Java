package bj001417_senatorelections;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] votes = new int[N];
		
		for(int i=0; i<N; i++) {
			votes[i] = sc.nextInt();
		}
		
		int high;
		int temp;
		
		for(int i=1; i<votes.length; i++) {
			high = highest(votes, i);
			temp = votes[i];
			votes[i] = votes[high];
			votes[high] = temp;
		}
		
		recount(votes);
		
		sc.close();
	}
	
	public static int highest(int[] num, int start) {
		int highest = start;
		for(int i=start+1; i<num.length; i++) {
			if(num[highest] < num[i]) {
				highest = i;
			}
		}
		
		return highest;
	}
	
	public static void recount(int[] votes) {
		int win = votes[0];
		int tied = 0;
		
		for(int i = 1; i<votes.length && win <= votes[i] && votes[i] != 0; i++) {
			
			while(win<= votes[i]) {
				if(i < votes.length-1 && win <= votes[i]) {
					if(votes[i] == votes[i+1]) {
						tied++;
						break;
					}
				}
				
				for(int j=i-tied; j <= i && win <= votes[i]; j++) {
					win++;
					votes[j]--;
				}
			}
			
			if(i < votes.length-1) {
				if(votes[i] == votes[i+1]) {
					continue;
				} else {
					tied = 0;
				}
			}
		}
		
		System.out.println(win-votes[0]);
	}
}
