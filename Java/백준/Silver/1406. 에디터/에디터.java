import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new LinkedList<>();
        for(char c : br.readLine().toCharArray()){
            list.add(c);
        }
        String input = null;
        int M =Integer.parseInt(br.readLine());
        ListIterator<Character> cursor = list.listIterator(list.size());
        for(int i=0; i<M;i++){
            input = br.readLine();
            switch (input.charAt(0)) {
                case 'L':
                    if(cursor.hasPrevious()){
                        cursor.previous();
                    }
                    break;
                case 'D':
                    if(cursor.hasNext()){
                        cursor.next();
                    }
                    break;
                case 'B':
                    if(cursor.hasPrevious()){
                        cursor.previous();  
                        cursor.remove();   
                    }
                    break;
                case 'P':
                    cursor.add(input.charAt(2));
                    break;
            }
        }
        StringBuilder sb =new StringBuilder();
        for(char c:list){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}