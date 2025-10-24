import java.io.*;
import java.util.*;

public class Main {
    static int[] dirX = {0, 1, 0, -1};
    static int[] dirY = {1, 0, -1, 0};
    static int M, N;
    static int[][] board;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            board = new int[M][N];
            visit = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            int count = 0;

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (board[j][k] == 1 && !visit[j][k]) {
                        dfs(j, k);
                        count++;
                    }
                }
            }

            bw.append(count + "\n");
        }

        bw.flush();
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (board[nx][ny] == 0 || visit[nx][ny]) continue;

            dfs(nx, ny);
        }
    }
}