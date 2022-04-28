package bj.noforeign_2789;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String old = sc.next();
		String c = "CAMBRIDGE";
		boolean exists;
		String neww = "";
		
		for(int i=0; i<old.length(); i++) {
			exists = false;
			for(int j=0; j<c.length(); j++) {
				if(old.charAt(i) == c.charAt(j)) {
					exists = true;
					break;
				}
			}
			if(!exists) {
				neww += old.charAt(i);
			}
		}
		
		System.out.println(neww);
		sc.close();
	}
}
