import java.io.*;
import java.util.*;

public class Main {
    static final int[] dx = {0, 1, 0, -1};
    static final int[] dy = {1, 0, -1, 0};
    static int M, N;
    static int[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            board = new int[M][N];
            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }
            int worms = 0;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1) {
                        worms++;
                        board[i][j] = 0;
                        q.offer(i * N + j);
                        while (!q.isEmpty()) {
                            int cur = q.poll();
                            int x = cur / N;
                            int y = cur % N;
                            for (int d = 0; d < 4; d++) {
                                int nx = x + dx[d];
                                int ny = y + dy[d];
                                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                                if (board[nx][ny] == 0) continue;
                                board[nx][ny] = 0;
                                q.offer(nx * N + ny);
                            }
                        }
                    }
                }
            }
            sb.append(worms).append('\n');
        }
        System.out.print(sb);
    }
}