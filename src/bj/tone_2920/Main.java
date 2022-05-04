package bj.tone_2920;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tone = new int[8];
		String result = "";
		
		for(int i=0; i<8; i++) {
			tone[i] = sc.nextInt();
		}
		
		if(tone[0] == 1) {
			for(int i=1; i<8; i++) {
				if(tone[i] != i+1) {
					result = "mixed";
					break;
				}
				if(result.equals("")) {
					result = "ascending";
				}
			}
		} else if(tone[0] == 8) {
			for(int i=1; i<8; i++) {
				if(tone[i] != 8-i) {
					result = "mixed";
					break;
				}
				if(result.equals("")) {
					result = "descending";
				}
			}
		} else {
			result = "mixed";
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
