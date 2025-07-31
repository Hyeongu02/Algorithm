import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Deque<Integer> que = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            int x = Integer.parseInt(br.readLine());
            if(x!=0){
                que.push(x);
            }else{
                que.pop();
            }
        }
        int sum=0;
        while(!que.isEmpty()){
            sum += que.pop();
        }
        System.out.print(sum);
    }
}