import java.io.*;
import java.util.*;

public class Main {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken()); 

        int[][] box = new int[N][M];
        int[][] days = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    days[i][j] = 0; 
                } else {
                    days[i][j] = -1; 
                }
                if (box[i][j] == -1) {
                    days[i][j] = -2; 
                }
            }
        }
        ArrayDeque<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) q.add(new int[]{i, j});
            }
        }

        int maxDay = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (box[nr][nc] != 0) continue;
                if (days[nr][nc] != -1) continue;
                days[nr][nc] = days[r][c] + 1;
                maxDay = Math.max(maxDay, days[nr][nc]);
                q.add(new int[]{nr, nc});
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0 && days[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(maxDay);
    }
}
