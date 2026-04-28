import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = 1 << n;
        int count = 0;

        while (size > 1) {
            size /= 2;
            int area = size * size;

            if (r < size && c < size) {
            } else if (r < size && c >= size) {
                count += area;
                c -= size;
            } else if (r >= size && c < size) {
                count += 2 * area;
                r -= size;
            } else {
                count += 3 * area;
                r -= size;
                c -= size;
            }
        }
        System.out.println(count);
    }
}