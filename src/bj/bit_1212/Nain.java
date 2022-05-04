package bj.bit_1212;
import java.util.*;

public class Nain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int octal = sc.nextInt();
		
		int dec = toDecimal(octal, 0);
		String bin = toBinary(dec);
		
		System.out.println(bin);
		
		sc.close();
	}
	
	public static int toDecimal(int octal, int power) {
		if(octal/10 == 0) {
			return (int)(octal*Math.pow(8, power));
		}
		
		int dec = 0;
		int recurse = toDecimal(octal/10, power+1);
		dec = (octal%10) * (int)(Math.pow(8, power)) + recurse;
		
		return dec;
	}
	
	public static String toBinary(int dec) {
		if(dec < 2) {
			if(dec%2 == 0) {
				return "";
			} else {
				return "1";
			}
		}
		
		String bin;
		
		String recurse = toBinary(dec/2);
		
		if(dec%2 == 0) {
			bin = recurse + "0";
		} else {
			bin = recurse + "1";
		}
		
		return bin;
	}
}
