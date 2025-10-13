import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        boolean flag = false;
        Deque<Character> stack = new ArrayDeque<>();
        int answer = 0;
        for(char x : input){
            if(stack.isEmpty()){
                stack.push(x);
                flag=false;
            }else{
                if(x==')'){
                    if(stack.peek()=='('&&!flag){
                        flag=true;
                        stack.pop();
                        answer+=stack.size();
                    }else{
                        stack.pop();
                        answer++;
                    }
                }else{
                    stack.push(x);
                    flag=false;
                }
            }
        }
        System.out.println(answer);
    }
}
