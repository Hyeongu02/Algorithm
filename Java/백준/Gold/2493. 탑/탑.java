import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(input[i]);
        }

        Deque<int[]> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
    
        for(int i=0; i<N; i++){
            int height = heights[i];
            while (!stack.isEmpty() && stack.peek()[0] < height) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                sb.append("0 ");
            } else {
                sb.append(stack.peek()[1]).append(" ");
            }
            stack.push(new int[]{height, i + 1});
        }
        System.out.println(sb.toString());
    }
}