package three.reverseprintn_2742;
import java.io.*;

public class Nain2{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=N; i>=1; i--) bw.write(i + "/n");
    }
}
