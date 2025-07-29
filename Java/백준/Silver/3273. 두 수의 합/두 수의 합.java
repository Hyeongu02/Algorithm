import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new  HashSet<>();
        int count=0;
        int tmp=0;
        for(String arrItem : arr){
            tmp=Integer.parseInt(arrItem);
            if(set.contains(x-tmp)){
                count++;
            }
            set.add(tmp);
        }
        System.out.print(count);
    }
}