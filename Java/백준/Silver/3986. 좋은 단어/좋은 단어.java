import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer= 0;
        Deque<Character> stack = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            char[] input = br.readLine().toCharArray();
            stack.clear();
            for(char x : input){
                if(!stack.isEmpty()){
                    if(stack.peekLast()==x){
                        stack.pollLast();
                    }else{
                        stack.add(x);
                    }
                }else{
                    stack.add(x);
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
        System.out.println(answer);
    }
}