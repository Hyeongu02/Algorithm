import java.util.*;
import java.io.*;

public class Main{
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if(N==1&&M==1) {
            System.out.println(1);
            return;
        }
        int[][][] dis = new int[N][M][2];
        int[][] board = new int[N][M];

        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<M; j++){
                board[i][j]=input.charAt(j)-'0';
            }
        }
        
        Deque<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{0,0,0});
        dis[0][0][0]=1;
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            for(int i=0; i<4;i++){
                int dirX = cur[0] + dir[i][0];
                int dirY = cur[1] + dir[i][1];
                if(dirX==N-1&&dirY==M-1){
                    System.out.println(dis[cur[0]][cur[1]][cur[2]]+1);
                    return;
                }
                if(dirX<0||dirY<0||dirX>=N||dirY>=M) continue;
                if(dis[dirX][dirY][cur[2]]!=0)continue;
                if(board[dirX][dirY]==1){
                    if(cur[2]==1) continue;
                    Q.offer(new int[]{dirX,dirY,1});
                    dis[dirX][dirY][1]=dis[cur[0]][cur[1]][0]+1;
                    continue;
                }
                Q.offer(new int[]{dirX,dirY,cur[2]});
                dis[dirX][dirY][cur[2]]=dis[cur[0]][cur[1]][cur[2]]+1; 
            }
        }
        System.out.println(-1);
    }
}