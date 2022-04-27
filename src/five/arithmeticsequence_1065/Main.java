package five.arithmeticsequence_1065;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int digitCount = 0;
		ArrayList<Integer> digit = new ArrayList<>();
		boolean isSequence;
		
		int count = 0;
		
		int N = sc.nextInt();
		int NDigit;
		
		sc.close();
		
		for(i=1; i<=N; i++) {
			NDigit = i;
			digitCount = 0;
			isSequence = true;
			
			while(NDigit !=0) {
				digit.add(NDigit % 10);
				NDigit /= 10;
				digitCount++;
			}
			
			if(digitCount < 3) {}
			else {
				for(int j=0; j<(digitCount-2); j++) {
					if((digit.get(j+1) - digit.get(j)) 
							!= (digit.get(j+2) - digit.get(j+1))){
						isSequence = false;
					}
				}
			}
			
			if(isSequence) count++;
			
			digit.clear();
		}
		
		System.out.println(count);
	}
}
