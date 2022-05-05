package bj010818_maxmin;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S;
        String T[];
        int i;
        
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int B[] = new int[2];
        
        S = br.readLine();
        T = S.split(" ");
        
        for(i = 0; i<N; i++) {
        	A[i] = Integer.parseInt(T[i]);
        }
        
        if(N == 1) {
        	B[0] = A[0];
        	B[1] = A[0];
        }
        else {
        	if(A[1] > A [0]) {
        		B[1] = A[1];
            	B[0] = A[0];
        	}
        	else {
            	B[1] = A[0];
            	B[0] = A[1];
            }
        	for(i = 2; i<N; i++) {
            	if(A[i] > B[1]) B[1] = A[i];
            	if(A[i] < B[0]) B[0] = A[i]; 
            }
        }
        
        bw.write(B[0] + " " + B[1]);
        bw.flush();
    }
}