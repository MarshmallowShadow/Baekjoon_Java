package bj010828_stack;

/* 10828번: 스택

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

    push X: 정수 X를 스택에 넣는 연산이다.
    pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 스택에 들어있는 정수의 개수를 출력한다.
    empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

입력: 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고,
	100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력: 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

*/

import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		
		List<String> n = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			String s[] = br.readLine().split(" ");
			if(s[0].equals("push")) {
				push(n, s[1]);
			} else if(s[0].equals("pop")) {
				pop(n);
			} else if(s[0].equals("size")) {
				size(n);
			} else if(s[0].equals("empty")) {
				empty(n);
			} else {
				top(n);
			}
		}
		
		bw.flush();
	}
	
	public static void push(List<String> n, String num) throws IOException {
		n.add(num);
	}
	
	public static void pop(List<String> n) throws IOException {
		int s = n.size() - 1;
		if(s < 0) {
			bw.write("-1");
		} else {
			bw.write(n.get(s));
			n.remove(s);
		}
		bw.newLine();
	}
	
	public static void size(List<String> n) throws IOException {
		bw.write(Integer.toString(n.size()));
		bw.newLine();
	}
	
	
	public static void empty(List<String> n) throws IOException {
		if(n.size() == 0) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		bw.newLine();
	}
	
	public static void top(List<String> n) throws IOException {
		int s = n.size() - 1;
		if(s < 0) {
			bw.write("-1");
		} else {
			bw.write(n.get(s));
		}
		bw.newLine();
	}
}
