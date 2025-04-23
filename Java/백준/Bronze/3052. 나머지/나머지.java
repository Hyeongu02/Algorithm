import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        int[] answer = new int[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++){
            answer[Integer.parseInt(br.readLine())%42]++;
        }
        int count=0;
        for(int x: answer){
            if(x!=0) count++;
        }
        System.out.print(count);
    }
}