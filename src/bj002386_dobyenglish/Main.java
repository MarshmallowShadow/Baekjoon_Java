package bj002386_dobyenglish;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char c = sc.next().charAt(0);
			
			if(c == '#') break;
			
			String sentence = sc.nextLine().toLowerCase();
			int count = 0;
			
			for(int i=0; i<sentence.length(); i++) {
				if(c == sentence.charAt(i)) count++;
			}
			
			System.out.println(c + " " + count);
		}
		
		sc.close();
	}
}
