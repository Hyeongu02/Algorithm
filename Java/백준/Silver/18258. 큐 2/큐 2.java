import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<String> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            switch(input[0]){
                case "push":
                    queue.addFirst(input[1]);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(queue.pollLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append("1").append("\n");
                    }else{
                        sb.append("0").append("\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(queue.peekFirst()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
