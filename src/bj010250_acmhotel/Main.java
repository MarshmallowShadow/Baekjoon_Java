package bj010250_acmhotel;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int H;
		int W;
		int N;
		
		int x;
		int y;
		int R;
		
		for(int i=0; i<T; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			
			x = ((N - 1) / H) + 1;
			y = ((N - 1) % H) + 1;
			R = (y * 100) + x;
			System.out.println(R);
		}
		
		sc.close();
	}
}
