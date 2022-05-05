package bj002292_hive;
import java.util.*;

public class Main {
	static int roomCount(int roomNum) {
		int count = 0;
		int num = 1;
		
		while(true) {
			if(roomNum > num + 6*count) {
				num += 6*count;
				count ++;
			}
			else break;
		}
		
		return count+1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int roomNum = sc.nextInt();
		
		System.out.println(roomCount(roomNum));
		
		sc.close();
	}
}
