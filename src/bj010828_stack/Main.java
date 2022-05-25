package bj010828_stack;

/* 10828��: ����

������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� �ټ� �����̴�.

    push X: ���� X�� ���ÿ� �ִ� �����̴�.
    pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
    empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
    top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

�Է�: ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����,
	100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.

���: ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.

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
