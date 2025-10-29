import java.io.*;
import java.util.*;

public class Main{
    static int[][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t= Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int l= Integer.parseInt(br.readLine());
            int[][] board = new int[l][l];
            for(int j=0;j<l;j++){
                for(int k=0; k<l;k++){
                    board[j][k]=-1;
                }
            }
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            Deque<int[]> Q = new ArrayDeque<>();
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = 0;
            Q.offer(new int[]{x,y});
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            while (!Q.isEmpty()) {
                int[] cur = Q.poll();
                if(cur[0]==x&&cur[1]==y){
                    bw.append(board[cur[0]][cur[1]]+"\n");
                    break;
                }
                for(int j=0;j<8;j++){
                    int curX = cur[0] + dir[j][0];
                    int curY = cur[1] + dir[j][1];
                    if(curX<0||curY<0||curX>=l||curY>=l) continue;
                    if(board[curX][curY]>=0) continue;
                    board[curX][curY]= board[cur[0]][cur[1]]+1;
                    Q.offer(new int[]{curX,curY});
                }
            }
        }
        bw.flush();
    }
}
