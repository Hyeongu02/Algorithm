import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int max= 1;
        while(x>(max*(max+1))/2){
            max++;
        }
        
        if(max%2==0){
            System.out.println(x-((max-1)*max)/2+"/"+(max-(x-((max-1)*max)/2)+1));
        }else{
            System.out.println((max-(x-((max-1)*max)/2)+1)+"/"+(x-((max-1)*max)/2));
        }
	}
}
