import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        List<Integer> list = new ArrayList<>(n);
        for(int i=1; i<n+1; i++){
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int index = 0;
        while(!list.isEmpty()){
            index = (index+k-1)%list.size();
            int del = list.remove(index);
            sb.append(del);
            if(!list.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}