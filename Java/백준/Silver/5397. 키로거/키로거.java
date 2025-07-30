import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i< n; i++){
            String input = br.readLine();
            List<Character> list = new LinkedList<>();
            ListIterator<Character> cusor = list.listIterator();

            for(char x : input.toCharArray()){
                switch(x){
                    case '<':
                        if(cusor.hasPrevious()) cusor.previous();
                        break;
                    case '>':
                        if(cusor.hasNext()) cusor.next();
                        break;
                    case '-':
                        if(cusor.hasPrevious()){
                            cusor.previous();
                            cusor.remove();
                        }
                        break;
                    default:
                        cusor.add(x);
                        break;
                }

            }
            StringBuilder sb = new StringBuilder();
            for (char c : list) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}