package bj001427_sortinside;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> sortNum = new ArrayList<>();
		int num = sc.nextInt();
		
		while(num/10 != 0) {
			sortNum.add(num%10);
			num /=10;
		}
		sortNum.add(num%10);
		
		Collections.sort(sortNum, Collections.reverseOrder());
		Iterator<Integer> it = sortNum.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		sc.close();
	}
}
