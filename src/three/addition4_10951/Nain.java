package three.addition4_10951;
import java.io.*;

public class Nain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String I;
        String S[];
        int A;
        int B;
        
       do {
    	   I = br.readLine();
    	   if(I != "") {
    		   S = I.split(" ");
        	   A = Integer.parseInt(S[0]);
        	   B = Integer.parseInt(S[1]);
        	   bw.write((A + B) + "\n");
    	   }
       } while(I != "");
       bw.flush();
    }
}