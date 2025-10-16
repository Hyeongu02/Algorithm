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
        boolean[][] vis = new boolean[n][m];
        for(int i=0; i<n;i++){
            String[] boardLine = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                board[i][j]=Integer.parseInt(boardLine[j]);
            }
        }
        int big =0;
        int count=0;

        Deque<int[]> Q = new ArrayDeque<>();
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==1 && !vis[i][j]){
                    int temp = 1;
                    Q.offer(new int[]{i,j});
                    vis[i][j]=true;
                    count++;
                    while (!Q.isEmpty()) {
                        int[] cur = Q.poll();
                        int curX = cur[0];
                        int curY = cur[1];
                        for(int k=0;k<4;k++){
                            int dx = curX+dirX[k];
                            int dy = curY+dirY[k];
                            if(dx <0 || dx>=n|| dy<0 || dy>=m) continue;
                            if(vis[dx][dy]||board[dx][dy]!=1) continue;
                            vis[dx][dy]=true;
                            Q.offer(new int[]{dx,dy});
                            temp++;
                        }
                    }
                    if(big<temp) big=temp;
                }
            }
        }
        System.out.println(count+"\n"+big);
    }
}
