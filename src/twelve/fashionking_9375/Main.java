package twelve.fashionking_9375;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n;
		String[][] cloth;
		HashMap<String, Integer> clothType = new HashMap<>();
		Iterator<Entry<String, Integer>> it = null;
		Integer addValue;
		double combination;
		
		for(int i=0; i<T; i++) {
			n = sc.nextInt();
			
			cloth = new String[n][2];
			clothType.clear();
			combination = 1;
			
			for(int j=0; j<n; j++) {
				cloth[j][0] = sc.next();
				cloth[j][1] = sc.next();
				if(!clothType.containsKey(cloth[j][1])) {
					clothType.put(cloth[j][1], 2);
				} else {
					addValue = clothType.get(cloth[j][1]);
					addValue++;
					clothType.put(cloth[j][1], addValue);
				}
			}
			
			it = clothType.entrySet().iterator();
			
			while(it.hasNext()) {
				combination *= it.next().getValue();
			}
			
			combination--;
			
			System.out.println((int)combination);
		}
		
		sc.close();
	}
}
