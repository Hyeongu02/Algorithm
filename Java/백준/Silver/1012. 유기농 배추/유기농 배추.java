import java.io.*;
import java.util.*;

public class Main{
    static int[] dirX = {0,1,0,-1};
    static int[] dirY = {1,0,-1,0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count = 0;
            int[][] board = new int[M][N];
            boolean[][] visit = new boolean[M][N];
            Deque<int[]> Q = new ArrayDeque<>();
            for(int j=0; j<K;j++){
                st = new StringTokenizer(br.readLine(), " ");
                board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=1;
            }
            for(int j=0; j<M;j++){
                for(int k=0; k<N;k++){
                    if(board[j][k]==1&&!visit[j][k]){
                        Q.offer(new int[]{j,k});
                        visit[j][k]=true;
                        while (!Q.isEmpty()) {
                            int[] cur = Q.poll();
                            for(int m=0; m<4;m++){
                                int curX = dirX[m]+ cur[0];
                                int curY = dirY[m]+ cur[1];
                                if(curX<0||curY<0||curX>=M||curY>=N)continue;
                                if(board[curX][curY]==0||visit[curX][curY]) continue;
                                visit[curX][curY]=true;
                                Q.offer(new int[]{curX,curY});
                            }
                        }
                        count++;
                    }
                }
            }
            bw.append(count+"\n");
        }
        bw.flush();
    }
}