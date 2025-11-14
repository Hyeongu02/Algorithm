import java.util.*;
import java.io.*;

public class Main{
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            char[][] board = new char[h][w];
            int[][]visFire=new int[h][w];
            int[][]visH=new int[h][w];
            Deque<int[]> QFire = new ArrayDeque<>();
            Deque<int[]> QH= new ArrayDeque<>();
            for(int j=0;j<h;j++){
                String input = br.readLine();
                for(int k=0;k<w;k++){
                    board[j][k]=input.charAt(k);
                    if(board[j][k]=='@') {
                        QH.offer(new int[]{j,k});
                        visH[j][k]=1;
                    }
                    else if(board[j][k]=='*'){
                        QFire.offer(new int[]{j,k});
                        visFire[j][k]=1;
                    }
                }
            }
            while (!QFire.isEmpty()) {
                int[] cur = QFire.poll();
                for(int j=0;j<4;j++){
                    int curX = cur[0]+dir[j][0];
                    int curY = cur[1]+dir[j][1];
                    if(curX<0||curY<0||curX>=h||curY>=w) continue;
                    if(visFire[curX][curY]>0||board[curX][curY]=='#'||board[curX][curY]=='@') continue;
                    visFire[curX][curY]=visFire[cur[0]][cur[1]]+1;
                    QFire.offer(new int[]{curX,curY});
                }
            }
            boolean flag = false;
            while (!QH.isEmpty()) {
                int[] cur = QH.poll();
                for (int j = 0; j < 4; j++) {
                    int curX = cur[0] + dir[j][0];
                    int curY = cur[1] + dir[j][1];
                    if (curX < 0 || curY < 0 || curX >= h || curY >= w) {
                        bw.append(visH[cur[0]][cur[1]] + "\n");
                        flag = true;
                        QH.clear();
                        break;
                    }
                    if (board[curX][curY] == '#' || board[curX][curY] == '*' || visH[curX][curY] > 0) continue;
                    if (visFire[curX][curY] != 0 && visFire[curX][curY] <= visH[cur[0]][cur[1]] + 1) continue;
                    visH[curX][curY] = visH[cur[0]][cur[1]] + 1;
                    QH.offer(new int[]{curX, curY});
                }
            }
            if(!flag) bw.append("IMPOSSIBLE\n");
        }
        bw.flush();
    }
}