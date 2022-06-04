package bj006603_lotto;

/* 6603��: �ζ� (https://www.acmicpc.net/problem/6603)

���� �ζǴ� {1, 2, ..., 49}���� �� 6���� ����.

�ζ� ��ȣ�� �����ϴµ� ���Ǵ� ���� ������ ������ 49���� �� �� k(k>6)���� ���� ��� ���� S�� ���� ���� �� ���� ������
��ȣ�� �����ϴ� ���̴�.

���� ���, k=8, S={1,2,3,5,8,13,21,34}�� ��� �� ���� S���� ���� �� �� �ִ� ����� ���� �� 28�����̴�.
([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])

���� S�� k�� �־����� ��, ���� ���� ��� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.


�Է�: �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. ù ��° ���� k (6 < k < 13)�̰�,
	���� k�� ���� ���� S�� ���ԵǴ� ���̴�. S�� ���Ҵ� ������������ �־�����.

	�Է��� ������ �ٿ��� 0�� �ϳ� �־�����. 

���: �� �׽�Ʈ ���̽����� ���� ���� ��� ����� ����Ѵ�. �̶�, ���� ������ ����Ѵ�.
	�� �׽�Ʈ ���̽� ���̿��� �� ���� �ϳ� ����Ѵ�.

*/

import java.io.*;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		while(true) {
			String[] s = br.readLine().split(" ");
			int k = Integer.parseInt(s[0]);
			
			if(k == 0) {
				break;
			}
			
			int[] S = new int[k];
			int[] lotto = new int[6];
			
			for(int i=1; i<k+1; i++) {
				S[i-1] = Integer.parseInt(s[i]);
			}
			
			printLotto(S, lotto);
			bw.newLine();
			bw.flush();
		}
	}
	
	public static void printLotto(int[] S, int[] lotto) throws IOException {
		//��� ���� ���� ���� (�������� ���): �ζ� ��ȣ�� �� ä�������� ���
		if(lotto[5] != 0) {
			for(int i=0; i<6; i++) {
				bw.write(Integer.toString(lotto[i]));
				if(i != 5) {
					bw.write(" ");
				}
			}
			bw.newLine();
			lotto[5] = 0;
			return;
		}
		
		for(int j=0; j<6; j++) {
			//�ζ� ��ȣ�� 0 �ƴϸ� �Ѿ
			if(lotto[j] != 0) {
				continue;
			}
			
			//�ζ� ��ȣ 0�� ��� �� �ڸ��� S�� ���� ����
			for(int l=0; l<S.length; l++) {
				//ù��° �ڸ����� �ڵ� ����
				if(j==0) {
					lotto[j] = S[l];
					printLotto(S, lotto);
				}
				//�� ��ȣ �ڸ��� S���� ������ ���� �ڸ��� S�� ����
				else if(lotto[j-1] < S[l]) {
					lotto[j] = S[l];
					printLotto(S, lotto);
				}
			}
			
			//j�ڸ� �ʱ�ȭ�ϰ� 1�ܰ� �ڷ�
			lotto[j] = 0;
			return;
		}
	}
}
