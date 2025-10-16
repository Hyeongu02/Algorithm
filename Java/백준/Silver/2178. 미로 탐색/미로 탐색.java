import java.io.*;
import java.util.*;

public class Main{
    static int[] dirX = new int[]{1,0,-1,0};
    static int[] dirY = new int[]{0,1,0,-1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] board = new int[n][m];
        int[][] vis = new int[n][m];
        for(int i=0; i<n;i++){
            char[] boardLine = br.readLine().toCharArray();
            for(int j=0;j<m;j++){
                board[i][j]=boardLine[j]-'0';
            }
        }
        Deque<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{0,0});
        vis[0][0]=1;
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int curX = cur[0];
            int curY = cur[1];
            if(curX==n-1&&curY==m-1){
                System.out.println(vis[curX][curY]);
                return;
            }
            
            for(int dir=0;dir<4;dir++){
                int dx = curX + dirX[dir];
                int dy = curY + dirY[dir];
                if(dx<0||dx>=n||dy<0||dy>=m) continue;
                if(vis[dx][dy]>0 || board[dx][dy]!=1) continue;
                vis[dx][dy]=vis[curX][curY]+1;
                Q.offer(new int[]{dx,dy});
            }
        }
    }
}