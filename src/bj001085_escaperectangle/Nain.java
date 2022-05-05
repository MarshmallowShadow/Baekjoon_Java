package bj001085_escaperectangle;
import java.util.*;

public class Nain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int dist;
		
		if(x < w-x && x < y && x < h-y) dist = x;
		else if(y < w-x && y < x && y < h-y) dist = y;
		else if (w-x < x && w-x < y && w-x < h-y) dist = w - x;
		else dist = h - y;
		
		System.out.println(dist);
		
		sc.close();
	}
}
