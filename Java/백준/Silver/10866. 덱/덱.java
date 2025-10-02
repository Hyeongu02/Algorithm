import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N =Integer.parseInt(br.readLine());
        int[] deque = new int [2*N+1];

        int head = N;
        int tail = N;
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push_front":
                    deque[--head]=Integer.parseInt(input[1]);
                    break;
                case "push_back":
                    deque[tail++]=Integer.parseInt(input[1]);
                    break;
                case "pop_front":
                    if(tail==head){
                        bw.append("-1\n");
                    }else{
                        bw.append(String.valueOf(deque[head++])).append("\n");
                    }
                    break;
                case "pop_back":
                    if(tail==head){
                        bw.append("-1").append("\n");
                    }else{
                        bw.append(String.valueOf(deque[--tail])).append("\n");
                    }
                    break;
                case "size":
                    bw.append(String.valueOf(tail-head)).append("\n");
                    break;
                case "empty":
                    if(tail==head){
                        bw.append("1\n");
                    }else{
                        bw.append("0\n");
                    }
                    break; 
                case "front":
                    if(tail-head<1){
                        bw.append("-1").append("\n");
                    }else{
                        bw.append(String.valueOf(deque[head])).append("\n");
                    }
                    break;  
                case "back":
                    if(tail-head<1){
                        bw.append("-1").append("\n");
                    }else{
                        bw.append(String.valueOf(deque[tail-1])).append("\n");
                    }
                    break;                     
            }
        }
        bw.flush();
    }
}