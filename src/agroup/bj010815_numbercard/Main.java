package agroup.bj010815_numbercard;

/* 10815¹ø: ¼ıÀÚ Ä«µå (https://www.acmicpc.net/problem/10815)
	
	¼ıÀÚ Ä«µå´Â Á¤¼ö ÇÏ³ª°¡ ÀûÇôÁ® ÀÖ´Â Ä«µåÀÌ´Ù. »ó±ÙÀÌ´Â ¼ıÀÚ Ä«µå N°³¸¦ °¡Áö°í ÀÖ´Ù.
	Á¤¼ö M°³°¡ ÁÖ¾îÁ³À» ¶§, ÀÌ ¼ö°¡ ÀûÇôÀÖ´Â ¼ıÀÚ Ä«µå¸¦ »ó±ÙÀÌ°¡ °¡Áö°í ÀÖ´ÂÁö ¾Æ´ÑÁö¸¦ ±¸ÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇÏ½Ã¿À.
	
	ÀÔ·Â: Ã¹Â° ÁÙ¿¡ »ó±ÙÀÌ°¡ °¡Áö°í ÀÖ´Â ¼ıÀÚ Ä«µåÀÇ °³¼ö N(1 ¡Â N ¡Â 500,000)ÀÌ ÁÖ¾îÁø´Ù. µÑÂ° ÁÙ¿¡´Â ¼ıÀÚ Ä«µå¿¡ ÀûÇôÀÖ´Â Á¤¼ö°¡ ÁÖ¾îÁø´Ù.
		¼ıÀÚ Ä«µå¿¡ ÀûÇôÀÖ´Â ¼ö´Â -10,000,000º¸´Ù Å©°Å³ª °°°í, 10,000,000º¸´Ù ÀÛ°Å³ª °°´Ù. µÎ ¼ıÀÚ Ä«µå¿¡ °°Àº ¼ö°¡ ÀûÇôÀÖ´Â °æ¿ì´Â ¾ø´Ù.

		¼ÂÂ° ÁÙ¿¡´Â M(1 ¡Â M ¡Â 500,000)ÀÌ ÁÖ¾îÁø´Ù. ³İÂ° ÁÙ¿¡´Â »ó±ÙÀÌ°¡ °¡Áö°í ÀÖ´Â ¼ıÀÚ Ä«µåÀÎÁö ¾Æ´ÑÁö¸¦ ±¸ÇØ¾ß ÇÒ M°³ÀÇ Á¤¼ö°¡ ÁÖ¾îÁö¸ç,
		ÀÌ ¼ö´Â °ø¹éÀ¸·Î ±¸ºĞµÇ¾îÁ® ÀÖ´Ù. ÀÌ ¼öµµ -10,000,000º¸´Ù Å©°Å³ª °°°í, 10,000,000º¸´Ù ÀÛ°Å³ª °°´Ù
	
	­ŒÇõ: Ã¹Â° ÁÙ¿¡ ÀÔ·ÂÀ¸·Î ÁÖ¾îÁø M°³ÀÇ ¼ö¿¡ ´ëÇØ¼­, °¢ ¼ö°¡ ÀûÈù ¼ıÀÚ Ä«µå¸¦ »ó±ÙÀÌ°¡ °¡Áö°í ÀÖÀ¸¸é 1À», ¾Æ´Ï¸é 0À» °ø¹éÀ¸·Î ±¸ºĞÇØ Ãâ·ÂÇÑ´Ù.

*/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] s1 = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		String[] s2 = br.readLine().split(" ");
		
		int[] sg = new int[N];
		
		//convert to int
		for(int i=0; i<N; i++) {
			sg[i] = Integer.parseInt(s1[i]);
		}
		//sort array of »ó±Ù
		sort(sg, 0, sg.length - 1);
		
		//loop to start search for each index in s2
		for(int i=0; i<M; i++) {
			//convert string in s1[i] to int
			int c = Integer.parseInt(s2[i]);
			
			//check if it exists
			if(search(c, sg)) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			
			//write a space EXCEPT when i is the last index
			if(i != M-1) {
				bw.write(" ");
			}
		}
		
		//print output to console
		bw.flush();
	}
	
	//binary search
	public static boolean search(int n, int[] sg) {
		int i=sg.length/2;
		int l=-1;
		int r=sg.length;
		
		while(i>l && i<r) {
			if(n == sg[i]) {
				return true;
			} else if(n < sg[i]) {
				r = i;
				i -= (r - l) / 2;
			} else {
				l = i;
				i += (r - l) / 2;
			}
		}
		
		return false;
	}
	
	//merge sort
	public static void sort(int[] sg, int l, int r) {
		if(l < r) {
			int m = l + (r-l) / 2;
			
			sort(sg, m+1, r);
			sort(sg, l, m);
			
			merge(sg, m, l ,r);
		}
	}
	
	public static void merge(int[] sg, int m, int l, int r) {
		int left = m - l + 1;
		int right = r - m;
		
		int[] L = new int[left];
		int[] R = new int[right];
		
		for(int i=0; i<left; i++) {
			L[i] = sg[l+i];
		}
		for(int j=0; j<right; j++) {
			R[j] = sg[m+1+j];
		}
		
		int i=0;
		int j=0;
		int k = l;
		
		while(i<left && j<right) {
			if(L[i] <= R[j]) {
				sg[k] = L[i];
				i++;
			} else {
				sg[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<left) {
			sg[k] = L[i];
			i++;
			k++;
		}
		while(j<right) {
			sg[k] = R[j];
			j++;
			k++;
		}
	}
}
