import java.util.*;
import java.io.*;

public class Main {
    static int[] dirX = {1, 0, -1, 0};
    static int[] dirY = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] board = new char[R][C];
        int[][] distJi = new int[R][C];
        int[][] distFire = new int[R][C];
        Deque<int[]> QJi = new ArrayDeque<>();
        Deque<int[]> QFire = new ArrayDeque<>();
        
        for(int i=0; i<R; i++){
            String input = br.readLine();
            for(int j=0; j<C; j++){
                board[i][j]=input.charAt(j);
                if(board[i][j]=='J') {
                    if(i==R-1||j==C-1||i==0||j==0){
                        System.out.print(1);
                        return;
                    }
                    QJi.offer(new int[]{i,j});
                    distJi[i][j]=1;
                }
                if(board[i][j]=='F'){
                    QFire.offer(new int[]{i,j});
                    distFire[i][j]=1;
                } 
            }
        }
        
        while (!QFire.isEmpty()) {
            int[] cur = QFire.poll();
            int curX= cur[0];
            int curY= cur[1];
            for(int dir=0; dir<4; dir++){
                int dX = curX + dirX[dir];
                int dY = curY + dirY[dir];
                if(dX<0||dY<0||dX>=R||dY>=C) continue;
                if(board[dX][dY] =='#' || distFire[dX][dY]>0) continue;
                distFire[dX][dY]=distFire[curX][curY]+1;
                QFire.offer(new int[]{dX,dY});
            }
        }
        while (!QJi.isEmpty()) {
            int[] cur = QJi.poll();
            int curX= cur[0];
            int curY= cur[1];
            for(int dir=0; dir<4; dir++){
                int dX = curX + dirX[dir];
                int dY = curY + dirY[dir];
                if(dX<0||dY<0||dX>=R||dY>=C) continue;
                if(board[dX][dY] =='#' || board[dX][dY] =='F' || distJi[dX][dY]>0) continue;
                distJi[dX][dY]=distJi[curX][curY]+1;
                if(distJi[dX][dY]>=distFire[dX][dY]&&distFire[dX][dY]!=0){
                    continue;
                }
                if(dX==0||dY==0||dX==R-1||dY==C-1) {
                    System.out.print(distJi[dX][dY]);
                    return;
                }
                QJi.offer(new int[]{dX,dY});
            }
        }
        System.out.print("IMPOSSIBLE");
    }
}