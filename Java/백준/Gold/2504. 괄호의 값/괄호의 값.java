import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> stack = new ArrayDeque<>();
        String input = br.readLine();
        int temp = 1;
        int answer = 0;
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='('){
                stack.push(c);
                temp*=2;
            }else if(c=='['){
                stack.push(c);
                temp*=3;
            }else if(c==')'){
                if(stack.isEmpty()||stack.peek()!='('){
                    System.out.print(0);
                    return;
                }else if(input.charAt(i-1)=='('){
                    answer+=temp;
                }
                temp/=2;
                stack.pop();
            }else if(c==']'){
                if(stack.isEmpty()||stack.peek()!='['){
                    System.out.print(0);
                    return;
                }else if(input.charAt(i-1)=='['){
                    answer+=temp;
                }
                temp/=3;
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            System.out.print(0);
            return;
        }else{
            System.out.print(answer);
        }
    }
}