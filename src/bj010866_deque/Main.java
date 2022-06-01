package bj010866_deque;

/* 10866��: �� (https://www.acmicpc.net/problem/10866)

������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� ���� �����̴�.

    push_front X: ���� X�� ���� �տ� �ִ´�.
    push_back X: ���� X�� ���� �ڿ� �ִ´�.
    pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    size: ���� ����ִ� ������ ������ ����Ѵ�.
    empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
    front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

�Է�: ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����.
	������ �������� ���� ����� �־����� ���� ����.

���: ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.

*/

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> deque = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String comm[] = br.readLine().split(" ");
			if(comm[0].equals("push_front")) {
				pushFront(deque, Integer.parseInt(comm[1]));
			} else if(comm[0].equals("push_back")) {
				pushBack(deque, Integer.parseInt(comm[1]));
			} else if(comm[0].equals("pop_front")) {
				bw.write(Integer.toString(popFront(deque)));
				bw.newLine();
			} else if(comm[0].equals("pop_back")) {
				bw.write(Integer.toString(popBack(deque)));
				bw.newLine();
			} else if(comm[0].equals("front")) {
				bw.write(Integer.toString(front(deque)));
				bw.newLine();
			} else if(comm[0].equals("back")) {
				bw.write(Integer.toString(back(deque)));
				bw.newLine();
			} else if(comm[0].equals("empty")) {
				bw.write(Integer.toString(empty(deque)));
				bw.newLine();
			} else {
				bw.write(Integer.toString(size(deque)));
				bw.newLine();
			}
		}
		
		bw.flush();
	}
	
	public static void pushFront(List<Integer> deque, int X) {
		deque.add(X);
	}
	public static void pushBack(List<Integer> deque, int X) {
		deque.add(0, X);
	}
	public static int popFront(List<Integer> deque) {
		if(deque.size() == 0) {
			return -1;
		}
		int x = deque.get(deque.size()-1);
		deque.remove(deque.size()-1);
		return x;
	}
	public static int popBack(List<Integer> deque) {
		if(deque.size() == 0) {
			return -1;
		}
		int x = deque.get(0);
		deque.remove(0);
		return x;
	}
	public static int size(List<Integer> deque) {
		return deque.size();
	}
	public static int empty(List<Integer> deque) {
		if(deque.size() == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	public static int front(List<Integer> deque) {
		if(deque.size() == 0) {
			return -1;
		}
		return deque.get(deque.size()-1);
	}
	public static int back(List<Integer> deque) {
		if(deque.size() == 0) {
			return -1;
		}
		return deque.get(0);
	}
}
