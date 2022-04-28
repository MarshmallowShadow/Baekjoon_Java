package bj.pallindrome_10988;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int pallindrome = 1;
		
		for(int i=0, j=word.length()-1; i <= j; i++, j--){
			if(word.charAt(i) != word.charAt(j)) {
				pallindrome = 0;
				break;
			}
		}
		
		System.out.println(pallindrome);
		
		sc.close();
	}
}
