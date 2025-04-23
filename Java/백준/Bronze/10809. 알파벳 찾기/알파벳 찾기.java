import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] answer = new int[26];
        Arrays.fill(answer, -1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String input= br.readLine();
        for(int i=0; i<input.length();i++){
            if(answer[input.charAt(i)-'a']==-1) answer[input.charAt(i)-'a']=i;
        }
        for(int y: answer){
            bw.append(String.valueOf(y));
            bw.append(" ");
        }
        bw.flush();
        bw.close();
    }
}
