package one.id_10926;
import java.util.Scanner;

public class Main2 {
	static boolean checkValid(String a) {
		if(a.length() <= 50) {
			int c;
			for(int i=0; i<a.length(); i++) {
                c=a.charAt(i);
				if(c>=97 && c<=122) {
                	continue;
                }
				else return false;
            }
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		boolean check;
		
		while(true) {
			id = sc.next();
			check = checkValid(id);
			
			if(check) {
				System.out.println(id + "??!");
				break;
			}
		}
		
		sc.close();
	}
}