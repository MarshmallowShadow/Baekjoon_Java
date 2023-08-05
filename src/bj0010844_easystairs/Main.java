package bj0010844_easystairs;

/* 10844번 : 쉬운 계단 수


45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.


입력: 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

출력: 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for(int i=1; i<=9; i++) {
            long[] cnt = new long[10];
            cnt[i] = 1;
            for(int j=1; j<N; j++) {
                long[] cntSum = new long[10];
                for(int k=0; k<cntSum.length; k++){
                    if(k!=0){
                        cntSum[k] += cnt[k-1]%1000000000;
                    }
                    if(k!=cntSum.length-1){
                        cntSum[k] += cnt[k+1]%1000000000;
                    }
                }
                cnt = cntSum;
            }
            for(int j=0; j<cnt.length; j++){
                sum += cnt[j]%1000000000;
            }
        }
        
        sum %= 1000000000;
        
        System.out.println(sum);
        sc.close();
    }
}
