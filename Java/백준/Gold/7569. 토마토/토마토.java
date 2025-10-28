import java.io.*;
import java.util.*;

public class Main{
    static int[] dirX = {0,0,0,1,0,-1};
    static int[] dirY = {0,0,1,0,-1,0};
    static int[] dirH = {1,-1,0,0,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[][][] board = new int[H][N][M];
        int[][][] dist = new int[H][N][M];
        Deque<int[]> Q = new ArrayDeque<>();
        int allSum=0;
        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int k=0;k<M;k++){
                    board[i][j][k]= Integer.parseInt(st.nextToken());
                    if(board[i][j][k]==0){
                        allSum++;
                        dist[i][j][k]=-1;
                    }else if(board[i][j][k]==1){
                        Q.offer(new int[]{i,j,k});
                    }
                }
            }
        }
        int count=0;
        int lastDay=0;
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            for(int i=0;i<6;i++){
                int curH = cur[0]+dirH[i];
                int curX = cur[1]+dirX[i];
                int curY = cur[2]+dirY[i];
                if(curH<0||curX<0||curY<0||curH>=H||curX>=N||curY>=M) continue;
                if(dist[curH][curX][curY]>=0||board[curH][curX][curY]!=0) continue;
                Q.offer(new int[]{curH,curX,curY});
                count++;
                lastDay= dist[curH][curX][curY]= dist[cur[0]][cur[1]][cur[2]]+1;
            }
        }
        System.out.print((allSum==count)?lastDay:-1);
    }
}