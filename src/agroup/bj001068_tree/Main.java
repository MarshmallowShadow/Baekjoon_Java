package agroup.bj001068_tree;

/* 1068번: 트리 (https://www.acmicpc.net/problem/1068)

트리에서 리프 노드란, 자식의 개수가 0인 노드를 말한다.

트리가 주어졌을 때, 노드 하나를 지울 것이다. 그 때, 남은 트리에서 리프 노드의 개수를 구하는 프로그램을 작성하시오.
노드를 지우면 그 노드와 노드의 모든 자손이 트리에서 제거된다.


입력: 첫째 줄에 트리의 노드의 개수 N이 주어진다. N은 50보다 작거나 같은 자연수이다.
	둘째 줄에는 0번 노드부터 N-1번 노드까지, 각 노드의 부모가 주어진다. 만약 부모가 없다면 (루트) -1이 주어진다.
	셋째 줄에는 지울 노드의 번호가 주어진다.

출력: 첫째 줄에 입력으로 주어진 트리에서 입력으로 주어진 노드를 지웠을 때, 리프 노드의 개수를 출력한다.

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, List<Integer>> tree = new HashMap<>();
		List<Integer> tGroup = new ArrayList<>();
		int N = sc.nextInt();
		
		//트리 생성 준비
		for(int i=0; i<N; i++) {
			tree.put(i, new ArrayList<Integer>());
		}
		//부모 노드 각 저장
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			if(num == -1) {
				tGroup.add(i);
			} else {
				tree.get(num).add(i);
			}
		}
		
		//삭제할 노드 가져오기
		int eNode = sc.nextInt();
		
		//부모 노드에 있는 자식 노드 찾아서 삭제
		for(int i=0; i<N; i++) {
			boolean deleted = false;
			for(int j=0; j<tree.get(i).size(); j++) {
				if(tree.get(i).get(j) == eNode) {
					tree.get(i).remove(j);
					deleted = true;
					break;
				}
			}
			if(deleted) {
				break;
			}
		}
		//노드 삭제
		delete(tree, eNode);
		
		//리프가 몇게인지 확인
		int leaf = 0;
		for(int i=0; i<tGroup.size(); i++) {
			int root = tGroup.get(i);
			//루트가 삭제 노드와 동일하면 스킵
			if(root == eNode) {
				continue;
			}
			leaf += getLeaf(tree, root);
		}
		
		System.out.println(leaf);
		sc.close();
	}
	
	//노드 삭제
	public static void delete(Map<Integer, List<Integer>> tree, int node) {
		int size = tree.get(node).size();
		for(int i=0; i<size; i++) {
			//재귀로 자식 노드도 삭제
			delete(tree, tree.get(node).get(i));
		}
		//해당 노드 삭제
		tree.remove(node);
		return;
	}
	
	//리프 카운팅
	public static int getLeaf(Map<Integer, List<Integer>> tree, int node) {
		//노드가 자식 없으면 +1
		if(tree.get(node).size() == 0) {
			return 1;
		}
		
		//재귀로 자식들이 가지고 있는 리프 확인 해서 카운트에 더하기
		int count = 0;
		for(int i=0; i<tree.get(node).size(); i++) {
			count += getLeaf(tree, tree.get(node).get(i));
		}
		
		return count;
	}
}
