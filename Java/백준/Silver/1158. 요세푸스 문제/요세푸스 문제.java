import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> list = new LinkedList<>();
        List<Integer> answerList = new LinkedList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        ListIterator<Integer> cusor = list.listIterator();
        while(list.size()>0){
            for(int i=0;i<k;i++){
                if(!cusor.hasNext())cusor = list.listIterator();
                cusor.next();
            }
            if (!cusor.hasPrevious()) {
                cusor = list.listIterator(list.size());
            }
            int removed = cusor.previous(); 
            cusor.next(); 
            cusor.remove(); 

            if (list.isEmpty()) {
                sb.append(removed).append(">");
            } else {
                sb.append(removed).append(", ");
            }
        }
        System.out.print(sb.toString());
    }
}