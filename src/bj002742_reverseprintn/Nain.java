package bj002742_reverseprintn;
import java.io.*;

public class Nain{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=N; i>=1; i--) bw.write(i + "\n");
        
        bw.flush();
    }
}
