package bj002750_numbers1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> arrange = new TreeSet<>();
		int T = sc.nextInt();
		int num;
		
		for(int i=0; i<T; i++) {
			num = sc.nextInt();
			arrange.add(num);
		}
		
		Iterator<Integer> it = arrange.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		sc.close();
	}
}
