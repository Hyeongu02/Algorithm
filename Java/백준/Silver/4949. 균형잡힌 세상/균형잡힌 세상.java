import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Character> stack = new ArrayDeque<>();
        while (true) {
            char[] input = br.readLine().toCharArray();
            stack.clear();
            if(input[0]=='.'){
                bw.flush();
                break;
            }else{
                for(int i=0; i<input.length; i++){
                    if(input[i]=='('||input[i]==')'||input[i]=='['||input[i]==']'){
                        if(!stack.isEmpty()){
                            if(input[i]==')'&&stack.peekLast()==input[i]-1){
                                stack.pollLast();
                            }else if(input[i]==']'&&stack.peekLast()==input[i]-2){
                                stack.pollLast();
                            }else{
                                stack.addLast(input[i]);
                            }
                        }else{
                            stack.addLast(input[i]);
                        }
                    }
                }
                if(stack.isEmpty()){
                    bw.append("yes\n");
                }else{
                    bw.append("no\n");
                }
            }
        }
    }
}