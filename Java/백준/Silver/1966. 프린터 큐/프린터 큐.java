import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n;i++){
            Deque<int[]> Q = new ArrayDeque<>();
            String[] t1 = br.readLine().split(" ");
            int N = Integer.parseInt(t1[0]);
            int M = Integer.parseInt(t1[1]);
            int count=0;
            String[] t2 = br.readLine().split(" ");
            for(int j=0;j<N;j++){
                Q.offer(new int[]{Integer.parseInt(t2[j]),j});
            }
            while (!Q.isEmpty()) {
                int[] paper = Q.poll();

                boolean flag = false;
                for(int[] x : Q){
                    if(paper[0] < x[0]){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    Q.offer(paper);
                }else{
                    count++;
                    if(paper[1]==M){
                        bw.append(count+"\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}