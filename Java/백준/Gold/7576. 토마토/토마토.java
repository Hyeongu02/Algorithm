import java.util.*;
import java.io.*;

public class Main {
    static int[] dirX = {1,0,-1,0};
    static int[] dirY = {0,1,0,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int[][] board = new int[N][M];
        int[][] day =new int[N][M];
        Deque<int[]> Q = new ArrayDeque<>();
        int countZ = 0;
        int countN = 0;
        int lastDay = 0;
        for(int i=0; i<N;i++){
            String[] boardLine = br.readLine().split(" ");
            for(int j=0; j<M;j++){
                if(boardLine[j].equals("1")) {
                    Q.offer(new int[]{i,j});
                }if(boardLine[j].equals("0")) {
                    countZ++;
                }
                board[i][j]=Integer.parseInt(boardLine[j]);
            }
        }
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int curX = cur[0];
            int curY = cur[1];
            for(int i=0;i<4;i++){
                int dX= curX + dirX[i];
                int dY= curY + dirY[i];
                if(dX<0 || dX>=N || dY<0 || dY>=M) continue;
                if(day[dX][dY]>0 || board[dX][dY]==-1 || board[dX][dY]==1) continue;
                countN++;
                day[dX][dY]=day[curX][curY]+1;
                Q.offer(new int[]{dX,dY});
                lastDay=day[curX][curY]+1;
            }
        }
        if(countZ==countN){
            System.out.print(lastDay);
        }else {
            System.out.print(-1);
        }
    }
}