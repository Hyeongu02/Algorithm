import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        boolean flag = true;
        Deque<Character> stack = new ArrayDeque<>();
        int answer = 0;
        for(char x : input){
            if(x=='('){
                stack.push(x);
                flag=true;
            }else{
                stack.pop();
                if(flag){
                    answer+=stack.size();
                }else{
                    answer++;
                }
                flag=false;
            }
        }
        System.out.println(answer); 
    }
}
