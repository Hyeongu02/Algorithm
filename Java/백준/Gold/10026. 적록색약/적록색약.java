import java.io.*;
import java.util.*;

public class Main{
    static int[] dirX = {0,1,0,-1};
    static int[] dirY = {1,0,-1,0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        char[][] board = new char[N][N];
        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<N; j++){
                board[i][j]=input.charAt(j);
            }
        }
        
        boolean[][] vis = new boolean[N][N];
        int count =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(vis[i][j]) continue;
                count++;
                Deque<int[]> Q = new ArrayDeque<>();
                Q.offer(new int[]{i,j});
                vis[i][j]=true;
                while (!Q.isEmpty()) {
                    int[] cur = Q.poll();
                    for(int k=0;k<4;k++){
                        int curX = cur[0]+dirX[k];
                        int curY = cur[1]+dirY[k];
                        if(curX<0||curY<0||curX>=N||curY>=N) continue;
                        if(vis[curX][curY]||board[curX][curY]!=board[cur[0]][cur[1]]) continue;
                        vis[curX][curY]=true;
                        Q.offer(new int[]{curX,curY});
                    }
                }
            }
        }
        bw.append(count+" ");
        vis = new boolean[N][N];
        count =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(vis[i][j]) continue;
                count++;
                Deque<int[]> Q = new ArrayDeque<>();
                Q.offer(new int[]{i,j});
                vis[i][j]=true;
                while (!Q.isEmpty()) {
                    int[] cur = Q.poll();
                    for(int k=0;k<4;k++){
                        int curX = cur[0]+dirX[k];
                        int curY = cur[1]+dirY[k];
                        if(curX<0||curY<0||curX>=N||curY>=N) continue;
                        if(vis[curX][curY]) continue;
                        if(board[curX][curY]=='R'||board[curX][curY]=='G'){
                            if(board[cur[0]][cur[1]]!='R'&&board[cur[0]][cur[1]]!='G') continue;
                        }else if(board[cur[0]][cur[1]]!='B'){
                            continue;
                        }
                        vis[curX][curY]=true;
                        Q.offer(new int[]{curX,curY});
                    }
                }
            }
        }
        bw.append(count+"");
        bw.flush();
    }
}