import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        boolean flag1 = false;
        boolean flag2 = false;
        Deque<Long> stack = new ArrayDeque<>();
        long answer = 0;
        long tmp = 0;
        
        for(char x : input){
            if(x ==')'){
                if(flag1){
                    stack.pop();
                    stack.push(2L+ 100);
                }else{
                    if(stack.isEmpty()){
                        System.out.println(0);
                        return;
                    }
                    while(!stack.isEmpty()) {
                        if(stack.peek()=='[') {
                            System.out.println(0);
                            return;
                        }
                        if(stack.peek()=='('){
                            stack.pop();
                            stack.push(tmp*2+100L);
                            break;
                        }else{
                            tmp += stack.pop()-100;
                        }
                    }
                }
                if(stack.isEmpty()&&tmp>0){
                    System.out.println(0);
                    return;
                }else{
                    tmp=0;
                }
                flag1=false;
                flag2=false;
            }else if(x ==']'){
                if(flag2){
                    stack.pop();
                    stack.push(3L+ 100);
                }else{
                    if(stack.isEmpty()){
                        System.out.println(0);
                        return;
                    }
                    while(!stack.isEmpty()) {
                        if(stack.peek()=='(') {
                            System.out.println(0);
                            return;
                        }
                        if(stack.peek()=='['){
                            stack.pop();
                            stack.push(tmp*3+100L);
                            break;
                        }else{
                            tmp += stack.pop()-100;
                        }
                    }
                }
                if(stack.isEmpty()&&tmp>0){
                    System.out.println(0);
                    return;
                }else{
                    tmp=0;
                }
                flag1=false;
                flag2=false;
            }else{
                stack.push((long)x);
                if(x=='('){
                    flag1=true;
                    flag2=false;
                }else{
                    flag2=true;
                    flag1=false;
                }
            }
        }

        while (!stack.isEmpty()) {
            if(stack.peek()<100){
                System.out.println(0);
                return;
            }else{
                answer+=stack.pop()-100;
            }
        }
        System.out.println(answer);
    }
}