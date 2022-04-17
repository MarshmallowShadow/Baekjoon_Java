package six.croatia_2941;
import java.util.*;

public class Main {
	static int hasCroatian(String s) {
		String ss = s.substring(0,2);
		if(s.equals("dz=")) return 2;
		else if(ss.equals("c=") || ss.equals("c-") || ss.equals("d-") || 
				ss.equals("lj") || ss.equals("nj") || ss.equals("s=") ||
				ss.equals("z="))
			return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = word.length();
		String subS = "a";
		int croatia;
		
		for(int i=0; i<word.length()-1; i++) {
			if (i<word.length()-2) subS = word.substring(i, i+3);
			else subS = word.substring(i,i+2);
			
			croatia = hasCroatian(subS);
			
			count -= croatia;
			i += croatia;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
