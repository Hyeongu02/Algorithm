import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());
        int a=0;
        st= new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            a=Integer.parseInt(st.nextToken());
            if(X > a){
                bw.write(a + " ");
            }
        }
        bw.flush();
    }
}