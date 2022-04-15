package five.selfnum_4673;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		
		int digit;
		int num = 1;
		int numDigit;
		int newNum = 0;
		
		TreeSet<Integer> selfnum = new TreeSet<>();
		
		for(i=1; i<10001; i++) {
			selfnum.add(i);
		}
		
		while (num <= 10000) {
			numDigit = num;
			newNum = num;
			
			do {
				digit = numDigit % 10;
				newNum += digit;
				numDigit /= 10;
			} while(numDigit != 0);
			
			if(newNum <= 10000) selfnum.remove(newNum);
			
			num++;
		}
		
		Iterator<Integer> value = selfnum.iterator();
		
		while(value.hasNext()) {
			System.out.println(value.next());
		}
	}
}
