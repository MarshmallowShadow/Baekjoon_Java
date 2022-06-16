package agroup.bj001759_makepassword;

/* 1759번: 암호 만들기

바로 어제 최백준 조교가 방 열쇠를 주머니에 넣은 채 깜빡하고 서울로 가 버리는 황당한 상황에 직면한 조교들은, 702호에 새로운 보안 시스템을 설치하기로 하였다.
이 보안 시스템은 열쇠가 아닌 암호로 동작하게 되어 있는 시스템이다.

암호는 서로 다른 L개의 알파벳 소문자들로 구성되며 최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성되어 있다고 알려져 있다.
또한 정렬된 문자열을 선호하는 조교들의 성향으로 미루어 보아 암호를 이루는 알파벳이 암호에서 증가하는 순서로 배열되었을 것이라고 추측된다.
즉, abc는 가능성이 있는 암호이지만 bac는 그렇지 않다.

새 보안 시스템에서 조교들이 암호로 사용했을 법한 문자의 종류는 C가지가 있다고 한다. 이 알파벳을 입수한 민식, 영식 형제는 조교들의 방에 침투하기 위해 암호를 추측해 보려고 한다.
C개의 문자들이 모두 주어졌을 때, 가능성 있는 암호들을 모두 구하는 프로그램을 작성하시오.


입력: 첫째 줄에 두 정수 L, C가 주어진다. (3 ≤ L ≤ C ≤ 15) 다음 줄에는 C개의 문자들이 공백으로 구분되어 주어진다. 주어지는 문자들은 알파벳 소문자이며, 중복되는 것은 없다.

출력: 각 줄에 하나씩, 사전식으로 가능성 있는 암호를 모두 출력한다.

*/

import java.io.*;
import java.util.Arrays;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		String[] lc = br.readLine().split(" ");
		int L = Integer.parseInt(lc[0]);
		int C = Integer.parseInt(lc[1]);
		String[] letters = br.readLine().split(" ");
		char[] chars = new char[C];
		//채워서 출력할 배열
		char[] combo = new char[L];
		
		for(int i=0; i<C; i++) {
			chars[i] = letters[i].charAt(0);
		}
		
		//사전순으로 정렬
		Arrays.sort(chars);
		
		print(chars, combo, 0, 0);
		
		bw.flush();
	}
	
	//매개변수: 입력한 캐릭터들, 채워서 출력할 배열, combo배열 위치, c배열 위치
	public static void print(char[] c, char[] combo, int pos, int pos2) throws IOException {
		//암호 조건 확인
		if(combo.length == pos) {
			int vowel = 0;
			int consonant = 0;
			boolean valid = false;
			
			for(int i=0; i<pos; i++) {
				if(combo[i] == 'a' || combo[i] == 'e' || combo[i] == 'i' || combo[i] == 'o' || combo[i] == 'u') {
					vowel++;
				} else {
					consonant++;
				}
				if(vowel >= 1 && consonant >= 2) {
					valid = true;
					break;
				}
			}
			//암호 조건이 만족할 경우에만 출력
			if(valid) {
				for(int i=0; i<pos; i++) {
					bw.write(Character.toString(combo[i]));
				}
				bw.newLine();
			}
			
			return;
		}
		
		//재귀로 배열 하나한씩 채우기
		for(int j=pos2; j<c.length; j++) {
			combo[pos] = c[j];
			print(c, combo, pos+1, j+1);
		}
		
		return;
	}
}
