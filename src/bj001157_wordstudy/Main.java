package bj001157_wordstudy;
import java.io.*;

public class Main {
	
	static String mostRepeat(String s) {
		String big = "?";
		int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0,
			countG = 0, countH = 0, countI = 0, countJ = 0, countK = 0, countL = 0, 
			countM = 0, countN = 0, countO = 0, countP = 0, countQ = 0, countR = 0,
			countS = 0, countT = 0, countU = 0, countV = 0, countW = 0, countX = 0,
			countY = 0, countZ = 0;
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)){
				case 'a':
					countA++;
					if(countA == count) big = "?";
					else if(countA > count) {
						count = countA;
						big = "A";
					}
					break;
				case 'b':
					countB++;
					if(countB == count) big = "?";
					else if(countB > count) {
						count = countB;
						big = "B";
					}
					break;
				case 'c':
					countC++;
					if(countC == count) big = "?";
					else if(countC > count) {
						count = countC;
						big = "C";
					}
					break;
				case 'd':
					countD++;
					if(countD == count) big = "?";
					else if(countD > count) {
						count = countD;
						big = "D";
					}
					break;
				case 'e':
					countE++;
					if(countE == count) big = "?";
					else if(countE > count) {
						count = countE;
						big = "E";
					}
					break;
				case 'f':
					countF++;
					if(countF == count) big = "?";
					else if(countF > count) {
						count = countF;
						big = "F";
					}
					break;
				case 'g':
					countG++;
					if(countG == count) big = "?";
					else if(countG > count) {
						count = countG;
						big = "G";
					}
					break;
				case 'h':
					countH++;
					if(countH == count) big = "?";
					else if(countH > count) {
						count = countH;
						big = "H";
					}
					break;
				case 'i':
					countI++;
					if(countI == count) big = "?";
					else if(countI > count) {
						count = countI;
						big = "I";
					}
					break;
				case 'j':
					countJ++;
					if(countJ == count) big = "?";
					else if(countJ > count) {
						count = countJ;
						big = "J";
					}
					break;
				case 'k':
					countK++;
					if(countK == count) big = "?";
					else if(countK > count) {
						count = countK;
						big = "K";
					}
					break;
				case 'l':
					countL++;
					if(countL == count) big = "?";
					else if(countL > count) {
						count = countL;
						big = "L";
					}
					break;
				case 'm':
					countM++;
					if(countM == count) big = "?";
					else if(countM > count) {
						count = countM;
						big = "M";
					}
					break;
				case 'n':
					countN++;
					if(countN == count) big = "?";
					else if(countN > count) {
						count = countN;
						big = "N";
					}
					break;
				case 'o':
					countO++;
					if(countO == count) big = "?";
					else if(countO > count) {
						count = countO;
						big = "O";
					}
					break;
				case 'p':
					countP++;
					if(countP == count) big = "?";
					else if(countP > count) {
						count = countP;
						big = "P";
					}
					break;
				case 'q':
					countQ++;
					if(countQ == count) big = "?";
					else if(countQ > count) {
						count = countQ;
						big = "Q";
					}
					break;
				case 'r':
					countR++;
					if(countR == count) big = "?";
					else if(countR > count) {
						count = countR;
						big = "R";
					}
					break;
				case 's':
					countS++;
					if(countS == count) big = "?";
					else if(countS > count) {
						count = countS;
						big = "S";
					}
					break;
				case 't':
					countT++;
					if(countT == count) big = "?";
					else if(countT > count) {
						count = countT;
						big = "T";
					}
					break;
				case 'u':
					countU++;
					if(countU == count) big = "?";
					else if(countU > count) {
						count = countU;
						big = "U";
					}
					break;
				case 'v':
					countV++;
					if(countV == count) big = "?";
					else if(countV > count) {
						count = countV;
						big = "V";
					}
					break;
				case 'w':
					countW++;
					if(countW == count) big = "?";
					else if(countW > count) {
						count = countW;
						big = "W";
					}
					break;
				case 'x':
					countX++;
					if(countX == count) big = "?";
					else if(countX > count) {
						count = countX;
						big = "X";
					}
					break;
				case 'y':
					countY++;
					if(countY == count) big = "?";
					else if(countY > count) {
						count = countY;
						big = "Y";
					}
					break;
				case 'z':
					countZ++;
					if(countZ == count) big = "?";
					else if(countZ > count) {
						count = countZ;
						big = "Z";
					}
					break;
				default: break;
			}
		}
		return big;
	}
	 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine().toLowerCase();
		String big = mostRepeat(s);
		
		bw.write(big);
		bw.flush();
		
	}
}
