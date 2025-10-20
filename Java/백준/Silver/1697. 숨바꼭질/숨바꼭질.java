import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if(N==K){
            System.out.print(0);
            return;
        }
        char[] line = new char[200000];
        int[] vis = new int[200000];
        Deque<Integer> Q = new ArrayDeque<>(); 
        line[N]='N';
        line[K]='K';
        Q.offer(N);
        while (!Q.isEmpty()) {
            int cur = Q.poll();
            for(int i=0; i<3;i++){
                int curX = 0;
                if(i==0){
                    curX= cur-1;
                }else if(i==1){
                    curX=cur+1;
                }else{
                    curX=cur*2;
                }
                if(curX<0||curX>=200000) continue;
                if(vis[curX]>0) continue;
                vis[curX]=vis[cur]+1;
                if(line[curX]=='K'){
                    System.out.print(vis[curX]);
                    return;
                }
                Q.offer(curX);
            }
        }
    }
}