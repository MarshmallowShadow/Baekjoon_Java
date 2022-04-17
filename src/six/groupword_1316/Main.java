package six.groupword_1316;

import java.util.Scanner;

public class Main {
	
	static boolean checkRepeat(String word) {
		char c;
		for(int i=0; i<word.length()-2; i++) {
			c = word.charAt(i);
			if(c == word.charAt(i+1)) continue;
			else {
				for(int j=i+2; j<word.length(); j++) {
					if(c == word.charAt(j)) return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		int count = 0;
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			word = sc.next();
			if(checkRepeat(word)) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
