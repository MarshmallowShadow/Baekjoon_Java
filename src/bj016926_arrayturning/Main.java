package bj016926_arrayturning;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}

	public static class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			int R = sc.nextInt();

			Integer[][] A = new Integer[N][M];

			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			//Grouping Rotation Groups
			List<Deque<Integer>> rotGroup = new ArrayList<>();
			for(int i=0, j=M-1, k=0, l=N-1; i<=j && k<=l; i++, j--, k++, l--) {
				rotGroup.add(new LinkedList<>());
				//Top
				for(int m=j; m>i; m--) rotGroup.get(rotGroup.size()-1).add(A[k][m]);
				//Left
				for(int m=k; m<l; m++) rotGroup.get(rotGroup.size()-1).add(A[m][i]);
				//Bottom
				for(int m=i; m<j; m++) rotGroup.get(rotGroup.size()-1).add(A[l][m]);
				//Right
				for(int m=l; m>k; m--) rotGroup.get(rotGroup.size()-1).add(A[m][j]);
			}

			//For each iteration, add then pop stack
			for(int i=0; i<R; i++) {
				for(int j=0; j<rotGroup.size(); j++) {
					rotGroup.get(j).addFirst(rotGroup.get(j).pollLast());
				}
			}

			//Reassign 2D array A for output
			for(int i=0, j=M-1, k=0, l=N-1, n=0; n<rotGroup.size(); i++, j--, k++, l--, n++) {
				//Top
				for(int m=j; m>i; m--) A[k][m] = rotGroup.get(n).pop();
				//Left
				for(int m=k; m<l; m++) A[m][i] = rotGroup.get(n).pop();
				//Bottom
				for(int m=i; m<j; m++) A[l][m] = rotGroup.get(n).pop();
				//Right
				for(int m=l; m>k; m--) A[m][j] = rotGroup.get(n).pop();
			}

			//Print output
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					System.out.print(A[i][j]);
					if(j==M-1) {
						System.out.println();
					} else {
						System.out.print(" ");
					}
				}
			}
		}
	}
}
